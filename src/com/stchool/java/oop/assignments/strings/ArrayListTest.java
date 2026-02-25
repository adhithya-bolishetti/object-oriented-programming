package com.stchool.java.oop.assignments.strings;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productsData = {
                "prod-101,Lenovo Laptop,58999.00,10.5",
                "prod-102,Dell Inspiron 15,54999.00,8.0",
                "prod-103,HP Pavilion 14,62999.00,12.0",
                "prod-104,Apple iPhone 14,79999.00,5.0",
                "prod-105,Samsung Galaxy S23,74999.00,7.5",
                "prod-106,OnePlus 11R,45999.00,9.0",
                "prod-107,Boat Rockerz Headphones,2999.00,15.0",
                "prod-108,Sony Bravia 43inch TV,52999.00,11.5",
                "prod-109,LG Double Door Refrigerator,38999.00,13.0",
                "prod-110,Canon EOS 1500D Camera,41999.00,6.5"
        };

        ProductRepository productRepository = new ProductRepository();
        ArrayList<Product> productArrayList = productRepository.loadProducts(productsData);

        System.out.println("**************Products*************");
        productRepository.displayAllProducts();

        Product product = new Product();
        product.setId("prod-111");
        product.setName("HP Elite");
        product.setMaxRetailPrice(69999.00);
        product.setDiscountPercentage(10.0F);
        System.out.println(productRepository.save(product));

        System.out.println(productRepository.getProductById("prod-105"));

        Product product2 = new Product();
        product2.setId("prod-105");
        product2.setName("S23 FE");
        product2.setMaxRetailPrice(45999.00);
        product2.setDiscountPercentage(22.00F);
        System.out.println(productRepository.update("prod-105", product2));

        productRepository.delete("prod-104");

        productRepository.displayAllProducts();

        System.out.println(productRepository.getHighestPriceProduct());
        System.out.println(productRepository.getLeastPriceProduct());
        System.out.println(productRepository.getMaxDiscountProduct());
        System.out.println(productRepository.getTotalValue());
        System.out.println(productRepository.getAveragePrice());
        System.out.println(productRepository.countProductAbovePrice(50000.00));

        System.out.println("********Sort By Price Ascending***********");
        productRepository.sortByPriceAscending();
        productRepository.displayAllProducts();

        System.out.println("********Sort By Price Descending***********");
        productRepository.sortByPriceDescending();
        productRepository.displayAllProducts();

        System.out.println(productRepository.getProductsWithDiscountAbove(10.0F));
    }
}
