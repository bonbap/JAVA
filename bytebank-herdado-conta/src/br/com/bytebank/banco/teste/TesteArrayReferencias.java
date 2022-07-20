package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        Object[] contas = new Object[5];

        System.out.println(contas.length);

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        contas[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 12);
        contas[1] = cc2;

        Cliente cliente = new Cliente();
        contas[2] = cliente;
        Cliente referencia = (Cliente) contas[1];


        ContaPoupanca ref = (ContaPoupanca) contas[1]; //typeCast

        System.out.println(ref.getNumero());
        System.out.println(referencia.getNome());




    }

}
