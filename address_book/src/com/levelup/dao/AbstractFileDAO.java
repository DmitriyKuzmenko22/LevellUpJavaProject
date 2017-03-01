package com.levelup.dao;

import com.levelup.dao.impl.FileDataProviderImpl;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by andrey on 27.02.17.
 */
public abstract class AbstractFileDAO<T> implements DAO<T> {

    private Long id;
    protected final FileDataProviderImpl fileDataProvider;// получать рандом єксесс файл
    private String fileName;

    public AbstractFileDAO(FileDataProviderImpl fileDataProvider, String fileName) {
        this.fileDataProvider = fileDataProvider;
        this.fileName = fileName;
        fileDataProvider.appendFile(fileName);// стрингбилдерс , создать рандом аксес файл для каждого переданного файла и проинициализировать мапу
    }

    public RandomAccessFile getDataFile() throws IOException {
        return fileDataProvider.getDataFile(fileName);
    }

    public String getFileName() {
        return fileName;
    }
}
