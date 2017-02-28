package com.levelup.dao;

import com.levelup.dao.impl.AbstractFileDAO;
import com.levelup.dao.impl.FileDataProviderImpl;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 * Created by Дмитрий on 26.02.2017.
 */
public abstract class AbstractCSVDAO<T> extends AbstractFileDAO<T> {

    private final String HEADER_CSV;

    protected AbstractCSVDAO(final FileDataProviderImpl fileDataProviderImpl, String fileName, final String header_csv) {
        super(fileDataProviderImpl, fileName);
        this.HEADER_CSV = header_csv;
    }

    // striky preobraz neobhod

    protected abstract T parseEntity(final String str);

    public abstract String viewEntity(T entity);

    //4tenie iz faula
    @Override
    public ArrayList<T> read(){
        ArrayList<T> list = new ArrayList<>();//4to bi ne sly4ilos null ne vernem

        RandomAccessFile file= null;
        try {
            file = getDataFile();
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
    public void create(T entity) { // к примеру изменить список улиц у всех пользователей
        try {
            RandomAccessFile file=getDataFile();

            // preobrazovat v stroky i srazy zapisivaem потом получаем байты
            file.write(viewEntity(entity).getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
