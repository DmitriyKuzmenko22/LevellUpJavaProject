package com.levelup;

import com.levelup.dao.DAO;
import com.levelup.dao.DataProvider;
import com.levelup.dao.impl.CitizenJSONDAOImpl;
import com.levelup.dao.impl.FileDataProviderImpl;
import com.levelup.dao.impl.StreetCSVDAOImpl;
import com.levelup.entity.Street;
import com.levelup.view.MyDataTableFrame;
import com.levelup.view.impl.CitizenTablePanel;

import javax.swing.*;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by java on 10.01.2017.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        new MyDataTableFrame();




//        FileDataProviderImpl provider = new FileDataProviderImpl("");
//
//        DAO<Street> streetDAO = new StreetCSVDAOImpl(provider, "street.csv");
//
//        provider.openConnection();
//
//        streetDAO.create(new Street(7L, "Topolia_1"));
//
//        ArrayList<Street> streets = streetDAO.read();
//
//        System.out.println(streets);
//    }

    }
}
