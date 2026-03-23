package com.stchool.java.oop.exception;

import java.util.List;

public class ProductService{
    ProductRepository productRepository = new ProductRepository();

    public Product save(Product product) throws ProductExistsException{

        if(productRepository.exists(product.getId())) {
            throw new ProductExistsException("Product Already Exists");
        }

        return productRepository.save(product);
    }

    public Product getById(String id) throws ProductNotFoundException {
        if(productRepository.getById(id) == null) {
            throw new ProductNotFoundException("Product doesn't exists");
        }
        return productRepository.getById(id);
    }

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public boolean exists(String id) throws ProductNotFoundException {
        if(!productRepository.exists(id)) {
            throw new ProductNotFoundException("Product doesn't exists with" + id);
        }
        return true;
    }

    public Product update(String id, Product product) throws ProductNotFoundException {
        if(productRepository.getById(id) == null) {
            throw new ProductNotFoundException("product not found");
        }
        return productRepository.update(id, product);
    }

    public void delete(String id) throws ProductNotFoundException {
        if(productRepository.getById(id) == null) {
            throw new ProductNotFoundException("product not found");
        }
        productRepository.delete(id);
    }
}
