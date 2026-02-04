package com.stchool.java.oop;

public class Product {
    //instance variable
    int id,quantity,availableStock, shippingCharge;
    int price;
    char memberShip;
    String name;
    float stateTax,centralTax,discountAmount,totalPrice,discountPercentage;
    float stateTaxPercentage;
    float centralTaxPercentage;
    Product(){
        System.out.println("Creating a product ");

    }

    public Product(int id, int quantity, int availableStock, int shippingCharge, int price, char memberShip, String name, float stateTax, float centralTax, float discountAmount, float totalPrice, float discountPercentage, float stateTaxPercentage, float centralTaxPercentage) {
        this.id = id;
        this.quantity = quantity;
        this.availableStock = availableStock;
        this.shippingCharge = shippingCharge;
        this.price = price;
        this.memberShip = memberShip;
        this.name = name;
        this.stateTax = stateTax;
        this.centralTax = centralTax;
        this.discountAmount = discountAmount;
        this.totalPrice = totalPrice;
        this.discountPercentage = discountPercentage;
        this.stateTaxPercentage = stateTaxPercentage;
        this.centralTaxPercentage = centralTaxPercentage;
    }

    void displayProducts() {
        System.out.println("name: " + name);
        System.out.println("Id: " + id);
        System.out.println("quantity: " + quantity);
        System.out.println("shippingCharge: " + shippingCharge);
        System.out.println("availableStock: " + availableStock);
        System.out.println("membership: " + memberShip);
        System.out.println("price: " + price);
        System.out.println("StateTax: " + stateTax);
        System.out.println("CentralTax: " + centralTax);
        System.out.println("discountAmount: " + discountAmount);
        System.out.println("TotalPrice: " + totalPrice);
        System.out.println("discountPercentage: " + discountPercentage);
        System.out.println("stateTaxPercentage: " + stateTaxPercentage);
        System.out.println("centalTaxPercentage: " + centralTaxPercentage);
    }
}
