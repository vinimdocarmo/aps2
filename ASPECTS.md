# Descriação dos Aspectos

Os aspectos `BitCoinPaymentAspect` e `NuContaPayment` são responsáveis pela validação do pagamento antes da chamada do método `pay`. Estes aspectos também são responsáveis por logar o que antes era logado nos métodos `pay`. Se tiver interesse em ver como era a implementação dos métodos `pay`, segue os links: [bitcoin diff](https://github.com/vinimdocarmo/aps2/commit/e5fecc3104f1e2efeb4a6e2020764a13bbd1dca7) e [nucanta diff](https://github.com/vinimdocarmo/aps2/commit/8c42ef30d5e2a6b19ed13ea927a3b59d0e4aa37b).

Já o aspecto `PaymentControllerAspect` é responsável por logar o pagamento que foi chamado no controller. Ele loga tanto o tipo quanto o valor do pagamento.
