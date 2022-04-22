package com.example.springboot.service;

import com.example.springboot.base.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product findById(int id);
    Product addProduct(Product product);
}
