package com.spring.ProductInventory.service;


import com.spring.ProductInventory.entity.Product;
import com.spring.ProductInventory.exception.ProductNotFoundException;
import com.spring.ProductInventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll()
    {
        return productRepository.findAll();
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(int id) {

        Product product = findProduct(id);
        if(product!=null)
        {
            productRepository.delete(product);
        }
    }

    @Override
    public Product findProduct(int id) {
        Product product;
        Optional<Product> optionalProduct = productRepository.findById(id);
        if(optionalProduct.isPresent())
        {
            product=  optionalProduct.get();
        }
        else
        {
            throw new ProductNotFoundException("Product not found with id - " + id);
        }
        return product;
    }
}
