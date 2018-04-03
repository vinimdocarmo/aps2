package com.company.payment;

public class PaymentFactory {
    static public Payment getPayment(PaymentType type) {
        if (type == PaymentType.BITCOIN) {
            return new BitCoinPayment();
        } else if (type == PaymentType.NUCONTA) {
            return new NuContaPayment();
        }
        return null;
    }
}
