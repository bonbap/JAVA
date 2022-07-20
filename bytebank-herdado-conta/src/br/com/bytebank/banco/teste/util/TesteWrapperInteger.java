package br.com.bytebank.banco.teste.util;

import java.util.*;

public class TesteWrapperInteger {

    public static void main(String[] args) {

        int[] idades = new int[5];

        String[] nomes = new String[5];

        int idade = 29;
        //Integer idadeRef = new Integer(29); – Integer que é o tipo objeto dentro do primitivo!


        String s = args[0];

        //Integer numero = Integer.valueOf(s);

        int numero = Integer.parseInt(s);
        System.out.println(numero);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29);

    }
}
