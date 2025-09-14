package com.spring.ProductInventory.service;

import com.spring.ProductInventory.entity.Product;

import java.util.List;

public interface ProductService {


    List<Product> findAll();
    Product addProduct(Product product);
    void deleteProduct(int id);
    Product findProduct(int id);
}
