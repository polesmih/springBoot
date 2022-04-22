package com.example.springboot;

import com.example.springboot.base.Product;
import com.example.springboot.controller.ProductController;
import com.example.springboot.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@SpringBootApplication
public class Application {

    public Application() {
    }

    public static void main(String[] args) {

    SpringApplication.run(Application.class, args);

    /*SpringFactoriesLoader.loadFactoryNames(EnableAutoConfiguration.class, null)
        .forEach(System.out::println);*/
  }



}
