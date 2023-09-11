package aulas.aula5.codigo;

public class principal {
  public static void main(String[] args) {
    controleRemoto c = new controleRemoto();

    c.ligar();
    c.aumentarVolume();
    c.abrirMenu();
    c.fecharMenu();
  }
}
