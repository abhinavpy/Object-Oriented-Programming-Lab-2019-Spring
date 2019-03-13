package dao;

import model.Customer;

import java.util.List;

public interface CustomerDAO {
    public void addCustomer(Customer customer);
    public void updateCustomer(Customer customer);
    public List<Customer> listCustomers();
    public Customer getCustomerById(int id);
    public void removeCustomer(int id);
    public List<Customer> showCusName();
}
