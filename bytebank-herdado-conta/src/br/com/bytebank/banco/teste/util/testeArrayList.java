package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.*;

import java.util.ArrayList;

public class testeArrayList {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        ArrayList<String> nomes = new ArrayList<String>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 33);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(22, 44);
        lista.add(cc4);



        System.out.println(lista.size());

        Conta ref  = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

        for(int i = 0; i < lista.size(); i++) {
            Conta oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("-----------------------");

        for(Conta conta : lista) {
            System.out.println(conta);
        }



    }

}