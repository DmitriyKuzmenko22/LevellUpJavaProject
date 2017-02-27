package com.levelup.dao.impl;

import com.levelup.dao.AbstractCSVDAO;
import com.levelup.entity.Street;

/**
 * Created by Дмитрий on 27.02.2017.
 */
public class StreetCSVDAO extends AbstractCSVDAO<Street> {
    protected StreetCSVDAO(FileDataProvider fileDataProvider, String fileName, String HEADER_CSV) {
        super(fileDataProvider, fileName, HEADER_CSV);
    }



    @Override
    public String viewEntity(final Street street) {
        return String.format("%d;%s",street.getId(),street.getStreetName());
    }

    @Override
    protected T parseEntity(final String str) {
        String[]arr=str.split(";");
        return new Street(Long.parseLong(arr[0],arr[1]));
    }
}
