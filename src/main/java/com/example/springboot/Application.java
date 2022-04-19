package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

  public static void main(String[] args) {

    SpringApplication.run(Application.class, "--debug");

    /*SpringFactoriesLoader.loadFactoryNames(EnableAutoConfiguration.class, null)
        .forEach(System.out::println);*/
  }

  @RequestMapping("/test/{name}")
  public String helloWorld(@PathVariable String name) {
    return "Hello2 " + name;
  }

}
