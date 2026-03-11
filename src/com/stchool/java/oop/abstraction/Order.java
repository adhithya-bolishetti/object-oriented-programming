package com.stchool.java.oop.abstraction;

public class Order {
    Payment payment;

    public Order() {
    }

    public Order(Payment payment) {
        this.payment = payment;
    }

    public boolean processOrder(double amount) {
        this.payment.pay(amount);
        return true;
    }

    public boolean processOrder(double amount, int otp) {
        this.payment.pay(amount, otp);
        return true;
    }

    public boolean payByCash(double amount, int otp) {
        this.payment.pay(amount, otp);
        return true;
    }
}
