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
