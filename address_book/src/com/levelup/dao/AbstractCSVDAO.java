package com.levelup.dao;

import com.levelup.dao.impl.FileDataProviderImpl;
import com.levelup.entity.Entity;
import com.sun.xml.internal.bind.v2.TODO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by java on 28.02.2017.
 */
public abstract class AbstractCSVDAO<T extends Entity> extends AbstractFileDAO<T> {

    private static final Logger LOG = Logger.getLogger(AbstractCSVDAO.class.getName());

    private final String HEADER_CSV;

    public AbstractCSVDAO(DataProvider fileDataProvider, String fileName, String header_csv) {
        super(fileDataProvider, fileName);
        HEADER_CSV = header_csv;
    }

    protected abstract T parseEntity(final String str);

    public abstract String viewEntity(T entity);

    @Override
    public void create(final T t) {// к примеру изменить список улиц у всех пользователей
        try {
            RandomAccessFile file = getDataFile();
            if ((t.getId() == null) || (t.getId() == 0L)) {// ne primitiv, eto object
                t.setId(getNextId());
            }
            if (file.length() < (HEADER_CSV.length())) {
                file.write((HEADER_CSV + "\n").getBytes());//добавляем перевод строки
            } else {
                file.seek(file.length());//записіваем с последней строки
            }
            // preobrazovat v stroky i srazy zapisivaem потом получаем байты

            file.write(viewEntity(t).getBytes());
        } catch (IOException ex) {
            LOG.log(Level.INFO, "create entity error", ex);
        }
    }


    @Override
    public ArrayList<T> read() {
        ArrayList<T> result = new ArrayList();
        try {
            RandomAccessFile file = getDataFile();
            file.seek(0);
            String str;

            int position = HEADER_CSV.length() + 1;
            file.seek(position);
            // read lines till the end of the stream
            while ((str = file.readLine()) != null) {
                result.add(parseEntity(str));// мі распарсили весь файл и положили в наш с список
            }
        } catch (IOException e) {
            System.out.println("Error get info from file JSON (Street)");
        }
        return result;
    }

    @Override
    public void update(final T t) {
        try {
            RandomAccessFile file = getDataFile();
            String buffer = "";
            file.seek(0);
            String str;
            int[] startAndEndOfStr = getStartAndEndOfStr(file, t);
            int start = startAndEndOfStr[0];
            int end = startAndEndOfStr[1];
            file.seek(end);
            while ((str = file.readLine()) != null) {
                buffer += str + "\n";
            }
            file.seek(start);
            String s = viewEntity(t);
            s += (end + 1) < file.length() ? "\n" : "\n";
            file.write(s.getBytes());
            file.write(buffer.getBytes());
            file.setLength(start + s.length() + buffer.length() - 1);
        } catch (IOException e) {
            System.out.println("Error get info from file JSON (Street)");
        }
    }

    @Override
    public void delete(final T t) {
        try {
            RandomAccessFile file = getDataFile();
            String buffer = "";
            file.seek(0);
            String str;
            int startAndEndOfStr[] = getStartAndEndOfStr(file, t);
            int start = startAndEndOfStr[0];
            int end = startAndEndOfStr[1];
            file.seek(end);
            while ((str = file.readLine()) != null) {
                buffer += str + "\n";
            }
            file.seek(start);
            file.write(buffer.getBytes());
            file.setLength(start + buffer.length() - 1);
        } catch (IOException e) {
            System.out.println("Error get info from file JSON (Street)");
        }
    }
  /*  @Override
    public void delete(T entity) {
        try {
            RandomAccessFile file = null;
            ArrayList<T> list = new ArrayList<>();
            file = getDataFile();
            long [] startAndEnd = getStartAndEndOfStr(file, entity); //находим начало и конечно необходимых символов
            if (startAndEnd[0] == 0 && startAndEnd[1] == 0) { //esli rovno null i ne nawli id
                System.out.println("This entity is not found in target file");
                return;
            }
            file.seek(startAndEnd[1]);//переходим в конец строки которую нужно удалить(ставим курсор)

            String line;
            while ((line = file.readLine()) != null) { //записываем все что после строки которую нужно удалить (запись в лист)
                list.add(parseEntity(line));
            }

            file.setLength(startAndEnd[0]-2L); // с записанного лист, записываем текст с файл (курсор стоит на месте ИД которо нужно удалить) перезаписываем вместо удаляемой строки
            for (T e:list) {
                create(e);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    @Override
    public T getOneById(final long id) {
        T t = null;
        String str;
        try {
            RandomAccessFile file = getDataFile();
            while ((str = file.readLine()) != null) {
                if (str.contains("" + id)) {
                    t = parseEntity(str);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t;
    }

    @Override
    protected long initMaxId() {
        long maxId = 0;
        try {
            RandomAccessFile file = getDataFile();
            file.seek(0);
            String str = "";
            while ((str = file.readLine()) != null) {
                if (!str.contains("id")) {
                    long id = Long.parseLong(str.split(";")[0]);
                    if (maxId < id) maxId = id;
                }
            }
        } catch (IOException e) {
            LOG.log(Level.INFO, "error during initialization id", e);
        }
        return maxId;
    }
    //будем візівать в делит и апдейт этот метод
/*    public long[] getStartAndEndOfStr(RandomAccessFile file, T entity) {
        long[] arr = new long[2];

        String line;

        try {
            file.seek((HEADER_CSV+"\r\n").length());// переходим на следующую строку , нам нужно вернутся на позицию после нашего заголовка

            while ((line = file.readLine()) != null) {
                if (line.startsWith(  entity.getId()+";")){ //если айди 4 найдем 4ю запись
                    arr[1] = file.getFilePointer(); //konec stroki
                    arr[0] = file.getFilePointer() - line.length();//ищем начало строки
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arr;
    }*/
    public int[] getStartAndEndOfStr(RandomAccessFile file, T t) throws IOException {
        int[] arr = new int[2];
        int start = 0;
        int end = 0;
        boolean found = false;
        String str = "";
        while ((str = file.readLine()) != null && !found) {
            if (str.startsWith("" + t.getId() + ";")) {
                found = true;
            }
            if (!found) {
                start += str.length() + 1;
                arr[0] = start;
            } else {
                end = start + str.length() + 1;
                arr[1] = end;
            }
        } return arr;
    }
}
