public aspect PaymentControllerAspect { 
    pointcut callPayWith(double amount, PaymentType type, PaymentController controller) : 
     call(void PaymentController.payWith(double)) && args(amount, type) && target(controller);
 
    after(double amount, PaymentType type, PaymentController controller) : callPayWith(amount, type, controller) {
	System.out.println("Pagamento chamando no controller.\n\tTipo do pagamento: " + type + "\n\tValor: R$" + amount);
    }
}
