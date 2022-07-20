package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

/**
 *
 * @author bon
 */
public class TesteTributaveis {
    
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.00);
        
        SeguroDeVida seguro = new SeguroDeVida();
        
        CalculadorImposto calc = new CalculadorImposto();
        calc.registra(cc);
        calc.registra(seguro);
        
        System.out.println(calc.getValorImposto());
    }
    
}
