package com.adapter;

public class StripeGateway {
    public void makePayment(int amount) {
        System.out.println("Paid via Stripe: " + amount);
    }
}