package Banco;

public class Teste {
    
    public static void main(String[] args) {
        
        Conta cc = new Conta();
        cc.saldo = 500.0;
        cc.agencia = 3030;
        cc.numero = 45;

        cc.depositar(1000);

        System.out.println(cc.verificarSaldo() );


        Conta poupanca = new Conta();
        poupanca.saldo = 1000;
        poupanca.agencia = 4578;
        poupanca.numero = 10;

        poupanca.depositar(100);
        poupanca.retirar(200);

        System.out.println(poupanca.verificarSaldo() );




    }
}
