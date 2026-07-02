package com.adapter;

public class PayPalAdapter implements PaymentProcessor {
    PayPalGateway paypal = new PayPalGateway();
    public void processPayment(int amount) {
        paypal.sendMoney(amount);
    }
}