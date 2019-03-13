package dao;

import com.sun.org.apache.xpath.internal.operations.Or;
import model.OrderDetails;

import java.util.List;

public interface OrderDetailsDAO {
    public void addOrderDetails(OrderDetails od);
    public void updateOrderDetails(OrderDetails od);
    public List<OrderDetails> listOrderDetails();
    public OrderDetails getOrderDetails(int id);
    public void removeOrderDetails(int id);
}
