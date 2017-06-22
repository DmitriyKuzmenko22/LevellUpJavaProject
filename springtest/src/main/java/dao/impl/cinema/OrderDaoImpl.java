package dao.impl.cinema;

import dao.cinemaDao.OrderDao;
import dao.cinema.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Дмитрий on 22.06.2017.
 */
public class OrderDaoImpl implements OrderDao {

    private Map<Long,Order> orderMap=new HashMap<>();

    @Override
    public List<Order> getAlOrders() {
        return (List<Order>) orderMap.values();
    }

    @Override
    public Order getOrderById(Long id) {
        return orderMap.get(id);
    }

    @Override
    public void createOrder(Order order) {
        orderMap.put(order.getId(),order);

    }

    @Override
    public void deleteOrder(Order order) {
        orderMap.remove(order.getId());

    }

    @Override
    public void updateOrder(Order order) {
        orderMap.put(order.getId(),order);
    }
}
