package com.stchool.java.oop.abstraction;

public class UPIPayment implements Payment{

    @Override
    public boolean pay(double amount) {
        System.out.println("Amount " + amount + " " + "is processed through UPI payment");
        return true;
    }

    @Override
    public boolean pay(double amount, int otp) {
        System.out.println("Amount " + amount + "is processed through UPI payment using OTP " + otp);
        return true;
    }
}
