package concessionaria2;

public class Gerente extends Funcionario {
       private static int numeroDeGerentes;
        
       public Gerente(double valorSalario){
           this.salarioBase = valorSalario;
           Gerente.numeroDeGerentes += 1;
       }
       

       
       public void comissao() {
           double comissaoConcessionaria = 0.1*Gerente.vendasConcessionaria;
           this.comissao = 0.5*this.salarioBase +
                          (comissaoConcessionaria/Gerente.numeroDeGerentes);
       }
       
       public void aumento(double valorAumento, Vendedor vendedor) {
           vendedor.setSalarioBase(valorAumento);
       }
       
}