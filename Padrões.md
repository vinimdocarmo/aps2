# Equipe

Vinícius Magalhães do Carmo

# Caso de Uso

O caso de uso implementado foi _Efetuação de um pagamento_.

# Padrões de Projeto
## Expert (GOF)
A classe `NuContaPayment` conhece a API `NuContaAPI` relacionada a esse serviço.

A classe `BitCoinPayment`  conhece a API `BitCoinWalletAPI`.

## High Cohesion (GOF)

A classe `NuContaPayment` é coesa pois tem operações relacionadas apenas ao pagamento pela conta NuConta.

## Controller (GOF)
A classe `PaymentController` é a responsável por lidar com o evento de um pagamento de um valor.

## Factory
Criei a classe `PaymentFactory` que tem como objetivo criar uma instância de `NuContaPayment` our `BitCoinPayment` dependendo do tipo passado como argumento.

## Facade
A classe `PaymentFacade` oferece uma interface única para um conjunto
de interfaces de pagamentos do sistema.
