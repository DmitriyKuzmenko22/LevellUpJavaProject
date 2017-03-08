package com.levelup.dao.impl;

import com.levelup.dao.AbstractJSONDAO;
import com.levelup.dao.DataProvider;
import com.levelup.entity.Citizen;
import com.levelup.entity.Street;

/**
 * Created by Дмитрий on 06.03.2017.
 */
public class StreetJSONDaoImpl extends AbstractJSONDAO<Street> {
    public StreetJSONDaoImpl(DataProvider fileDataProvider, String fileName) {
        super(fileDataProvider, fileName, "{\"streetList: [");
    }

    @Override
    protected Street parseEntity(String str) {
        str=str.trim().replaceAll("[\",\\s{]]|id|firstName|lastName|age|streetId","");
        String[] params = str.split(":");

        long id=Long.parseLong(params[1]);
        String streetName=params[2];

        return new Street(id,streetName);
    }

    @Override
    public String viewEntity(Street entity) {
        return entity.getId() + ";" + entity.getStreetName() + "\r\n";
    }
}
