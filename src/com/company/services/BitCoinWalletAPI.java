package com.company.services;

import java.util.Random;

public class BitCoinWalletAPI {
    static public boolean hasEnough(double amount) {
        Random r = new Random();
        return r.nextBoolean();
    }
}
