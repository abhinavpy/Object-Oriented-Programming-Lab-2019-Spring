package service;

import model.Customer;

import java.util.List;

public interface CustomerService {
    public void addCustomer(Customer c);
    public void updateCustomer(Customer c);
    public List<Customer> listCustomer();
    public Customer getCustomerById(int id);
    public void removeCustomer(int id);
    public List<Customer> showCusName();
}
