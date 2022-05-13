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
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBancaria cb1 = 
                new ContaBancaria(1000, 100, "Fernando", 100f);
        ContaBancaria cb2 = 
                new ContaBancaria(1000, 101, "Alexandre", 10000f);
        ContaBancaria cb3 = 
                new ContaBancaria(1000, 102, "Daniel", 100000f);
        System.out.println(cb1.sacar(100));
        ContaBancaria cb4 = 
                new ContaBancaria(1000, 104, "João", 10f);
        ContaBancaria cb5 = 
                new ContaBancaria(1000, 105, "Maria", 15f);
        System.out.println(cb1.sacar(100));
        System.out.println(ContaBancaria.quantidadeContas);
        System.out.println(ContaBancaria.getSaldos());
        //System.out.println(ContaBancaria.sacar(100));
        //System.out.println(cb1.getSaldos());
        ContaBancaria cb6 = ContaBancaria.unirContas(cb4, cb5);
    }
}
