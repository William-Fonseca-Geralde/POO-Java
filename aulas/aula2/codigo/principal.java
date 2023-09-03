package aulas.aula2.codigo;

public class principal {
  public static void main(String[] args){
    //instanciando um objeto
    caneta c1 = new caneta();

    c1.modelo = "BIC";
    c1.cor = "Verde";
    // c1.ponta = 0.5f; não funciona, já que a ponta é "private"
    c1.carga = 80; // funciona, pois a classe "main" permite a modificação de uma outra classe que foi declarada dentro dessa classe
    c1.tampar(); // o método tampar funciona, pois na classe "caneta" tem acesso ao atributo "tampada", e já que o método está lá também, ela tem acesso à esse atributo, podendo assim, modificar o atributo "tampada" sem precisar modificar diretamente ela

    c1.status();
  }
}
