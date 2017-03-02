package com.levelup.dao;

import com.levelup.dao.impl.FileDataProviderImpl;
import com.levelup.entity.Entity;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 * Created by java on 28.02.2017.
 */
public abstract class AbstractCSVDAO<T extends Entity> extends AbstractFileDAO<T> {

    private final String HEADER_CSV;

    public AbstractCSVDAO(FileDataProviderImpl fileDataProvider, String fileName, String header_csv) {
        super(fileDataProvider, fileName);
        HEADER_CSV = header_csv;
    }
    // striky preobraz neobhod
    protected abstract T parseEntity(final String str);

    public abstract String viewEntity(T entity);

    //будем візівать в делит и апдейт этот метод
    public long[] getStartAndEndOfStr(RandomAccessFile file, T entity) {
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
    }
    //4tenie iz faula
    @Override
    public ArrayList<T> read() {
        ArrayList<T> list = new ArrayList<>();//4to bi ne sly4ilos null ne vernem

        RandomAccessFile file = null;
        try {
            file = getDataFile();
            file.seek(0);
            String line;
            while ((line=file.readLine())!=null){ // 4itaem stroku i ona ne null
                if (line.contains(HEADER_CSV)) continue; //else stroka soderjit zagolovok to propeskaem strky (ud i t/d)
                list.add(parseEntity(line));// мі распарсили весь файл и положили в наш с список
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public void create(T entity) {// к примеру изменить список улиц у всех пользователей
        try {
            RandomAccessFile file = getDataFile();
            file.seek(file.length());//записіваем с последней строки

            // preobrazovat v stroky i srazy zapisivaem потом получаем байты
            file.write(viewEntity(entity).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(T t) {

    }

    @Override
    public void delete(T entity) {
        try {
            RandomAccessFile file = null;
            ArrayList<T> list = new ArrayList<>();
            file = getDataFile();
            long [] startAndEnd = getStartAndEndOfStr(file, entity);
            if (startAndEnd[0] == 0 && startAndEnd[1] == 0) {
                System.out.println("This entity is not found in target file");
                return;
            }
            file.seek(startAndEnd[1]);

            String line;
            while ((line = file.readLine()) != null) {
                list.add(parseEntity(line));
            }

            file.setLength(startAndEnd[0]-2L);
            for (T e:list) {
                create(e);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
