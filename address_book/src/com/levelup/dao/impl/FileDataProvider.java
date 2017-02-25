package com.levelup.dao.impl;

import com.levelup.dao.DataProvider;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by java on 24.02.2017.
 */
public class FileDataProvider implements DataProvider{
    private static final String READ_WRITE_ACCES="rw";
    private Map<String,RandomAccessFile> dataMap=new HashMap<>();
    private StringBuilder files=new StringBuilder();
    private final String directoryPath;

    public FileDataProvider(String directoryPath) {
        this.directoryPath = directoryPath;
    }

    public RandomAccessFile getDataFile(String fileName) throws FileNotFoundException {
        if (dataMap.containsKey(fileName)){
            return dataMap.get(fileName);
        }

        File file=new File(directoryPath+File.pathSeparator+fileName);// po etomy puti

        RandomAccessFile randomAccessFile = new RandomAccessFile(file,READ_WRITE_ACCES);
        dataMap.put(fileName,randomAccessFile);
        return randomAccessFile;
    }

    @Override
    public void openConnection() {

    }

    @Override
    public void closeConnection() {

    }

    public void appendFile(final String fileName){
        files.append(fileName+";");
    }
}