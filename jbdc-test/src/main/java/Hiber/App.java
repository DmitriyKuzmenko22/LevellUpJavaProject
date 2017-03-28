package Hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import static Hiber.HibernateUtil.getSessionFactory;

public class App {
    public static void main(String[] args) {

        SessionFactory sessionFactory= getSessionFactory();

//        Session session=sessionFactory.openSession();
//
//        session.createQuery("", User.class);
    }
}
