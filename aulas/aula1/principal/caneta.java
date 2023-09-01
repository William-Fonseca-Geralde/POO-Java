package aulas.aula1.principal;

public class caneta {
  String modelo;
  String cor;
  float ponta;
  int carga;
  boolean tampada;

  void status(){
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

  void rabiscar(){
    if (this.tampada == true) {
      System.out.println("ERRO!! Não pode usar caneta, pois está tampada");
    } else {
      System.out.println("A caneta está sendo usada");
    }
  }

  void tampar(){
    this.tampada = true;
  }

  void destampar(){
    this.tampada = false;
  }
}
