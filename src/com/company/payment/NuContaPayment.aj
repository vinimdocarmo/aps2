public aspect NuContaPayment { 
    pointcut callPay(double amount, NuContaPayment payment) : 
     call(void NuContaPayment.pay(double)) && args(amount) && target(payment);
 
    before(double amount, NuContaPayment payment) : callPay(amount, payment) {
	if (!payment.validate()) {
	    throw new Exception("Pagamento inválido com sua NuConta");
        }
    }
 
    after(double amount, BitCoinPayment payment) : callPay(amount, payment) {
	System.out.println("Pagamento de " + amount + " feito com sua NuConta");
    }
}
