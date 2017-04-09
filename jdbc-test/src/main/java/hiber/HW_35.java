package hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import java.util.List;

import static hiber.HibernateUtil.getSessionFactory;

/**
 * Created by Дмитрий on 09.04.2017.
 */
public class HW_35 {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = getSessionFactory(); Session session = sessionFactory.openSession();) {

            Query<Department> departmentQuery = session.createQuery("from Department where id = :id", Department.class);
            departmentQuery.setParameter("id", 1L);

            Department department = departmentQuery.uniqueResult(); // возвращаем строку с ид 1 из таблиці департмента

            Query<Posts> postQuery = session.createQuery("from Posts where id = :id", Posts.class);
            postQuery.setParameter("id", 1L);

            Posts post = postQuery.uniqueResult();

            Employee employee = new Employee("Andrey", "Ivanov", "Robertovich", 55000, department, post);


            employee.setSex(Sex.MALE);
            employee.setCity("Dnepr");
            employee.setStreetName("Krasnaya");
            employee.setZipCode("49000");

            Car car = new Car(270,"BMW");
            employee.setCar(car);
//
            PhoneNumber phoneNumber = new PhoneNumber("380930000123", employee);

          //  Yacht yacht=new Yacht("3444",5,10,15);

            Transaction transaction = session.getTransaction();


            transaction.begin();
            session.save(phoneNumber);
         //   session.save(yacht);
            session.save(employee);
            employee.setPhoneNumber(phoneNumber);
//
            session.update(employee);
            transaction.commit();

            Query<Employee> query = session.createQuery("from Employee", Employee.class);
            List<Employee> list = query.list();
            for (Employee e : list) {
                System.out.println(e);
            }

//            CriteriaBuilder criteriaBuilder=session.getCriteriaBuilder();
//            CriteriaQuery<Yacht> criteriaQuery=session.getCriteriaBuilder().createQuery(Yacht.class);
//            Root<Yacht> yachtRoot=criteriaQuery.from(Yacht.class);
//            Predicate predicate=criteriaBuilder.equal(yachtRoot.get("model"), "3444");

//            CriteriaQuery<Yacht> query=criteriaQuery.where(predicate);
//            query.get

        } finally {
            System.out.println("Good bye!");
        }
    }
}
