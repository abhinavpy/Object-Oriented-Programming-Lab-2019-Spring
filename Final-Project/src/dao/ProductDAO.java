package dao;

import model.Product;

import java.util.List;

public interface ProductDAO {
    public void addProduct(Product p);
    public void updateProduct(Product p);
    public List<Product> listProduct();
    public Product getProductById(int id);
    public Product removeProduct(int id);
}
