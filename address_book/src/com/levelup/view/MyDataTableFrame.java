package com.levelup.view;

import com.levelup.dao.DAO;
import com.levelup.dao.DataProvider;
import com.levelup.dao.impl.CitizenCSVDAOImpl;
import com.levelup.dao.impl.CitizenJSONDAOImpl;
import com.levelup.dao.impl.FileDataProviderImpl;
import com.levelup.entity.Citizen;
import com.levelup.view.impl.CitizenTablePanel;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Алексей on 12.01.2017.
 */
public class MyDataTableFrame extends JFrame {

    public MyDataTableFrame() throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        init();
    }

    public void init() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        Properties properties=new Properties();
        properties.load(new FileInputStream("co nfig.properties"));

        String citizenDaoClass=properties.getProperty("citizen.dao");

        Class.forName(citizenDaoClass).newInstance();


        Container container = getContentPane();

        TabbedPane tabbedPane = new TabbedPane();

        DataProvider provider=new FileDataProviderImpl();//принимает название директорий
        DAO<Citizen> citizenDAO=new CitizenJSONDAOImpl(provider,"citizen.json");

        CitizenTablePanel citizenTablePanel = new CitizenTablePanel(citizenDAO);
        tabbedPane.add(citizenTablePanel);

        container.add(tabbedPane, BorderLayout.CENTER);
        container.add(new ToolPanel(tabbedPane,provider), BorderLayout.PAGE_END);

        setBounds(0, 0, 800, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }


}
