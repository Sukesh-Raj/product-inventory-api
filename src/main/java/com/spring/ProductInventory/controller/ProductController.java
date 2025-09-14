package com.spring.ProductInventory.controller;


import com.spring.ProductInventory.entity.Product;
import com.spring.ProductInventory.exception.InvalidInputException;
import com.spring.ProductInventory.service.ProductService;
import com.spring.ProductInventory.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService)
    {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts()
    {
        return productService.findAll();
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product)
    {
        product.setId(0);
        Product dbProduct = productService.addProduct(product);
        return dbProduct;
    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id)
    {
        productService.deleteProduct(id);
        return "Product deleted - " +  id;
    }

    @GetMapping("/products/{id}")
    public Product findProduct(@PathVariable int id)
    {
        return productService.findProduct(id);
    }

    @PutMapping("/products/{id}")
    public Product updateProduct(@PathVariable int id,@RequestBody Product product){
        product.setId(id);
        if(product.getId()==0)
        {
            throw new InvalidInputException("Id must be zero for update");
        }
        Product dbProduct = productService.addProduct(product);
        return dbProduct;
    }
}
