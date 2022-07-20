package br.com.bytebank.banco.modelo;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bon
 */
public class CalculadorImposto implements Tributavel{
    
    private double totalImposto;
    
    public void registra(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    @Override
    public double getValorImposto() {
        return totalImposto;
    }
    
}
