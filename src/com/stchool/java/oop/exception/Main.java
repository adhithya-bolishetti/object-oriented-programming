package com.stchool.java.oop.exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        try {
            Product product1 = new Product("111","Mani",1000);
            System.out.println(productController.save(product1));
            Product product2 = new Product("111","Mani",1000);
            System.out.println(productController.save(product1));
        } catch (ProductExistsException e) {
            System.out.println("Product Already Exists");
        }
    }
}
