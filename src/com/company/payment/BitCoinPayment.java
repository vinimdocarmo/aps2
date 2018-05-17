package com.company.payment;

import com.company.services.BitCoinWalletAPI;

public class BitCoinPayment extends Payment {
    @Override
    public void pay(double amount) {
        // Now the aspect BitCoinPaymentAspect is responsible for validation and log
    }

    @Override
    public boolean validate(double amount) {
        return BitCoinWalletAPI.hasEnough(amount);
    }
}
