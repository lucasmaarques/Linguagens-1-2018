
package concessionaria;

public class Concessionaria {

    public static void main(String[] args) {
        Funcionarios f1 = new Funcionarios(1000);
        f1.Vendas(50);
        Funcionarios f2 = new Funcionarios(1200);
        f2.Vendas(100);
        Funcionarios f3 = new Funcionarios(1500);
        f3.Vendas(150);
        
        System.out.println("Salario Base do F1: " + f1.getSalariobase());
        System.out.println("Salario Base do F2: " + f2.getSalariobase());
        System.out.println("Salario Base do F3: " + f3.getSalariobase());
        System.out.println("Comissão do F1 : " + f1.getComissao());
        System.out.println("Comissão do F2 : " + f2.getComissao());
        System.out.println("Comissão do F3 : " + f3.getComissao());
        System.out.println("Salário Final do Mes do F1 : " + f1.getSalariomes());
        System.out.println("Salário Final do Mes do F2 : " + f2.getSalariomes());
        System.out.println("Salário Final do Mes do F3 : " + f3.getSalariomes());
        
    }
    
}
