package aulas.aula8;

public class Livro implements Publicacao{
  private String titulo, autor;
  private Pessoa leitor;
  private int totalPaginas, paginaAtual;
  private boolean aberto;

  public Livro(String titulo, String autor, Pessoa leitor, int totalPaginas) {
    this.titulo = titulo;
    this.autor = autor;
    this.leitor = leitor;
    this.totalPaginas = totalPaginas;
    setAberto(false);
    setPaginaAtual(0);
  }

  public void detalhes(){
    System.out.println("A(O) " + leitor.getNome() + "está lendo:");
    System.out.println(getTitulo() + " e está na página " + getPaginaAtual() + "/" + getTotalPaginas());
  }

  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }
  public void setAutor(String autor) {
    this.autor = autor;
  }

  public Pessoa getLeitor() {
    return leitor;
  }
  public void setLeitor(Pessoa leitor) {
    this.leitor = leitor;
  }

  public int getTotalPaginas() {
    return totalPaginas;
  }
  public void setTotalPaginas(int totalPaginas) {
    this.totalPaginas = totalPaginas;
  }

  public int getPaginaAtual() {
    return paginaAtual;
  }
  public void setPaginaAtual(int paginaAtual) {
    this.paginaAtual = paginaAtual;
  }

  public boolean isAberto() {
    return aberto;
  }
  public void setAberto(boolean aberto) {
    this.aberto = aberto;
  }

  @Override
  public void abrir() {
    setAberto(true);
  }

  @Override
  public void fechar() {
    setAberto(false);
  }

  @Override
  public void folhear(int pag) {
    setPaginaAtual(pag);
  }

  @Override
  public void avancarPag() {
    setPaginaAtual(getPaginaAtual() + 1);
  }

  @Override
  public void voltarPag() {
    setPaginaAtual(getPaginaAtual() - 1);
  }
}
