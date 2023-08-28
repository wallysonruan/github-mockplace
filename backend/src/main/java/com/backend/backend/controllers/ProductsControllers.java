package com.backend.backend.controllers;

import com.backend.backend.models.Product;
import com.backend.backend.utils.JsonToProduct;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductsControllers {
    private final String listOfProductsPath = "/Users/wallyson.ruan/Desktop/simple-app-front-back/simple-app" +
            "/backend/src/main/java/com/backend/backend/resources/products.json";
    private JsonToProduct jsonToProduct;

    public ProductsControllers(JsonToProduct jsonToProduct) {
        this.jsonToProduct = jsonToProduct;
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/products")
    ResponseEntity<List<Product>> getAllProductsTypeApplication(@RequestParam(required = false) String type) {
        // Instead of re-running the application to update the list of products,
        // update the file and the application will read it again when requested. Non-stop.
        Product[] list_of_products = jsonToProduct.convert(listOfProductsPath);

        if (type != null){
            List<Product> response = Arrays.stream(list_of_products)
                    .filter(product -> product.getTypes().contains(type.toUpperCase()))
                    .collect(Collectors.toList());
            return new ResponseEntity<>(response, HttpStatusCode.valueOf(200));
        }

        List<Product> response = Arrays.stream(list_of_products).collect(Collectors.toList());
        return new ResponseEntity<>(response, HttpStatusCode.valueOf(200));
    }
}
