package aulas.aula9.codigo;

public class Principal {
  public static void main(String[] args) {
    Pessoa p = new Pessoa();
    Aluno alu = new Aluno();
    Professor prof = new Professor();
    Funcionario func = new Funcionario();

    p.setNome("Pedro");
    alu.setNome("Maria");
    prof.setNome("Cláudio");
    func.setNome("Fabiana");

    alu.setCurso("Informática");
    prof.setSalario(2500);
    func.setSetor("Estoque");
  }
}
