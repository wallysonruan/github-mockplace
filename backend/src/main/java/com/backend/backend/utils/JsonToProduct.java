package com.backend.backend.utils;

import java.io.*;

import com.backend.backend.models.Product;
import com.google.gson.Gson;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

@Component
public class JsonToProduct {
    private Gson gson;

    public JsonToProduct(Gson gson) {
        this.gson = gson;
    }

    public Product[] convert(String file_name) {
        Product[] products = null;

        try {
            // Gets file from the /resources folder.
            File file = ResourceUtils.getFile("classpath:"+ file_name);
            Reader reader = new FileReader(file);

            // Converts the JSON provided by the Reader object to the Product class.
            products = this.gson.fromJson(reader, Product[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return products;
    }
}
