# Descriação dos Aspectos

Os aspectos `BitCoinPaymentAspect` e `NuContaPayment` são responsáveis pela validação do pagamento antes da chamada do método `pay`. Estes aspectos também são responsáveis por logar o que antes era logado nos métodos `pay`.

Já o aspecto `PaymentControllerAspect` é responsável por logar o pagamento que foi chamado no controller. Ele loga tanto o tipo quanto o valor do pagamento.
