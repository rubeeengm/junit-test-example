package com.proday.javatest.payments;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Ruben Malaga
 */
public class PaymentProcessorTest {

    @Test
    public void paymentIsCorrect() {
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentSatus.OK))
        ;

        PaymentProcessor paymentProcessor = new PaymentProcessor(
            paymentGateway
        );

        assertTrue(paymentProcessor.makePayment(1000));
    }

    @Test
    public void paymentIsWrong() {
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
            .thenReturn(new PaymentResponse(PaymentSatus.ERROR))
        ;

        PaymentProcessor paymentProcessor = new PaymentProcessor(
            paymentGateway
        );

        assertFalse(paymentProcessor.makePayment(1000));
    }
}
