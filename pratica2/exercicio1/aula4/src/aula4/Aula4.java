package aula4;

public class Aula4 {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        
        Conta c2;
        c2 = new Conta();
        c2.saldo = 82000;
        c2.numeroConta = 10380836;
        c2.cliente.nome = "Sergio Felipe";
        c2.cliente.cpf = "394.369.398-84";
        c1.cliente.cpf = "484.797.738-63";
        c1.saldo = 82000;
        c1.cliente.nome = "Lucas Marques";
        c1.numeroConta = 010207073;

        System.out.println("CPF 1: " + c1.cliente.cpf);
        System.out.println("Saldo 1: " + c1.saldo);
        System.out.println("CPF 2: " + c1.cliente.cpf);
        System.out.println("Saldo 2: " + c1.saldo);
        System.out.println("Sacou 1: " + (c1.sacar(10000)));
        System.out.println("Saldo 1: " + c1.saldo);

    }

}
