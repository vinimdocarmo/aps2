package com.company.payment;

import com.company.services.NuContaAPI;

public class NuContaPayment extends Payment {
    @Override
    public void pay(double amount) {
        // Now the aspect NuContaPaymentAspect is responsible for validation and log
    }

    @Override
    public boolean validate(double amount) {
        return NuContaAPI.canPay(amount);
    }
}
