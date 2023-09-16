package aulas.aula6.mini_projeto_parte1;

public class Lutador {
  private String nome, nacionalidade, categoria;
  private int idade, vitorias, derrotas, empates;
  private float altura, peso;

  //Método Construtor
  public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, float altura, float peso) {
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.idade = idade;
    this.vitorias = vitorias;
    this.derrotas = derrotas;
    this.empates = empates;
    this.altura = altura;
    setPeso(peso);
  }

  //Métodos Getters e Setters
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getPeso() {
    return peso;
  }
  public void setPeso(float peso) {
    this.peso = peso;
    setCategoria();
  }

  public String getCategoria() {
    return categoria;
  }
  private void setCategoria() {
    if (getPeso() < 52.2) {
      this.categoria = "Inválido";
    } else if (getPeso() <= 70.3) {
      this.categoria = "Leve";
    } else if (getPeso() <= 83.9){
      this.categoria = "Médio";
    } else if (getPeso() <= 120.2) {
      this.categoria = "Pesado";
    } else {
      this.categoria = "Inválido";
    }
  }

  public String getNacionalidade() {
    return nacionalidade;
  }
  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getVitorias() {
    return vitorias;
  }
  public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
  }

  public int getDerrotas() {
    return derrotas;
  }
  public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
  }

  public int getEmpates() {
    return empates;
  }
  public void setEmpates(int empates) {
    this.empates = empates;
  }

  public float getAltura() {
    return altura;
  }
  public void setAltura(float altura) {
    this.altura = altura;
  }

  //Métodos Principais
  public void ganharLuta(){
    setVitorias(getVitorias() + 1);
  }

  public void perderLuta(){
    setDerrotas(getDerrotas() + 1);
  }

  public void empatarLuta(){
    setEmpates(getEmpates() + 1);
  }

  public void apresentar(){
    System.out.println("Nome do Lutador: " + getNome());
    System.out.println("Origem: " + getNacionalidade());
    System.out.println("Idade: " + getIdade());
    System.out.println("Altura: " + getAltura() + "m");
    System.out.println("Peso: " + getPeso() + "kg");
    System.out.println("Total de de Vitórias/Derrotas/Empates: " + getVitorias() + " / " + getDerrotas() + " / " + getEmpates());
  }

  public void status(){
    System.out.println("Nome do Lutador: " + getNome() + " de peso " + getCategoria());
    System.out.println("Total de de Vitórias/Derrotas/Empates: " + getVitorias() + " / " + getDerrotas() + " / " + getEmpates());
  }
}
