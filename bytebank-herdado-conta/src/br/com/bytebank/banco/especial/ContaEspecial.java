package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

/**
 * Classe Representa a moldura de uma conta especial.
 * @author bon
 * @version 1.0
 */

public class ContaEspecial extends Conta {

    public ContaEspecial(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
