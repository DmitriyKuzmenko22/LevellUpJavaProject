package dao.cinemaDao;

import dao.cinema.Order;

import java.util.List;

/**
 * Created by Дмитрий on 22.06.2017.
 */
public interface OrderDao {

    List<Order> getAlOrders();

    Order getOrderById(Long id);

    void createOrder(Order order);

    void deleteOrder(Order order);

    void updateOrder(Order order);

}
