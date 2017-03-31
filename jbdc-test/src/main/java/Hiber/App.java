package hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Date;
import java.util.List;

import static hiber.HibernateUtil.getSessionFactory;

public class App {
    public static void main(String[] args) {

        SessionFactory sessionFactory = getSessionFactory();
       // Employee employee = new Employee();


        Session session = sessionFactory.openSession();
        Employee employee1=new Employee("Anton","Terikhov","Vasilevich",45000);

       Transaction transaction= session.getTransaction();
        transaction.begin();
        session.save(employee1);
        transaction.commit();

        Query<Employee> query = session.createQuery("from Employee ", Employee.class);

        List<Employee> list = query.list();
                for (Employee e :
                list) {
            System.out.println(e);
        }

        session.close();


//        Session session=sessionFactory.openSession();
//
//        session.createQuery("", User.class);
    }
}
