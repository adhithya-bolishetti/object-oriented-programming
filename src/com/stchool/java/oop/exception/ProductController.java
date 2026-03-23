package com.stchool.java.oop.exception;

public class ProductController {
    ProductService productService = new ProductService();

    public Product save(Product product) throws ProductExistsException {
        return productService.save(product);
    }
}
