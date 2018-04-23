package concessionaria2;

public class Vendedor extends Funcionario {
       private static int numeroDeVendedores;
       Gerente gerente;
        
       public Vendedor(double valorSalario, Gerente gerenteResponsavel){
           this.salarioBase = valorSalario;
           this.gerente = gerenteResponsavel;
           Vendedor.numeroDeVendedores += 1;
       }
       
       public void comissao() {
           double comissaoConcessionaria = 0.05*Vendedor.vendasConcessionaria;
           this.comissao = comissaoConcessionaria/
                                              Vendedor.numeroDeVendedores;
       }
       
       public void setSalarioBase(double aumento) {
           this.salarioBase += aumento;
       }
       
       
}