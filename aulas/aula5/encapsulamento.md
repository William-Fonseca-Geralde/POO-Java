# Os Pilares de POO

Na teoria da Orientação à Objeto, existem quatro pilares principais:
- Abstração;
- Encapsulamento;
- Herança e;
- Polimorfismo.

Em algumas bibliografias, eles explicam que há apenas três pilares, sendo o pilar de _Abstração_ pertencendo ao pilar do _Encapsulamento_.

## Encapsulamento e Abstração

O encapsulamento tem como definição esconder do usuário/programador partes independentes da implementação, impedindo ele a estragar o código, e como já dito antes, a _abstração_ pode se juntar ao _encapsulamento_, pois quando você abstrai, ou seja, trazer um objeto da vida real para o mundo virtual, esse objeto já vai sendo encapsulado para que esse objeto não seja modificado pelos usuários.

Encapsular seu programa não é obrigatório, mas traz vantagens como:
- Tornar mudanças invisíveis;
- Poder reutilizar código e;
- Reduzir problemas.

Na hora de encapsular, deve-se definir o que vai ser visível ou não ao usuário, é daí que é usado a visibilidade (_public_, _private_ e _protected_). A lista de métodos que tem acesso ao mundo real, é chamado de **_Interface_**, nela é colocado todos os métodos que vão ser usados pelos usuários, ou seja, esses métodos são **Públicos**, enquanto os atributos e até métodos que não podem sofrer alteração ou ser usado de forma direta são **Privados** ou **Protegidos**.

_Observação_: É recomendável os métodos _Getters_ e _Setters_ serem colocados como **Públicos**.