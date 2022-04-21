package com.example.springboot.repository;

import com.example.springboot.base.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getAll();
    Product findById(int id);
    Product addProduct(Product product);
}
