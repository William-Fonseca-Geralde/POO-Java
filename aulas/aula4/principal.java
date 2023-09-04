package aulas.aula4;

public class principal {
  public static void main(String[] args) {
    banco conta = new banco();

    conta.abrirConta("cc", 1234567, "João");
    conta.situacao();
  }
}
