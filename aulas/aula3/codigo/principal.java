package aulas.aula3.codigo;

public class principal {
  public static void main(String[] args) {
    caneta c1 = new caneta("BIC", 0.4f, "Azul");

    c1.status();

    caneta c2 = new caneta("BIC", 0.5f, "Vermelho");

    c2.status();
  }
}
