package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    Conta cc = new ContaCorrente();
    Conta cp = new ContaPoupanca();
    cp.listaCliente();
    cp.depositar(100);

    cp.adicionarCliente("Fabia");
    cp.adicionarCliente("Marcos");
    cp.adicionarCliente("Julia");

    cp.imprimirListaCliente();
//    cp.transferir(50, cc);
//    cp.imprimirExtrato();
//    cc.imprimirExtrato();
  }
  }