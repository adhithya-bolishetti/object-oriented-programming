package com.stchool.java.oop.inheritance;

public class Laptop extends Product{
    private double laptopPrice;
    private double laptopDiscountPercentage;

    public Laptop() {
        super();
    }

    public Laptop(double laptopPrice, double laptopDiscountPercentage) {
        this.laptopPrice = laptopPrice;
        this.laptopDiscountPercentage = laptopDiscountPercentage;
    }

    public Laptop(String id, String name, double laptopPrice, double laptopDiscountPercentage) {
        super(id, name);
        this.laptopPrice = laptopPrice;
        this.laptopDiscountPercentage = laptopDiscountPercentage;
    }

    public double getLaptopPrice() {
        return laptopPrice;
    }

    public void setLaptopPrice(double laptopPrice) {
        this.laptopPrice = laptopPrice;
    }

    public double getLaptopDiscountPercentage() {
        return laptopDiscountPercentage;
    }

    public void setLaptopDiscountPercentage(double laptopDiscountPercentage) {
        this.laptopDiscountPercentage = laptopDiscountPercentage;
    }

    @Override
    public void displayProductsDetails() {
        super.displayProductsDetails();
        System.out.println("Laptop Price : " + getLaptopPrice());
        System.out.println("Laptop Discount Percentage : " + getLaptopDiscountPercentage());
    }
}
