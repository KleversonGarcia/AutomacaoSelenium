# language: pt
Funcionalidade: Validar o carrinho de compras do site.

  Esquema do Cenário: Usuario ao fazer login no site demora para aparecer a tela de produtos.
    Dado que o Usuario tenta fazer o login com o username "<username>" e password "<password>"
    Entao apos feito login demora para apresentar todos os produtos

    Exemplos:

      | username                | password     |
      | performance_glitch_user | secret_sauce |
