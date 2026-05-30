/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contateste;

import javax.swing.JOptionPane;

/**
 *
 * @author android
 */
public class Conta {

    private String cliente;
    private double saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void exebirSaldo() {
        JOptionPane.showMessageDialog(null, cliente + "\nSaldo e: R$ " + saldo);
    }

    void sacar(double valor) {
        JOptionPane.showMessageDialog(null, cliente +
                "\nOperacao de Saque"+
                "\nValor de: R$" + saldo);
        saldo -= valor;
    }

    void depositar(double valor) {
        JOptionPane.showMessageDialog(null, cliente +
                "\n Operacao de Deposito" +
                "\nVvalor de R$ " + saldo);
        saldo += valor;
    }

    void transferirPara(Conta destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);
        System.out.println("");
     
        JOptionPane.showMessageDialog(null, this.cliente +
                "\nTranferencia de R$ " +
                valor + "\n para: " + destino.cliente);
    }
}