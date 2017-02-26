package com.levelup.dao;

import com.levelup.dao.impl.AbstractFileDAO;
import com.levelup.dao.impl.FileDataProvider;

/**
 * Created by Дмитрий on 26.02.2017.
 */
public class AbstractCSVDAO extends AbstractFileDAO<T> {

    protected AbstractCSVDAO(final FileDataProvider fileDataProvider,String fileName,final String HEADER_CSV){
        super(fileDataProvider,fileName);
        this.HEADER_CSV=HEADER_CSV;
    }

}
