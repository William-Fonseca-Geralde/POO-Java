package aulas.aula3.codigo;

public class caneta {
  private String modelo;
  private float ponta;
  private String cor;
  private boolean tampada;

  // Método Construtor
  public caneta(String modelo, float ponta, String cor) {
    this.modelo = modelo;
    this.ponta = ponta;
    this.cor = cor;
    setTampada(true);
  }

  // Métodos Acessores (getters) e Modificadores (setters)
  public String getModelo() {
    return modelo;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public float getPonta() {
    return ponta;
  }
  public void setPonta(float ponta) {
    this.ponta = ponta;
  }

  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }

  // O Get de um atributo do tipo Boolean é usando "is(nome do atributo)"
  public boolean isTampada() {
    return tampada;
  }
  public void setTampada(boolean tampada) {
    this.tampada = tampada;
  }

  
  public void status(){
    System.out.println("Sobre a Caneta:");
    System.out.println("Modelo: " + this.getModelo() + ";");
    System.out.println("Cor: " + this.getCor() + ";");
    System.out.println("Ponta: " + this.getPonta() + ";");

    if (isTampada() == true) {
      System.out.println("Está tampada;");
    } else {
      System.out.println("NÃO está tampada;");
    }
  }

  

  
}
