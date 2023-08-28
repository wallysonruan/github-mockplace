package com.backend.backend.controllers;

import com.backend.backend.models.Product;
import com.backend.backend.services.ProductService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductControllers {

    private ProductService service;

    public ProductControllers(ProductService service) {
        this.service = service;
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/products")
    ResponseEntity<List<Product>> getAllProductsTypeApplication(@RequestParam(required = false) String type) {
        if (type != null){
            List<Product> response = service.getProductByType(type);
            return new ResponseEntity<>(response, HttpStatusCode.valueOf(200));
        }

        List<Product> response = service.getAllProducts();
        return new ResponseEntity<>(response, HttpStatusCode.valueOf(200));
    }
}
