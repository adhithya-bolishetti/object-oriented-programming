package com.stchool.java.oop.inheritance;

public class Mobile extends Product{
    private double mobilePrice;
    private float mobileDiscountPercentage;

    public Mobile() {
        super();
    }

    public Mobile(double mobilePrice, float mobileDiscountPercentage) {
        this.mobilePrice = mobilePrice;
        this.mobileDiscountPercentage = mobileDiscountPercentage;
    }

    public Mobile(String id, String name, double mobilePrice, float mobileDiscountPercentage) {
        super(id, name);
        this.mobilePrice = mobilePrice;
        this.mobileDiscountPercentage = mobileDiscountPercentage;
    }

    public double getMobilePrice() {
        return mobilePrice;
    }

    public void setMobilePrice(double mobilePrice) {
        this.mobilePrice = mobilePrice;
    }

    public float getMobileDiscountPercentage() {
        return mobileDiscountPercentage;
    }

    public void setMobileDiscountPercentage(float mobileDiscountPercentage) {
        this.mobileDiscountPercentage = mobileDiscountPercentage;
    }

    @Override
    public void displayProductsDetails() {
        super.displayProductsDetails();
        System.out.println("Mobile Price : " + getMobilePrice());
        System.out.println("Mobile Discount Percentage : " + getMobileDiscountPercentage());
    }
}
