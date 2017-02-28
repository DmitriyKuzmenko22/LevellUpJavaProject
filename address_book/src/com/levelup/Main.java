package com.levelup;

import com.levelup.dao.DAO;
import com.levelup.dao.impl.FileDataProviderImpl;
import com.levelup.dao.impl.StreetCSVDAOImpl;
import com.levelup.entity.Street;

import java.util.ArrayList;


/**
 * Created by java on 10.01.2017.
 */
public class Main {

    public static void main(String[] args) {
     //   new MyDataTableFrame();

        FileDataProviderImpl provider=new FileDataProviderImpl("");

        DAO<Street> streetDAO = new StreetCSVDAOImpl(provider, "street.csv");//peredali imya faula

        provider.openConnection();// создает рандм аксес файлі для каждого коннекта

        ArrayList<Street> streets = streetDAO.read();
        System.out.println(streets);

        streetDAO.create(new Street(6L,"Artema5"));
       // streetDAO.create(new Street(9L,"Topol5"));

     /*   if (line.startwith(id)){
            end=file.getFilePointer();
            start=end-line.lenght();*/
        }
    }
//

