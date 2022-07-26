package br.com.bytebank.banco.modelo;

/**
 * Classe Representa a moldura de uma conta
 * @author bon
 * @version 1.0
 */

public abstract class Conta extends Object implements Comparable<Conta> {
    
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;
    
        
    public Conta(int agencia, int numero) {
        Conta.total++;
        //System.out.println("O total de contas é: " + total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        //System.out.println("Estou criando uma conta" + numero);
    }

    protected Conta() {
    }


    public abstract void deposita(double valor);
   
    public void sacar (double valor) throws SaldoInsuficienteException {
        
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);            
        }
        
        this.saldo -= valor;
        
    }
    
    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.sacar(valor);
        destino.deposita(valor);
            
        
    } 
    
    public double getSaldo () {
        return this.saldo;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não pode número menor ou igual a 0");
        }
        
       this.numero = numero; 
    }
    
    public int getAgencia() {
        return this.agencia;
    }
    
    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Não pode valor menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }
    
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    public Cliente getTitular() {
        return titular;
    }
    
    public static int getTotal() {
        return Conta.total;
    }

    @Override
    public int compareTo(Conta outra) {

        return Double.compare(this.saldo, outra.saldo);
    }

    @Override
    public boolean equals(Object obj) {

        Conta outra = (Conta) obj;

        if(this.agencia != outra.agencia) {
            return false;
        }

        if(this.numero != outra.numero) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Numero:  " + this.numero + ", Agencia: " + this.agencia;
    }



}
