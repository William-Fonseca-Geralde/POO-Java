package aulas.aula9.codigo;

public class Pessoa {
  protected String nome;
  protected int idade;
  protected String sexo;

  public String getNome(){
    return this.nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public void fazerAniver(){
    setIdade(getIdade() + 1);
  }
}
