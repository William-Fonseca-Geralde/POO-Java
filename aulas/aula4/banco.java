package aulas.aula4;

public class banco {
  private String nome;
  protected String tipoConta;
  public int numConta;
  private float saldo;
  private boolean status;

  public banco() {
    this.saldo = 0;
    this.status = false;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTipoConta() {
    return tipoConta;
  }
  public void setTipoConta(String tipoConta) {
    this.tipoConta = tipoConta;
  }

  public int getNumConta() {
    return numConta;
  }
  public void setNumConta(int numConta) {
    this.numConta = numConta;
  }

  public float getSaldo() {
    return saldo;
  }
  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  public boolean isStatus() {
    return status;
  }
  public void setStatus(boolean status) {
    this.status = status;
  }


  public String abrirConta(String tipo, int num, String nome){
    if (isStatus() == false) {
      setTipoConta(tipo);
      setNumConta(num);
      setNome(nome);
      setStatus(true);

      if (getTipoConta() == "cc") {
        setSaldo(50);
      } else if (getTipoConta() == "cp"){
        setSaldo(150);
      }

      return "Conta criada";
    } else {
      return "Já existe Conta";
    }
  }

  public String depositar(float dinheiro){
    if (isStatus() == true) {
      saldo = getSaldo();
      setSaldo(saldo + dinheiro);

      return "Depositado!!!";
    } else {
      return "Não tem conta aberta";
    }
  }

  public String sacar(float dinheiro){
    if (isStatus() == true) {
      if (getSaldo() > 0) {
        saldo = getSaldo();
        setSaldo(saldo - dinheiro);

        return "Sacado!!!";
      } else {
        return "Não tem dinheiro o suficiente para sacar";
      }
    } else {
      return "Não tem conta aberta";
    }
  }
  
  public String fecharConta(){
    if (isStatus() == true) {
      if (getSaldo() >= 0) {
        saldo = getSaldo();
        setSaldo(saldo - saldo);
        setTipoConta(null);
        setNumConta(0);
        setNome(null);
        setStatus(false);
        return "Conta Fechada!!!";
      } else {
        return "A conta NÃO pode ser fechada, pois você está devendo";
      } 
    } else {
      return "Não existe conta aberta";
    }
  }

  public void pagarMensalidade(){
    if (getTipoConta() == "cc") {
      saldo = getSaldo();
      sacar(12);
    } else if (getTipoConta() == "cp") {
      saldo = getSaldo();
      sacar(20);
    }
  }

  public void situacao(){
    if (isStatus() == true) {
      System.out.println("Conta Aberta: ");
      if (getTipoConta() == "cc") {
        System.out.println("Tipo de conta: Corrente");
      } else if (getTipoConta() == "cp") {
        System.out.println("Tipo de conta: Poupança");
      }
      System.out.println("Nome do Dono: " + getNome());
      System.out.println("Número da conta " + getNumConta());
      System.out.println("Saldo na conta: " + getSaldo());
    } else {
      System.out.println("Conta Fechada!!!");
    }
  }
}
