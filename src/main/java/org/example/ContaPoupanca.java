package org.example;


public class ContaPoupanca extends Conta{

  @Override
  public void imprimirExtrato() {
    System.out.println("=== EXTRATO: Conta Poupança: " + super.saldo);
  }
}
