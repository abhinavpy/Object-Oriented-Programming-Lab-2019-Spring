package dao;

import model.Customer;
import model.Orders;

import java.util.List;

public interface OrdersDAO {
    public void addOrders(Orders o);
    public void updateOrders(Orders o);
    public List<Orders> listOrders();
    public Orders getOrderById(int id);
    public void removeOrders(int id);
    public List<Customer> listCustomers();
}
