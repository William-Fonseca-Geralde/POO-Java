package aulas.aula8;

public class Principal {
  public static void main(String[] args) {
    Pessoa[] p = new Pessoa[2];
    Livro[] l = new Livro[3];

    p[0] = new Pessoa("Jorge", 21, "M");
    p[1] = new Pessoa("Luana", 19, "F");

    l[0] = new Livro("História Humana", "Leandro da Silva", p[0], 250);
    l[1] = new Livro("Alice no Mundo Real", "Rick Alfred", p[0], 500);
    l[2] = new Livro("História de Verão", "Kenny Wilston", p[1], 340);

    l[0].abrir();
    l[0].avancarPag();
    l[0].folhear(17);

    l[0].detalhes();
  }
}
