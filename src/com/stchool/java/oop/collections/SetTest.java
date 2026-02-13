package com.stchool.java.oop.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTest {
    public static void main(String[] args) {
        HashSet<Product> productHashSet = new HashSet<>();

        productHashSet.add(new Product("111","HP",70000.99));
        productHashSet.add(new Product("112","Lenovo",69999.99));
        productHashSet.add(new Product("113","Dell",69999.99));
        productHashSet.add(new Product("114","HP",70000.99));
        productHashSet.add(new Product("112","Lenovo",60000.99));

        System.out.println("HashSet size : " + productHashSet.size());

        System.out.println(productHashSet);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id :");
        String productId = scanner.next();

        Iterator<Product> productIterator = productHashSet.iterator();
        while (productIterator.hasNext()) {
            Product p = productIterator.next();
            if(p.getId().equals(productId)) {
                productIterator.remove();
            }
        }
        System.out.println("=========================================");
        System.out.println("Products after removing");
        System.out.println("HashSet size : " + productHashSet.size());
        System.out.println(productHashSet);

        scanner.close();
    }
}
