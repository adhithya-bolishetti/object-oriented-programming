package com.stchool.java.oop.abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter OTP");
        int otp = scanner.nextInt();
        System.out.println("Enter Payment choice");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                CreditCardPayment creditCardPay = new CreditCardPayment();
                Order order1 = new Order(creditCardPay);
                if(order1.processOrder(59999, otp)) {
                    System.out.println("Your order has been processed");
                }
                break;
            case 2:
                DebitCardPayment debitCardPay = new DebitCardPayment();
                Order order2 = new Order(debitCardPay);
                if (order2.processOrder(49999, otp)) {
                    System.out.println("Your order has been processed");
                }
                break;
            case 3:
                UPIPayment upiPay = new UPIPayment();
                Order order3 = new Order(upiPay);
                if (order3.processOrder(49999, otp)) {
                    System.out.println("Your order has been processed");
                }
                break;
            case 4:
                Order order4 = new Order();
                if(order4.payByCash(49999, otp)) {
                    System.out.println("Your order has been processed");
                }
                break;
            default:
                System.out.println("Enter proper input");
        }

        scanner.close();
    }
}
