package aulas.aula1.principal;

public class principal {
  public static void main(String[] args){
    caneta c1 = new caneta();
    
    c1.cor = "Azul";
    c1.modelo = "Bic";
    c1.ponta = 0.5f;
    c1.tampada = false;
    c1.carga = 2;

    c1.status();
  }
}
