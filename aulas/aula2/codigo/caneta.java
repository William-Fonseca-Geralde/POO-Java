package aulas.aula2.codigo;

public class caneta {
  public String modelo;
  public String cor;
  private float ponta;
  protected int carga;
  private boolean tampada;

  public void status(){
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

  public void rabiscar(){
    if (this.tampada == true) {
      System.out.println("ERRO!! Não pode usar caneta, pois está tampada");
    } else {
      System.out.println("A caneta está sendo usada");
    }
  }

  public void tampar(){
    this.tampada = true;
  }

  public void destampar(){
    this.tampada = false;
  }
}
