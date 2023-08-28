package com.backend.backend.services;

import com.backend.backend.models.Product;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.backend.backend.utils.JsonToProduct;

@Service
public class ProductService {
    // Instead of re-running the application to update the list of products,
    // update the file and the application will read it again when requested. Non-stop.
    private final String PRODUCTS_FILE_PATH = "/Users/wallyson.ruan/Desktop/simple-app-front-back/simple-app" +
            "/backend/src/main/java/com/backend/backend/resources/products.json";


    private JsonToProduct jsonToProduct = new JsonToProduct(new Gson());

    public Product[] readProductsFile(String productsFilePath){
        return jsonToProduct.convert(productsFilePath);
    }

    Product[] list_of_products = readProductsFile(PRODUCTS_FILE_PATH);

    public List<Product> getAllProducts(){
        return Arrays.stream(list_of_products).collect(Collectors.toList());
    }

    public List<Product> getProductByType(String type){
        return Arrays.stream(list_of_products)
                .filter(product -> product.getTypes().contains(type.toUpperCase()))
                .collect(Collectors.toList());
    }
}
