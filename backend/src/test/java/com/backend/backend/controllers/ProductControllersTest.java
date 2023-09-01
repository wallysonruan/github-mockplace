package com.backend.backend.controllers;

import com.backend.backend.models.Product;
import com.backend.backend.services.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class ProductControllersTest {

    @Mock
    ProductService service;
    ProductControllers productControllers;

    List<Product> PRODUCTS = List.of(
            new Product.builder().setTitle("Imgbot")
                    .setPublisher_name("imgbot")
                    .setIs_publisher_verified(true)
                    .setDescription("This is a description")
                    .setIs_recommended(true)
                    .setTotal_downloads(0)
                    .setUrl("this")
                    .setType("APP")
                    .setCategories(new String[]{"API_MANAGEMENT"})
                    .build(),
            new Product.builder().setTitle("CircleCI")
                    .setPublisher_name("circleci")
                    .setIs_publisher_verified(true)
                    .setDescription("This is a description")
                    .setIs_recommended(true)
                    .setTotal_downloads(0)
                    .setUrl("this")
                    .setType("ACTION")
                    .setCategories(new String[]{"API_MANAGEMENT"})
                    .build()
    );

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        productControllers = new ProductControllers(service);
    }

    @Test
    void should_return_all_products_successfully_with_a_200_code() {
        when(service.getAllProducts()).thenReturn(PRODUCTS);
        ResponseEntity<List<Product>> response = productControllers.getProducts(null);

        assertArrayEquals(PRODUCTS.toArray(), response.getBody().toArray());
        assertTrue(response.getStatusCode().is2xxSuccessful());
    }
}