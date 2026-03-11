package com.stchool.java.oop.abstraction;

public class DebitCardPayment implements Payment{

    @Override
    public boolean pay(double amount) {
        System.out.println("Amount " + amount + "is processed through debit card");
        return true;
    }

    @Override
    public boolean pay(double amount, int otp) {
        System.out.println("Amount " + amount + "is processed through credit card using OTP " + otp);
        return true;
    }
}
