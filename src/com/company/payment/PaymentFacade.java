package com.company.payment;

public class PaymentFacade {
    private Payment payment;

    public void registerPayment(Payment payment) {
        this.payment = payment;
    }

    public void pay(double amount) {
        this.payment.pay(amount);
    }
}
