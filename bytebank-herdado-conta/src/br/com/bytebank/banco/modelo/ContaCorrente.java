package br.com.bytebank.banco.modelo;

/**
 *
 * @author bon
 */
public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente () {

    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }        
    
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        double valorASacar = valor + 0.2;
        super.sacar(valorASacar);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

    @Override //Da classe Object
    public String toString() {
        return "ContaCorrente, " + super.toString();
    }
}
