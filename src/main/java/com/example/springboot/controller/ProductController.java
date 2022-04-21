package com.example.springboot.controller;

import com.example.springboot.base.Product;
import com.example.springboot.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@Controller
@RequiredArgsConstructor
@RequestMapping("/product")

public class ProductController {

    private ProductService productService;

    @GetMapping // http://localhost:8080/wildfly-sb-project/product
    private String getAllProduct(Model model){
        List<Product> products = productService.getAll();
        model.addAttribute("products", products);
        return "product";
    }


    @GetMapping("/addProduct")
    private String addFormAddProduct(Model model){
        Product product = new Product();
        model.addAttribute("products", product);
        return "addProduct";
    }

    @PostMapping("/addProduct")
    private String addProduct(@ModelAttribute Product product){
        productService.addProduct(product);
        return "redirect:/product";
    }



}
