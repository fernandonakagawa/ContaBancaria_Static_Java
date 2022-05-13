/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author senai
 */
public class ContaBancaria {
    
    public static int quantidadeContas = 0;
    private static float somaSaldos = 0;
    
    public int agencia;
    public int numero;
    public String nome;
    public float saldo;
    
    public ContaBancaria(int agencia, int numero,
            String nome, float saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        quantidadeContas++;
        somaSaldos += saldo;
    }
    public boolean sacar(float qtd){
        if(this.saldo >= qtd){
            this.saldo -= qtd;
            somaSaldos -= qtd;
            return true;
        }
        return false;
    }
    
    public static float getSaldos(){
        return somaSaldos;
        //return this.saldo;
    }
    public static ContaBancaria unirContas(
            ContaBancaria c1, ContaBancaria c2){
        ContaBancaria c3 = new ContaBancaria(
                c1.agencia, c1.numero, 
                c1.nome + " e " + c2.nome, 
                c1.saldo + c2.saldo);
        return c3;
    }
}
