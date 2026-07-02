package com.adapter;

public class TestAdapter {
    public static void main(String[] args) {
        PaymentProcessor p1 = new PayPalAdapter();
        p1.processPayment(500);
        PaymentProcessor p2 = new StripeAdapter();
        p2.processPayment(1000);
    }
}