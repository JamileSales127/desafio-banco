package org.example;

public class ContaCorrente extends Conta{

  @Override
  public void imprimirExtrato() {
    System.out.println("=== EXTRATO: Conta Corrente: " + super.saldo);
  }

}
