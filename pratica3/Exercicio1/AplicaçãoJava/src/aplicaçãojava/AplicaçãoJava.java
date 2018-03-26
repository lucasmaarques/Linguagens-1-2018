package aplicaçãojava;

import linguagens1.Conta;
//USANDOLIB
public class AplicaçãoJava {

    public static void main(String[] args) {
        Conta conta1 = new Conta("111",100000,"Lucas","Marques","11111");
        Conta conta2 = new Conta("222",200000,"Arthur","Novello","22222");
        
        System.out.println("Conta 1 (SALDO) :" + conta1.visualizarSaldo());
        System.out.println("Conta 2 (SALDO) :" + conta2.visualizarSaldo());
        conta2.transferirDinheiro(2500, conta1);
        System.out.println("Conta 1 (SALDO) :" + conta1.visualizarSaldo());
        System.out.println("Conta 2 (SALDO) :" + conta2.visualizarSaldo());
        
    }

}
