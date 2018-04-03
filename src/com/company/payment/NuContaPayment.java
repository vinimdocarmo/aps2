package com.company.payment;

import com.company.services.NuContaAPI;

public class NuContaPayment extends Payment {
    @Override
    public void pay(double amount) {
        if (this.validate(amount)) {
            System.out.println("Pagamento de " + amount + " feito com sua NuConta");
        } else {
            System.out.println("Pagamento inválido com sua NuConta");
        }
    }

    @Override
    public boolean validate(double amount) {
        return NuContaAPI.canPay(amount);
    }
}
