# language: pt
Funcionalidade: Validar o carrinho de compras do site.

  Esquema do Cenário: Usuario tenta fazer login no site e apresenta mensagem de erro que o usuario esta bloqueado.
    Dado que o usuario tenta fazer o login com o username "<username>" e password "<password>"
    Entao entao recebe a mensagem "<mensagem>" de erro

    Exemplos:

      | username        | password     | mensagem                                            |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out. |
