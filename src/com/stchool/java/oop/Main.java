package com.stchool.java.oop;

public class Main {
    public static void main(String[] args) {
        Product product1;
        product1 = new Product();


        /*System.out.println("----------------------------------------------");
        System.out.println(" ");
        System.out.println("Product ID : " + product1.id);
        System.out.println("Product Name : " + product1.name);
        System.out.println("Product maxRetailPrice : " + product1.maxRetailPrice);
        System.out.println("centralTax : " + product1.centralTax);
        System.out.println("quantity : " + product1.quantity);
        System.out.println(" ");*/

        /*System.out.println("-----------------------------------------------------");

        System.out.println(" ");
        System.out.printf("%-20s %-20d%n", "Product ID         : ", product1.id);
        System.out.printf("%-20s %-20s%n", "Product Name       : ", product1.name);
        System.out.printf("%-20s %-20.2f%n", "Max Retail Price   : ", product1.maxRetailPrice);
        System.out.printf("%-20s %-20.2f%n", "Central Tax        : ", product1.centralTax);
        System.out.printf("%-20s %-20d%n", "Quantity          : ", product1.quantity);
        System.out.println(" ");

        System.out.println("-----------------------------------------------------");*/

      /* Product product2 = new Product(1, "hp", 50000.0F, 10, 2.5F);
        System.out.println("parameterized initialised");
        System.out.println("----------------------------------------------");
        System.out.println(" ");
        System.out.println("Product ID : " + product2.id);
        System.out.println("Product Name : " + product2.name);
        System.out.println("Product maxRetailPrice : " + product2.maxRetailPrice);
        System.out.println("centralTax : " + product2.centralTax);
        System.out.println("quantity : " + product2.quantity);
        System.out.println(" ");*/

       /* Product product2 = new Product(1, "hp", 50000.00F, 10, 2.5F,7.5F);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("parameterized initialised");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-20s %-10s %-10s%n",
                "ID", "NAME", "MRP", "QTY", "TAX");
        System.out.println("--------------------------------------------------------------------------------");

        System.out.printf("%-10d %-15s %-20.2f %-10d %-10.2f%n",
                product2.id,
                product2.name,
                product2.maxRetailPrice,
                product2.quantity,
                product2.centralTax);

        System.out.println("--------------------------------------------------------------------------------");*/
        Product product3=new Product();
        product3.displayProduct();

    }

}