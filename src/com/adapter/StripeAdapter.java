package com.adapter;

public class StripeAdapter implements PaymentProcessor {
    StripeGateway stripe = new StripeGateway();
    public void processPayment(int amount) {
        stripe.makePayment(amount);
    }
}