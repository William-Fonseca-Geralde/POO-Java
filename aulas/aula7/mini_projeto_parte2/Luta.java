package aulas.aula7.mini_projeto_parte2;

import java.util.Random;

public class Luta{
  private Lutador desafiado, desafiante;
  private int rounds;
  private boolean aprovada;

  public Lutador getDesafiado() {
    return desafiado;
  }
  public void setDesafiado(Lutador desafiado) {
    this.desafiado = desafiado;
  }

  public Lutador getDesafiante() {
    return desafiante;
  }
  public void setDesafiante(Lutador desafiante) {
    this.desafiante = desafiante;
  }

  public int getRounds() {
    return rounds;
  }
  public void setRounds(int rounds) {
    this.rounds = rounds;
  }

  public boolean isAprovada() {
    return aprovada;
  }
  public void setAprovada(boolean aprovada) {
    this.aprovada = aprovada;
  }

  public void marcarLuta(Lutador l1, Lutador l2){
    if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
      setAprovada(true);
      setDesafiado(l1);
      setDesafiante(l2);
    } else {
      setAprovada(false);
      setDesafiado(null);
      setDesafiante(null);
    }
  }

  public void lutar(){
    if (isAprovada()) {
      System.out.println("***********LUTA***********");
      desafiado.apresentar();
      desafiante.apresentar();

      Random randomizador = new Random();
      int vencedor = randomizador.nextInt(3); // gera os valores 0 1 2

      System.out.println("------------RESULTADO------------");
      switch (vencedor) {
        case 0: //Empate
          System.out.println("EMPATE!!!!");
          desafiado.empatarLuta();
          desafiante.empatarLuta();
          break;
        case 1: //Desafiado ganhou
          System.out.println("O " + getDesafiado() + " Ganhou de " + getDesafiante());
          desafiado.ganharLuta();
          desafiante.perderLuta();
          break;
        case 2: //Desafiante ganhou
          System.out.println("O " + getDesafiante() + " Ganhou de " + getDesafiado());
          desafiado.perderLuta();
          desafiante.ganharLuta();
          break;
        default:
          break;
      }
      System.out.println("---------------------------------");
    } else {
      System.out.println("Não existe luta ou não é possível");
    }
  }
}
