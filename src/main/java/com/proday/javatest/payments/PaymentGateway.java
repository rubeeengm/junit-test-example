package com.proday.javatest.payments;

/**
 * @author Ruben Malaga
 */
public interface PaymentGateway {

    public PaymentResponse requestPayment(PaymentRequest request);
}
