
package com.mycompany.banco;

/**
 *
 * @author arthur.sbsouza
 */
public class Conta {
    
    private int numero;
    private int agencia;
    private String titular;
    private double saldo;
    
    public Conta(){
        
    }

    public Conta(int numero, int agencia, String titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
    }
    
    public double calcularSaldo(){
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "titular=" + titular + '}';
    }
    
    
    
    

    
    
    
}
