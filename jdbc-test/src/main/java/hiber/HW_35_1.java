package hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static hiber.HibernateUtil.getSessionFactory;

/**
 * Created by Дмитрий on 09.04.2017.
 */
public class HW_35_1 {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = getSessionFactory(); Session session = sessionFactory.openSession();) {

            Query<Department> departmentQuery = session.createQuery("from Department where id = :id", Department.class);
            departmentQuery.setParameter("id", 2L);
            Department department = departmentQuery.uniqueResult(); // возвращаем строку с ид 1 из таблиці департмента
            System.out.println(department);

            Query<Posts> postQuery = session.createQuery("from Posts where id = :id", Posts.class);
            postQuery.setParameter("id", 1L);
            Posts post = postQuery.uniqueResult();
            System.out.println(post);


//            Query query = session.createQuery("select count(*) from Employee where id = :id ");
//            query.setParameter("id", 5L);
//            List<?> list = query.list();
//            Employee employee1 = (Employee) list.get(0);
//            System.out.println(employee1);


//            Query<Employee> query = session.createQuery("from Employee", Employee.class);
//            List<Employee> list = query.list();
//            for (Employee e : list) {
//                System.out.println(e);
//            }
            //количество всех сотрудников
            Number count = (Number) session.createQuery("select count(p.id) from Employee p").uniqueResult();
            System.out.println(count);

            //количество всех сотрудников
            Query<Long> employeeQuery= session.createQuery("select count(p.id) from Employee p");
            Long employee=employeeQuery.uniqueResult();
            System.out.println(employee);

            //среднюю зарплату вывести
            Query<Double> employeeQuery1= session.createQuery("select avg(emp.salary) from Employee emp");
            Double employee1= employeeQuery1.uniqueResult();
            System.out.println(employee1);

          /*  //фильтр по имени
            Query<Employee> query = session.createQuery("from Employee order by firstName", Employee.class);
            List<Employee> list = query.list();
            for (Employee e : list) {
                System.out.println(e);
            }*/

           /* //фильтр возраста по имени
                Query<Double> query = session.createQuery("select distinct salary from Employee order by lastName");
            List<Double> list = query.list();
            for (Double e : list) {
                System.out.println(e);
            }*/

            //Вывести список фамилий, с указанием количества повторений этих фамилий в общем списке
//            Query<Object[]> query = session.createQuery("select lastName, count(emp.lastName) " +
//                    "from Employee emp group by emp.salary");
//            List<Object[]> list = query.list();
//            for (Object[] e : list) {
//                System.out.println(e[0].toString()+" "+e[1].toString());
//            }

            //находим фимилии с буквой н, выводим ИД и фамилию
//            Query<Object[]> query = session.createQuery("select id, lastName from Employee where lastName like '%н%'");
//            List<Object[]> list = query.list();
//            for (Object[] e : list) {
//                System.out.println(e[0].toString()+" "+e[1].toString());
//            }

            //находим фимилии с буквой н , выводим только фамилии
          /*  Query<String> query = session.createQuery("select lastName from Employee where lastName like '%н%'");
            List<String> list = query.list();
            for (String e : list) {
                System.out.println(e);
            }*/

            //вывести список эмплоии у кого нет мобильных телефонов (вместо вывода списка бомжей)
         /*   Query<Employee> query = session.createQuery("from Employee where phoneNumber is null");
            List<Employee> list = query.list();
            for (Employee e : list) {
                System.out.println(e);
            }*/

            //эмлоии с зарплатой менее 1000 (по аналогии жители менее 18)
           /* Query<Employee> query = session.createQuery("from Employee where salary<1000");
            List<Employee> list = query.list();
            for (Employee e : list) {
                System.out.println(e);
            }
*/
            Query<Object[]> query = session.createQuery("from Employee emp join  ");
            List<Object[]> list = query.list();
            for (Object[] e : list) {
                System.out.println(e);
            }



/*            CriteriaBuilder criteriaBuilder=session.getCriteriaBuilder();
            CriteriaQuery<Yacht> criteriaQuery=session.getCriteriaBuilder().createQuery(Yacht.class);
            Root<Yacht> yachtRoot=criteriaQuery.from(Yacht.class);
            Predicate predicate=criteriaBuilder.equal(yachtRoot.get("model"), "3444");

            CriteriaQuery<Yacht> query=criteriaQuery.where(predicate);
            query.get*/

        } finally {
            System.out.println("Good bye!");
        }
    }
}
