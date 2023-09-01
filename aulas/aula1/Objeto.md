# O que é um Objeto e uma Classe?

## Definição de Objeto

Um objeto é uma coisa existente que pode ser percebida pelos sentidos (olfato, tato, paladar, etc) e descrita por meio das suas características, comportamentos e estado atual. Pode se ter mais de um objeto mesmo tipo, e todos eles têm um padrão a ser seguido, com poucas diferenças, e esse padrão ou molde a ser seguido, é chamado de *Classe*.

### Exemplos
 
* Um celular tem a marca, tamanho, modelo, armazenamento e preço como características; se ele está ligado, desligado, em suspensão ou quebrado como estado desse objeto; e é possível fazer ligação, jogar, marcar, ler como comportamentos;

* Um compromisso pode ser considerado objeto, mesmo não parecer, tem dia e hora marcada, estilo de roupa, modo de falar como características; ele pode ser marcado, desmarcado, adiado, cancelado como comportamentos; e pode sersuspenso ou combinado ou está acontecendo como estado dele;

## Definição de Classe

Uma classe é o modelo que um objeto deve ser seguido, ou seja, todo os objetos tem que ter os mesmos tipos de atributos (características), métodos (comportamentos) e estado (estado atual) para ser classificada daquela classe. Quando é criado um objeto a partir de uma classe, é chamado de *instanciamento* de um objeto. Tudo o que foi feito de criar uma classe com seus atributos e métodos que vão ser utilizados, e depois instancia objetos atravéz dessa classe, é chamado de **Abstração**.

## Criando Classes e Objetos em Java

### Arquivo *pricipal.java*

```
package aulas.aula1.codigo;

public class principal {
  public static void main(String[] args){
    //instanciando um objeto
    caneta c1 = new caneta();
    
    //adicionado as características
    c1.cor = "Azul";
    c1.modelo = "Bic";
    c1.ponta = 0.5f;
    c1.tampar();
    c1.carga = 2;

    //mostrando o estado desse objeto
    c1.status();
    c1.rabiscar();

    //instanciando um novo objeto
    caneta c2 = new caneta();

    //adicionado as características
    c2.cor = "Vermelho";
    c2.modelo = "Bic";
    c2.ponta = 0.4f;
    c2.destampar();
    c2.carga = 3;

    //mostrando o estado desse objeto
    c2.status();
    c2.rabiscar();

  }
}
```

### Arquivo *caneta.java*

```
package aulas.aula1.codigo;

public class caneta {
  String modelo;
  String cor;
  float ponta;
  int carga;
  boolean tampada;

  void status(){
    System.out.println("Uma caneta " + this.modelo + ";");
    System.out.println("com coloração " + this.cor + ";");
    System.out.println("com ponta de " + this.ponta + "mm;");
    System.out.println("com uma carga de " + this.carga + ";");
    if (tampada == true) {
      System.out.println("e ela está tampada;");
    } else {
      System.out.println("e ela não está tampada;");
    }
  }

  void rabiscar(){
    if (this.tampada == true) {
      System.out.println("ERRO!! Não pode usar caneta, pois está tampada");
    } else {
      System.out.println("A caneta está sendo usada");
    }
  }

  void tampar(){
    this.tampada = true;
  }

  void destampar(){
    this.tampada = false;
  }
}
```