package com.backend.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsControllers {

    @GetMapping("/products")
    String get(){
        return "{title:'oi'}";
    }
}
