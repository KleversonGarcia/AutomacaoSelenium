# language: pt
Funcionalidade: Validar o carrinho de compras do site.

  Esquema do Cenário: Usuario ao fazer login no site apresenta produto da lista com imagem errada.
    Dado  usuario tenta fazer o login com o username "<username>" e password "<password>"
    Entao apos feito login apresenta imagem "<img>" do produto errado

    Exemplos:

      | username    | password     | img                            |
      | visual_user | secret_sauce | //*[@id='item_4_img_link']/img |
