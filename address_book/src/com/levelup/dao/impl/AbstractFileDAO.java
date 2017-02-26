package com.levelup.dao.impl;

import com.levelup.dao.DAO;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 * Created by Дмитрий on 26.02.2017.
 */
public class AbstractFileDAO implements DAO<T> {

    private Long id;
    protected final FileDataProvider fileDataProvider;
    private String fileName;

    public AbstractFileDAO(FileDataProvider fileDataProvider, String fileName){
        this.fileDataProvider=fileDataProvider;
        this.fileName=fileName;
        fileDataProvider.appendFile(fileName);
    }

    public RandomAccessFile getDataFile() throws FileNotFoundException {
        return fileDataProvider.getDataFile(fileName);
    }


    @Override
    public void create(T t) {

    }

    @Override
    public ArrayList<T> read() {
        return null;
    }

    @Override
    public void update(T t) {

    }

    @Override
    public void delete(T t) {

    }
}
