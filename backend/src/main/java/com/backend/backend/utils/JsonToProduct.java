package com.backend.backend.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.backend.backend.models.Product;
import com.google.gson.Gson;
import org.springframework.stereotype.Component;

@Component
public class JsonToProduct {
    private Gson gson;

    public JsonToProduct(Gson gson) {
        this.gson = gson;
    }

    public Product[] convert(String file_path) {
        Product[] products = null;

        try {
            BufferedReader file = new BufferedReader(new FileReader(file_path));
            products = this.gson.fromJson(file, Product[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return products;
    }
}
