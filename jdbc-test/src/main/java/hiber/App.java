//package hiber;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.query.Query;
//
//import java.util.Date;
//import java.util.List;
//
//import static hiber.HibernateUtil.getSessionFactory;
//
///**
// * Created by java on 28.03.2017.
// */
//public class App {
//
//    public static void main(String[] args) {
////
////        Employee employee = new Employee();
//
//
//
//        try (        SessionFactory sessionFactory = getSessionFactory();
//
//                     Session session = sessionFactory.openSession()) {
//
//
//
//           Query<Department> departmentQuery= session.createQuery("from Department where id= :id",Department.class);
//
//            departmentQuery.setParameter("id",1L);
//
//            Department department=departmentQuery.uniqueResult();
//
//
//            Employee employee = new Employee("Andrey", "Ivanov", "Robertovich", 55000,new Date(),department);
//
//            PhoneNumber phoneNumber =new PhoneNumber("380930000000",employee);
//
//            Transaction transaction = session.getTransaction();
//            transaction.begin();
//            session.save(employee);
//            session.save(phoneNumber);
//           transaction.commit();
//
//            //Query<Employee> query = session.createQuery("from Employee", Employee.class);
//            Query<Employee> query = session.createQuery("from Employee", Employee.class);
//            List<Employee> list = query.list();
//
//            for (Employee e : list) {
//                System.out.println(e);
//            }
//
//        } finally {
//            System.out.println("Good bye!");
//        }
//    }
//}
//
package hiber;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.awt.*;
import java.util.Date;
import java.util.List;

import static hiber.HibernateUtil.getSessionFactory;

/**
 * Created by java on 28.03.2017.
 */
public class App {

    public static void main(String[] args) {
        try (SessionFactory sessionFactory = getSessionFactory(); Session session = sessionFactory.openSession();) {

            Query<Department> departmentQuery = session.createQuery("from Department where id = :id", Department.class);
            departmentQuery.setParameter("id", 1L);

            Department department = departmentQuery.uniqueResult(); // возвращаем строку с ид 1 из таблиці департмента

            Query<Posts> postQuery = session.createQuery("from Posts where id = :id", Posts.class);
            postQuery.setParameter("id", 1L);

            Posts post = postQuery.uniqueResult();

//            Employee employee = new Employee("Andrey", "Ivanov", "Robertovich", 55000, department, post);
//
//
//            employee.setSex(Sex.MALE);
//            employee.setCity("Dnepr");
//            employee.setStreetName("Krasnaya");
//            employee.setZipCode("49000");
//
//            Car car = new Car(270,"BMW");
//            employee.setCar(car);
//
//            PhoneNumber phoneNumber = new PhoneNumber("380930000000", employee);

            Yacht yacht=new Yacht("3444",5,10,15);

            Transaction transaction = session.getTransaction();


            transaction.begin();
            session.save(yacht);
//            session.save(phoneNumber);
//            employee.setPhoneNumber(phoneNumber);
//
//            session.update(employee);
            transaction.commit();

//            Query<Employee> query = session.createQuery("from Employee", Employee.class);
//            List<Employee> list = query.list();
//            for (Employee e : list) {
//                System.out.println(e);
//            }

        } finally {
            System.out.println("Good bye!");
        }
    }
}
