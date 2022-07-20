package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.Cliente;

public class Teste {

    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 11);
        guardador.adiciona(cc2);

        Conta cc3 = new ContaCorrente(22, 11);
        guardador.adiciona(cc3);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(2);
        System.out.println(ref.getNumero());
    }
}
