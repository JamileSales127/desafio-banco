package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta{
  private static final int AGENCIA_PADRAO = 0001;
  private static int SEQUENCIAL = 1;
  protected int agencia;
  protected int numero;
  protected double saldo = 0;
  protected List<Cliente> listClient ;


  public Conta() {
    this.agencia = Conta.AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
  }

  public  void listaCliente(){
    this.listClient = new ArrayList<>();
  }

  public void adicionarCliente(String nome){
    listClient.add(new Cliente(nome));

  }

  @Override
  public void sacar(double valor) {
    this.saldo -= valor;
  }

  @Override
  public void imprimirListaCliente(){
    System.out.println(listClient);
  }

  @Override
  public void depositar(double valor) {
    this.saldo += valor;
  }

  @Override
  public void transferir(double valor, Conta contaDestino) {
    this.saldo -= valor;
    contaDestino.depositar(valor);
  }


  public int getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

  public int getAgencia() {
    return agencia;
  }


}
