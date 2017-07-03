package ua.dp.levelup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dp.levelup.core.model.Order;
import ua.dp.levelup.core.model.Ticket;
import ua.dp.levelup.dao.OrderDao;
import ua.dp.levelup.service.OrderService;

/**
 * @author Alexandr Shegeda on 23.06.17.
 */
@Service
public class OrderServiceImpl implements OrderService {

  @Autowired
  private OrderDao orderDao;

  public void setOrderDao(final OrderDao orderDao) {
    this.orderDao = orderDao;
  }

  @Override
  public void getAllOrders(Order order) {
    orderDao.getAllOrders(order);

  }

  @Override
  public void createOrder(Order order, Ticket ticket) {
    orderDao.createOrder(order,ticket);

  }

  @Override
  public Order getOrderById(long orderId) {
    return orderDao.getOrderById(orderId);
  }

  @Override
  public void deleteOrder(Order order) {
    orderDao.deleteOrder(order);
  }

  @Override
  public void updateOrder(Order order) {
    orderDao.updateOrder(order);
  }
}
