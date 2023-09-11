package aulas.aula5.codigo;

public class controleRemoto implements controlador {
  // Atributos
  private int volume;
  private boolean ligado;
  private boolean tocando;

  // Métodos Especiais
  public controleRemoto() {
    this.volume = 50;
    this.ligado = false;
    this.tocando = false;
  }

  public int getVolume() {
    return volume;
  }
  public void setVolume(int volume) {
    this.volume = volume;
  }

  public boolean isLigado() {
    return ligado;
  }
  public void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  public boolean isTocando() {
    return tocando;
  }
  public void setTocando(boolean tocando) {
    this.tocando = tocando;
  }

  // Métodos Abstratos
  @Override
  public void ligar() {
    setLigado(true);
  }
  
  @Override
  public void desligar() {
    setLigado(false);
  }
  
  @Override
  public void abrirMenu() {
    if (isLigado()) {
      System.out.println("Está Ligado");
    } else {
      System.out.println("Não está ligado");
    }

    if (isTocando()) {
      System.out.println("Está tocando");
    } else {
      System.out.println("Não está tocando");
    }

    System.out.print("Volume:  ");

    for (int i = 0; i < getVolume(); i+=10) {
      System.out.print("| ");
    }
  }
  
  @Override
  public void fecharMenu() {
    System.out.println("Fechando Menu...");
  }
  
  @Override
  public void aumentarVolume() {
    if (isLigado()) {
      setVolume(getVolume() + 5);
    }
  }
  
  @Override
  public void diminurVolume() {
    if (isLigado()) {
      setVolume(getVolume() - 5);
    }
  }
  
  @Override
  public void ligarMudo() {
    if (isLigado() && getVolume() > 0) {
      setVolume(0);
    }
  }
  
  @Override
  public void desligarMudo() {
    if (isLigado() && getVolume() == 0) {
      setVolume(50);
    }
  }
  
  @Override
  public void play() {
    if (isLigado() && !isTocando()) {
      setTocando(true);
    }
  }
  
  @Override
  public void pause() {
    if (isLigado() && isTocando()) {
      setTocando(false);
    }
  }
}
