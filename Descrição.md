# PayParça
## Propósito
O sistema tem como propósito ser um concorrente de baixo nível do PayPal. Dentre outros diferenciais o PayParça tem integração para pagamento com sua carteira BitCoin e sua conta NuConta.

O usuário do sistema poderá adicionar sua conta NuConta ao sistema e a sua carteira BitCoin. Quando da efetuação de um pagamento, o usuário irá escolher em quais dos dois serviços o débito deve ser feito. Para isso o PayParça primeiro faz uma validação com o serviço em questão para saber se o usuário pode ou não efetuar este pagamento.

Se o usuário tiver dinheiro em sua conta, o pagamento será efetuado. Caso contrário o sistema deve pedir para que ele escolha outro meio de pagamento.

Para fins de teste, será construída classes que representarão a API do NuConta e da carteira BitCoin.