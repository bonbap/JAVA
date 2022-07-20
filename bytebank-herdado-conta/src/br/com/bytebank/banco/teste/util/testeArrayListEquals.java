package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class testeArrayListEquals {

    public static void main(String[] args) {

        Collection<Conta> lista = new LinkedList<Conta>(); //Polimorfismo!

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 22);

        boolean existe = lista.contains(cc3);
        System.out.println("Já existe? " + existe);
        System.out.println("Tamanho: " + lista.size());

        for(Conta conta : lista) {
            System.out.println(conta);
        }

        for(Conta conta : lista) {
            if(conta.equals(cc3)) {
                System.out.println("Já tenho essa conta!");
            }
        }



    }

}