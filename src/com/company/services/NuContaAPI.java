package com.company.services;

import java.util.Random;

public class NuContaAPI {
    static public boolean canPay(double amount) {
        Random r = new Random();
        return r.nextBoolean();
    }
}
