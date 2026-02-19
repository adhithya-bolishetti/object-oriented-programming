package com.stchool.java.oop.assignments.strings;

import java.util.HashSet;
import java.util.Iterator;

public class ProductService {
    private HashSet<Product> products;

    public ProductService() {
        this.products = new HashSet<>();
    }
    public HashSet<Product> getProducts(String[] productsData) {
        HashSet<Product> productsDataHashSet = new HashSet<>();
        for(String s : productsData) {
            String[] details = s.split(",");
            Product product = new Product();
            product.setId(details[0].trim());
            product.setName(details[1].trim());
            product.setMaxRetailPrice(Double.parseDouble(details[2].trim()));
            product.setDiscountPercentage(Float.parseFloat(details[3].trim()));
            productsDataHashSet.add(product);
        }
        return productsDataHashSet;
    }

    public double calculateFinalPrice(Product product) {
        return (product.getMaxRetailPrice() - (product.getMaxRetailPrice() * (product.getDiscountPercentage()/100)));
    }

    public void displayProductDetails(Product product) {
        System.out.println("id : " + product.getId());
        System.out.println("Name : " + product.getName());
        System.out.println("Max Retail Price : " + product.getMaxRetailPrice());
        System.out.println("Discount Percentage : " + product.getDiscountPercentage());
        System.out.println("Finalprice : " + calculateFinalPrice(product));
        System.out.println();
    }

    HashSet<Product> getProductsById(String[] ids){
        HashSet<Product> productsById = new HashSet<>();

        for(String id: ids){
            Iterator<Product> iterator = products.iterator();
            while (iterator.hasNext()){
                Product product = iterator.next();
                if(product.getId().equals(id))
                    productsById.add(product);
            }
        }

        return productsById;
    }
}
