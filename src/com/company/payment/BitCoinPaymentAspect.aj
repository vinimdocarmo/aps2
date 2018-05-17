public aspect BitCoinPaymentAspect { 
    pointcut callPay(double amount, BitCoinPayment payment) : 
     call(void BitCoinPayment.pay(double)) && args(amount) && target(payment);
 
    before(double amount, BitCoinPayment payment) : callPay(amount, payment) {
	if (!payment.validate()) {
	    throw new Exception("Pagamento inválido com sua carteira bitcoin");
        }
    }
 
    after(double amount, BitCoinPayment payment) : callPay(amount, payment) {
	System.out.println("Pagamento de " + amount + " feito com sua carteira bitcoin");
    }
}
