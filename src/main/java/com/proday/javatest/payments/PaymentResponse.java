package com.proday.javatest.payments;

/**
 * @author Ruben Malaga
 */
public class PaymentResponse {
    private PaymentSatus status;

    public PaymentResponse(PaymentSatus status) {
        this.status = status;
    }

    public PaymentSatus getStatus() {
        return status;
    }
}
