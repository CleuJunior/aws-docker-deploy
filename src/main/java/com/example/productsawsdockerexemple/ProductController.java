package com.example.productsawsdockerexemple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @GetMapping
    public List<ProductEntity> index() {

        return List.of(
                new ProductEntity(1L, "Product 1", 10.0, 10),
                new ProductEntity(2L, "Product 2", 20.0, 20),
                new ProductEntity(3L, "Product 3", 30.0, 30),
                new ProductEntity(4L, "Product 4", 40.0, 40),
                new ProductEntity(5L, "Product 5", 50.0, 50),
                new ProductEntity(6L, "Product 6", 60.0, 60),
                new ProductEntity(7L, "Product 7", 70.0, 70),
                new ProductEntity(8L, "Product 8", 80.0, 80),
                new ProductEntity(9L, "Product 9", 90.0, 90),
                new ProductEntity(10L, "Product 10", 100.0, 100)
        );
    }
}