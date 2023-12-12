# language: pt
Funcionalidade: Validar o carrinho de compras do site.

  Esquema do Cenário: Usuario logado no site, coloca um produto no carrinho de compras, valor esta correto e efetua o logoff.
    Dado que o usuario faz o login com o username "<username>" e password "<password>"
    Quando seleciona o produto e clica em comprar
    Entao valida se os valores do carrinho esta correto
    E faz o logoff

    Exemplos:

      | username      | password     |
      | standard_user | secret_sauce |
