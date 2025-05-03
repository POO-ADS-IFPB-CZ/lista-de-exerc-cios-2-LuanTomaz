Questão 1 - Usar getters e setters em vez de tornar os atributos públicos é considerado uma boa prática por motivos de encapsulamento. O encapsulamento é um dos pilares da programação orientada a objetos e tem como objetivo esconder os detalhes internos de uma classe, permitindo que você controle como os dados são acessados e modificados.

Vantagens:
Encapsulamento: Protege os dados internos da classe.
Validação: Permite verificar valores antes de modificar atributos.
Controle de acesso: É possível permitir apenas leitura ou escrita.
Flexibilidade: Facilita mudanças internas sem afetar o código externo.
Manutenção e segurança: Deixa o código mais organizado e confiável.

Exemplo:
Imagine uma classe chamada Pessoa, que possui um atributo chamado idade. Se deixarmos esse atributo público, qualquer parte do programa poderá atribuir um valor inválido, como uma idade negativa. Para evitar isso, usamos um setter que valida o valor antes de atribuí-lo.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Questão 2 - 

a)
Título, autor, editora, ano de publicação, gênero, código e número de páginas.

b)
Podemos dizer que a classe Livro é uma abstração porque ela representa, no código, as características e comportamentos essenciais de um livro no contexto do sistema da biblioteca, sem se preocupar com os detalhes físicos do livro em si.

c)
- emprestar(): Atualiza o status do livro para "emprestado" e reduz o número de exemplares disponíveis.
- devolver(): Atualiza o status do livro para "disponível" e aumenta o número de exemplares disponíveis.
- estaDisponivel(): Verifica se há exemplares disponíveis para empréstimo.

  
