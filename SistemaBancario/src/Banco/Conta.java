package Banco;

// Estrutura da Classe Completa, possui três atributso como
// ( depositar, retirar e verificar o saldo) caracteriza
// tem dois tipos de constrtores o padrão e construtor de classe e três metodos
// que caracteriza essa classe conta construida.

public class Conta {
    
    int agencia;
    int numero;
    double saldo;

    public Conta() {

    }

    public Conta(int agencia, int numero, double saldo){

        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;

    }
    
    public void depositar(double valor){

        this.saldo = + saldo + valor;

    }

    public void retirar(double valor){

        this.saldo = saldo - valor;

    }

    public double verificarSaldo(){

        return this.saldo;
    }








}
