# contatim

Projeto simples para fazer em live, onde um usuário poderá registrar muitos contatos e esses contatos terão muitas formas de contato.

## Usuário
Será o usuario que registrará os contatos, este possuem um id, nome, email, senha, uma minibiografia e uma lista de contatos.

## Contato
Será o contato de um usuário, este terá um id, nome, nível de intimidade com o usuário (por padrão este deverá ser 0), o id do usuário e uma lista com as formas de contato.

## Forma de contato
Será uma das formas que o usuário terá para encontrar o contato, este terá um id, forma (que é a forma de contato propriamente dita, como um telefone, email, facebook, whatsapp, etc), uma descrição (que deverá ser o numero do telefone, link do face, etc) e o id do contato