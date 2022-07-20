package br.com.bytebank.banco.teste;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.bytebank.banco.modelo.*;

/**
 *
 * @author bon
 */
public class TesteSaca {
    
    public static void main(String[] args) throws SaldoInsuficienteException {
        Conta conta = new ContaCorrente(123, 321);
        
        conta.deposita(200.0);
        try {
            conta.sacar(210.00);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("EX: " + ex.getMessage());
        }
        System.out.println(conta.getSaldo());
                
    }
    
}
