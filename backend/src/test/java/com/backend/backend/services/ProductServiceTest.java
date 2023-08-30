package com.backend.backend.services;

import com.backend.backend.models.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
class ProductServiceTest {

    ProductService productService;

    List<Product> PRODUCTS = List.of(
            new Product.builder().setTitle("Imgbot")
                    .setPublisher_name("imgbot")
                    .setIs_publisher_verified(true)
                    .setDescription("This is a description")
                    .setIs_recommended(true)
                    .setTotal_downloads(0)
                    .setUrl("this")
                    .setTypes("APP")
                    .setCategories(new String[]{"API_MANAGEMENT"})
                    .build(),
            new Product.builder().setTitle("CircleCI")
                    .setPublisher_name("circleci")
                    .setIs_publisher_verified(true)
                    .setDescription("This is a description")
                    .setIs_recommended(true)
                    .setTotal_downloads(0)
                    .setUrl("this")
                    .setTypes("ACTION")
                    .setCategories(new String[]{"API_MANAGEMENT"})
                    .build()
            );

    @BeforeEach
    void setUp() {
        productService = new ProductService();
    }

    // @Test
    // void should_return_all_products_successfully() {
    //     List<Product> response = productService.getAllProducts();
    //     assertArrayEquals(PRODUCTS.stream().toArray(), response.toArray());
    // }

    @Test
    void should_return_only_type_Actions_products() {
        List<Product> response = productService.getProductByType("action");

        assertTrue(response.get(0).getTypes().contains("ACTION"));
        assertFalse(response.get(1).getTypes().contains("APP"));
    }
}