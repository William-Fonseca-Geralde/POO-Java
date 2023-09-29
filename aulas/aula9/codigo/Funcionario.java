package aulas.aula9.codigo;

public class Funcionario extends Pessoa {
  private String setor;
  private boolean trabalhando;

  public void mudarTrabalho(){
    setTrabalhando(!isTrabalhando());
  }

  public String getSetor() {
    return setor;
  }
  public void setSetor(String setor) {
    this.setor = setor;
  }

  public boolean isTrabalhando() {
    return trabalhando;
  }
  public void setTrabalhando(boolean trabalhando) {
    this.trabalhando = trabalhando;
  }
}