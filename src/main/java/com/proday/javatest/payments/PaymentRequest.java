package com.proday.javatest.payments;

/**
 * @author Ruben Malaga
 */
public class PaymentRequest {
    private double amount;

    public PaymentRequest(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
