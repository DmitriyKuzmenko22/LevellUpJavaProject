package com.levelup.dao;

import com.levelup.dao.impl.AbstractFileDAO;
import com.levelup.dao.impl.FileDataProvider;

import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 * Created by Дмитрий on 26.02.2017.
 */
public abstract class AbstractCSVDAO extends AbstractFileDAO<T> {

    protected AbstractCSVDAO(final FileDataProvider fileDataProvider,String fileName,final String HEADER_CSV){
        super(fileDataProvider,fileName);
        this.HEADER_CSV=HEADER_CSV;
    }

    public void create(final T t){

    }
    public ArrayList<T> read(){

    }

    public void update(final T t){

    }

    public void delete(final T t){

    }
    public T getOneByld(final long id){

    }
    public abstract String viewEntity(T t);

    protected abstract T parseEntity(final String str);

    public int[] getStrtAndOfStr(RandomAccessFile file,T t){

    }



}
