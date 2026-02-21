package com.stchool.java.oop.assignments.strings;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductRepository {
    ArrayList<Product> productArrayList;
    ProductService productService = new ProductService();

    public ProductRepository() {
        productArrayList = new ArrayList<>();
    }

    public ArrayList<Product> loadProducts(String[] productsData) {
        for (String s : productsData) {
            String[] productDetails = s.split(",");
            Product product = new Product();
            product.setId(productDetails[0].trim());
            product.setName(productDetails[1].trim());
            product.setMaxRetailPrice(Double.parseDouble(productDetails[2].trim()));
            product.setDiscountPercentage(Float.parseFloat(productDetails[3].trim()));
            productArrayList.add(product);
        }
        return productArrayList;
    }

    public Product save(Product product) {
        productArrayList.add(product);
        return product;
    }

    public Product getProductById(String id) {
        Product product = null;
        for (Product p : productArrayList) {
            if (p.getId().equals(id)) {
                product = p;
            }
        }

        return product;
    }

    public Product update(String id, Product product) {
        Iterator<Product> productIterator = productArrayList.iterator();
        while (productIterator.hasNext()) {
            Product existingProduct = productIterator.next();
            if (existingProduct.getId().equals(id)) {
                productIterator.remove();
            }
        }
        productArrayList.add(product);
        return product;
    }

    public void delete(String id) {
        Iterator<Product> productIterator = productArrayList.iterator();
        while (productIterator.hasNext()) {
            Product deleteById = productIterator.next();
            if (deleteById.getId().equals(id)) {
                productIterator.remove();
            }
        }
    }

    public void displayAllProducts() {
        for (Product product : productArrayList) {
            System.out.println("================================");
            System.out.println("Product Id : " + product.getId());
            System.out.println("Product Name : " + product.getName());
            System.out.println("DiscountPercentage : " + product.getDiscountPercentage());
            System.out.println("Max Retail Price : " + product.getMaxRetailPrice());
        }
    }

    public Product getHighestPriceProduct() {
        double maxPrice = Double.MIN_VALUE;
        Product maxPriceProduct = null;
        for (Product product : productArrayList) {
            if (product.getMaxRetailPrice() > maxPrice) {
                maxPriceProduct = product;
            }
        }
        return maxPriceProduct;
    }

    public Product getLeastPriceProduct() {
        double minPrice = Double.MAX_VALUE;
        Product minPriceProduct = null;
        for (Product product : productArrayList) {
            if (product.getMaxRetailPrice() < minPrice) {
                minPriceProduct = product;
            }
        }
        return minPriceProduct;
    }

    public Product getMaxDiscountProduct() {
        float maxDiscount = Float.MAX_VALUE;
        Product maxDiscountProduct = null;
        for (Product product : productArrayList) {
            if (product.getDiscountPercentage() > maxDiscount) {
                maxDiscountProduct = product;
            }
        }
        return maxDiscountProduct;
    }

    public double getTotalValue() {
        double totalValue = 0;
        for (Product product : productArrayList) {
            totalValue += productService.calculateFinalPrice(product);
        }

        return totalValue;
    }

    public double getAveragePrice() {
        double totalValue = 0;
        for (Product product : productArrayList) {
            totalValue += productService.calculateFinalPrice(product);
        }
        double averagePrice = totalValue / productArrayList.size();
        return averagePrice;
    }

    public int countProductAbovePrice(double price) {
        int count = 0;
        for (Product product : productArrayList) {
            if (product.getMaxRetailPrice() > price) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Product> getProductsWithDiscountAbove(float discount) {
        ArrayList<Product> discountAboveProductsList = new ArrayList<>();
        for (Product product : productArrayList) {
            if (product.getDiscountPercentage() > discount) {
                discountAboveProductsList.add(product);
            }
        }
        return discountAboveProductsList;
    }
}
