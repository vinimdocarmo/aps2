package com.company.payment;

public abstract class Payment {
    abstract public void pay(double amount);
    abstract public boolean validate(double amount);
}
