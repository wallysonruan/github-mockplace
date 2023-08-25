package com.backend.backend.controllers;

import com.backend.backend.models.Product;
import com.backend.backend.utils.JsonToProduct;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsControllers {
    private JsonToProduct jsonToProduct;

    public ProductsControllers(JsonToProduct jsonToProduct) {
        this.jsonToProduct = jsonToProduct;
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/products")
    ResponseEntity<Product[]> getAllProducts(){
        String listOfProductsPath = "/Users/wallyson.ruan/Desktop/simple-app-front-back/simple-app" +
                "/backend/src/main/java/com/backend/backend/resources/products.json";

        // Instead of re-running the application to update the list of products,
        // update the file and the application will read it again when requested. Non-stop.
        Product[] body = jsonToProduct.convert(listOfProductsPath);
        return new ResponseEntity<>(body, HttpStatusCode.valueOf(200));
    }
}
