package hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

import static hiber.HibernateUtil.getSessionFactory;

/**
 * Created by java on 28.03.2017.
 */
public class App {

    public static void main(String[] args) {
        SessionFactory sessionFactory = getSessionFactory();
//
//        Employee employee = new Employee();

        try (Session session = sessionFactory.openSession()) {



          //  Employee employee = new Employee("Andrey", "Ivanov", "Robertovich", 55000,2);
            Transaction transaction = session.getTransaction();
            transaction.begin();
           // session.save(employee);
           transaction.commit();

            //Query<Employee> query = session.createQuery("from Employee", Employee.class);
            Query<employees_tangibles> query = session.createQuery("from employees_tangibles", employees_tangibles.class);
            List<employees_tangibles> list = query.list();

            for (employees_tangibles e : list) {
                System.out.println(e);
            }

        } finally {
            System.out.println("Good bye!");
            sessionFactory.close();
        }
    }
}
