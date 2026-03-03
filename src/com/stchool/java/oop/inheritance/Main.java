package com.stchool.java.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("111", "HP");
        product.save();
        product.displayProductsDetails();

        Mobile mobile1 = new Mobile(30000.00, 10.0F);
        System.out.println("Id : " + mobile1.getId());
        System.out.println("Name : " + mobile1.getName());
        System.out.println("Price : " + mobile1.getMobilePrice());
        System.out.println("Discount : " + mobile1.getMobileDiscountPercentage());

        Mobile mobile2 = new Mobile("112", "Samsung", 35999.00, 12.0F);
        mobile2.save();
        mobile2.displayProductsDetails();

        Laptop laptop1 = new Laptop("113", "HP", 69999.00, 5.0F);
        laptop1.save();
        laptop1.displayProductsDetails();
    }
}
