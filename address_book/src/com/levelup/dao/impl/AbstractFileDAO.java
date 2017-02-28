package com.levelup.dao.impl;

import com.levelup.dao.DAO;

import java.io.IOException;
import java.io.RandomAccessFile;

public abstract class AbstractFileDAO<T> implements DAO<T>
{
    private Long id;
    protected final FileDataProviderImpl fileDataProvider;// получать рандом єксесс файл
    private String fileName;//

    public AbstractFileDAO(FileDataProviderImpl fileDataProvider, String fileName){
        this.fileDataProvider = fileDataProvider;
        this.fileName = fileName;
        fileDataProvider.appendFile(fileName);// стрингбилдерс , создать рандом аксес файл для каждого переданного файла и проинициализировать мапу
    }

    public RandomAccessFile getDataFile() throws IOException{

        return fileDataProvider.getDataFile(fileName);
    }

//    public Long getId(){
//        return id;
//    }

    public String getFileName(){
        return fileName;
    }
}
