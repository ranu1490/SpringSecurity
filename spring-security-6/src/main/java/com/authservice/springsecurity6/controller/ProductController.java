package com.authservice.springsecurity6.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    record Product(int id, String name, double price){};

    List<Product> products = List.of(
        new Product(1, "Laptop", 999.99),
        new Product(2, "Smartphone", 499.99),
        new Product(3, "Headphones", 199.99)
    );

    @GetMapping
    public List<Product> getProduct(){
        return products;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
//        products.add(product);
        return product;
    }
}
