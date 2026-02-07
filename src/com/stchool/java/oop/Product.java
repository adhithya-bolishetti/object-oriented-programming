package com.stchool.java.oop;

public class Product {
    int id;
    String name;
    float maxRetailPrice;
    float centralTax;
    float stateTax;
    float discountPercentage;
    float discountAmount;
    float finalPrice;
    int shippingCharges;

    public Product() {
        id = 123;
        name = "HP";
        maxRetailPrice = 50000.00F;
        centralTax = 2.5F;
        stateTax = 2.5F;
        discountPercentage = 7.5F;
        shippingCharges = 100;

    }

    public Product(int id, String name, float maxRetailPrice, float centralTax, float stateTax, float discountPercentage, float discountAmount, float finalPrice, int shippingCharges) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.centralTax = centralTax;
        this.stateTax = stateTax;
        this.discountPercentage = discountPercentage;
        this.discountAmount = discountAmount;
        this.finalPrice = finalPrice;
        this.shippingCharges = shippingCharges;
    }

    public void displayProduct() {
        System.out.println("Product ID : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Product maxRetailPrice : " + maxRetailPrice);
        System.out.println("Discount Amount : " + calculateDiscount());
        System.out.println("Price after Discount : " + priceAfterDiscount());
        System.out.println("centralTax : " + centralTax);
        System.out.println("StateTax : " + stateTax);
        System.out.println("Shipping charges : " + shippingCharges);
        System.out.println("Final Bill : " + calculateFinalPrice());

    }

    float calculateDiscount() {
        return maxRetailPrice * discountPercentage / 100;

    }

    float priceAfterDiscount() {
        return maxRetailPrice - calculateDiscount();

    }

    float calculateStateTax() {
        return priceAfterDiscount() * stateTax / 100;
    }

    float calculateCentralTax() {                           //methods
        return priceAfterDiscount() * centralTax / 100;
    }

    float calculateFinalPrice() {
        return priceAfterDiscount() + calculateStateTax() + calculateCentralTax() + shippingCharges;

    }
}