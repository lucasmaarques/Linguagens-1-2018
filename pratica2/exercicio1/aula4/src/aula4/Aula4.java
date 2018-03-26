package aula4;

public class Aula4 {

    public static void main(String[] args) {
        Conta c1;
        c1 = new Conta("12345", 10,"Lucas","rua","cpf",19);
        c1.getSaldo();
 
        Conta c2;
        c2 = new Conta("54321", 2000,"felipe","avenida","fcp",26);
        c2.getSaldo();
        
        
        
        System.out.println("Nome 1: " + c1.cliente.getNome());        
//      System.out.println("CPF 1: " + c1.cliente.cpf);
        System.out.println("Saldo 1: " + c1.getSaldo());
//      System.out.println("Nome 2: " + c2.cliente.nome);
//      System.out.println("CPF 2: " + c1.cliente.cpf);
        System.out.println("Saldo 2: " + c1.getSaldo());
        System.out.println("Sacou 1: " + (c1.sacar(5)));
        System.out.println("Saldo 1 atualizado: " + c1.getSaldo());

    }

}
