# language: pt
Funcionalidade: Validar o carrinho de compras do site.

  Esquema do Cenário: Usuario logado no site, coloca um produto no carrinho de compras, valor esta correto e efetua o logoff.
    Dado usuario faz o login com o username: "<username>" e password: "<password>"
    Quando seleciona os produtos e clica em comprar
    Entao valida se os valores estao correto
    E faz o logof

    Exemplos:

      | username   | password     |
      | error_user | secret_sauce |
