package com.backend.backend.controllers;

import com.backend.backend.models.Product;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsControllers {

    @GetMapping("/products")
    ResponseEntity<Product[]> get(){
        Product[] body = {
                new Product.builder()
                .setTitle("Application 1")
                .setDescription("Good to install")
                .setUrl("this")
                .setTypes(new String[]{"APP"})
                .setCategories(new String[]{"API MANAGEMENT"})
                .build(),

                new Product.builder()
                        .setTitle("Application 2")
                        .setDescription("Good to install")
                        .setUrl("this")
                        .setTypes(new String[]{"APP"})
                        .setCategories(new String[]{"API MANAGEMENT"})
                        .build(),
        };
        return new ResponseEntity<>(body, HttpStatusCode.valueOf(200));
    }
}