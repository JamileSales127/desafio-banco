package org.example;

public interface IConta {
  void sacar(double valor);

  void imprimirListaCliente();
  void depositar(double valor);
  void transferir(double valor, Conta contaDestino);
  void imprimirExtrato();
  void adicionarCliente(String nome);

}
