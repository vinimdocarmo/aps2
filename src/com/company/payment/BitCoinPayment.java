package com.company.payment;

import com.company.services.BitCoinWalletAPI;

public class BitCoinPayment extends Payment {
    @Override
    public void pay(double amount) {
        if (this.validate(amount)) {
            System.out.println("Pagamento de " + amount + " feito com sua carteira bitcoin");
        } else {
            System.out.println("Pagamento inválido com sua carteira bitcoin");
        }
    }

    @Override
    public boolean validate(double amount) {
        return BitCoinWalletAPI.hasEnough(amount);
    }
}
