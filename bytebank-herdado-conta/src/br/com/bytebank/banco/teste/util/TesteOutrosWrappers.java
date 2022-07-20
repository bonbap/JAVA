package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29); //Autoboxing
        System.out.println(idadeRef.intValue()); //Unboxing


        Double dRef = Double.valueOf(3.2); //Autoboxing
        System.out.println(dRef.doubleValue()); //unboxing

        Boolean bRef = Boolean.TRUE; //Autoboxing
        System.out.println(bRef.booleanValue()); //Unboxing

        Number refnumero = Integer.valueOf((int) 29.9f); //Autoboxing

        List<Number> lista = new ArrayList<>();


    }
}
