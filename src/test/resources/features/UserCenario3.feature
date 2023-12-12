# language: pt
Funcionalidade: Validar o carrinho de compras do site.

  Esquema do Cenário: Usuario ao fazer login no site apresenta todos os produtos com mesma imagem.
    Dado que o usuario tenta fazer o login com o username: "<username>" e password: "<password>"
    Entao apos feito login apresenta todos os produtos com a mesma imagem "<img>"

    Exemplos:

      | username     | password     | img                            |
      | problem_user | secret_sauce | //*[@id='item_4_img_link']/img |
