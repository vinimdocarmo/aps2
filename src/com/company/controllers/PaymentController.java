package com.company.controllers;

import com.company.payment.PaymentFacade;
import com.company.payment.PaymentFactory;
import com.company.payment.PaymentType;

public class PaymentController {
    public void payWith(double amount, PaymentType type) {
        PaymentFacade paymentFacade = new PaymentFacade();
        paymentFacade.registerPayment(PaymentFactory.getPayment(type));
        paymentFacade.pay(amount);
    }
}
