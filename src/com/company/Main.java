package com.company;

import com.company.controllers.PaymentController;
import com.company.payment.PaymentType;

public class Main {

    public static void main(String[] args) {
        PaymentController paymentController = new PaymentController();
        paymentController.payWith(1000.5, PaymentType.BITCOIN);
        paymentController.payWith(20.5, PaymentType.NUCONTA);
    }
}
