package ua.dp.levelup.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.dp.levelup.core.model.Order;
import ua.dp.levelup.core.model.Ticket;
import ua.dp.levelup.dao.OrderDao;

import java.util.List;

/**
 * @author Alexandr Shegeda on 23.06.17.
 */
@Repository
@Transactional
public class OrderDaoImpl implements OrderDao {

    @Autowired
    private HibernateTemplate template;

    @Override
    public void getAllOrders(Order order) {
        template.loadAll(Order.class);
    }

   /* @Override
    public void createOrder(Order order) {
        template.save(order);
    }*/

    @Override
    public void createOrder(Order order, Ticket ticket) {
        Session session = template.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();



        template.save(ticket);
        template.save(order);

        transaction.commit();
    }

    @Override
    public Order getOrderById(long orderId) {
        Session session = template.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Order order = template.get(Order.class,orderId);

        if (order!=null) {
            List<Ticket> tickets = order.getTickets();


            System.out.println(tickets.size());

            transaction.commit();

            return order;
        } else {
            Order order1=new Order(-1,-1L);
            System.out.println("Null 111");
            return order1;
        }
    }



    @Override
    public void deleteOrder(Order order) {
        template.delete(Order.class);
    }

    @Override
    public void updateOrder(Order order) {
        template.update(Order.class);

    }

}
