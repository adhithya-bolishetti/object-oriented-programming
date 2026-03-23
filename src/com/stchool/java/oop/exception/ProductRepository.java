package com.stchool.java.oop.exception;


import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    List<Product> productList;

    public ProductRepository() {
        productList = new ArrayList<>();
    }

    public Product save(Product product) {
        productList.add(product);
        return product;
    }

    public Product getById(String id) {
        Product product = null;

        for (Product p : productList) {
            if (p.getId().equals(id)) {
                product = p;
                break;
            }
        }

        return product;
    }

    public boolean exists(String id) {
        Product product = getById(id);
        if(product != null) return true;
        return false;
    }

    public List<Product> getAll() {
        return productList;
    }

    public void delete(String id) {
        Product product = getById(id);

        if (product != null) {
            productList.remove(product);
        }
    }

    public Product update(String id, Product product) {
        Product existingProduct = getById(id);
        if (existingProduct != null) {
            productList.remove(existingProduct);
            productList.add(product);
        }
        return product;
    }
}
