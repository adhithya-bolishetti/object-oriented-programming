package com.stchool.java.oop;

public class Main {
    public static void main(String[] args) {
        Product product1;//reference var
        product1 = new Product();
        product1.displayProducts();
//        System.out.println("name: " + product1.name);
//        System.out.println("Id: " + product1.id);
//        System.out.println("quantity: " + product1.quantity);
//        System.out.println("shippingCharge: " + product1.shippingCharge);
//        System.out.println("availableStock: " + product1.availableStock);
//        System.out.println("membership: " + product1.memberShip);
//        System.out.println("price: " + product1.price);
//        System.out.println("StateTax: " + product1.stateTax);
//        System.out.println("CentralTax: " + product1.centralTax);
//        System.out.println("discountAmount: " + product1.discountAmount);
//        System.out.println("TotalPrice: " + product1.totalPrice);
//        System.out.println("discountPercentage: " + product1.discountPercentage);
//        System.out.println("stateTaxPercentage: " + product1.stateTaxPercentage);
//        System.out.println("centalTaxPercentage: " + product1.centralTaxPercentage);
        System.out.println("----------------------------------------------------");

        Product product2;
        product2 = new Product(2341, 2, 125, 50, 3000, 's', "lenovo", 2.5F, 2.5F, 1000.0F, 40000.0F, 1.5F, 2000.0F, 2000.0F);
        product2.displayProducts();
        //        System.out.println("name: " + product2.name);
//        System.out.println("Id: " + product2.id);
//        System.out.println("quantity: " + product2.quantity);
//        System.out.println("shippingCharge: " + product2.shippingCharge);
//        System.out.println("availableStock: " + product2.availableStock);
//        System.out.println("membership: " + product2.memberShip);
//        System.out.println("price: " + product2.price);
//        System.out.println("StateTax: " + product2.stateTax);
//        System.out.println("CentralTax: " + product2.centralTax);
//        System.out.println("discountAmount: " + product2.discountAmount);
//        System.out.println("TotalPrice: " + product2.totalPrice);
//        System.out.println("discountPercentage: " + product2.discountPercentage);
//        System.out.println("stateTaxPercentage: " + product2.stateTaxPercentage);
//        System.out.println("centalTaxPercentage: " + product2.centralTaxPercentage);
        System.out.println("---------------------------------------------------");


        //table format
        System.out.format("%-5s %-10s %-10s %-15s %-15s%n",

                "Id", "Price", "Name", "CentralTax", "TotalPrice");
        System.out.println("-----------------------------------------------");
        //table formate with data
    }
}
