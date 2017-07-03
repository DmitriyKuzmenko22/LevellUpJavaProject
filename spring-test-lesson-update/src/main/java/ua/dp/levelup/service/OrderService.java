package ua.dp.levelup.service;

import ua.dp.levelup.core.model.Order;
import ua.dp.levelup.core.model.Ticket;

/**
 * @author Alexandr Shegeda on 23.06.17.
 */
public interface OrderService {
    void getAllOrders(Order order);

    // void createOrder(Order order);

    void createOrder(Order order, Ticket ticket);

    Order getOrderById(long orderId);

    void deleteOrder(Order order);

    void updateOrder(Order order);

}
