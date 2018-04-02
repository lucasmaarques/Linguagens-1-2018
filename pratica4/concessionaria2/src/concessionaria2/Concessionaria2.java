
package concessionaria2;


public class Concessionaria2 {

 
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor(1000,"Lucas");
        v1.Venda(50);
        Vendedor v2 = new Vendedor(1000,"Lucas");
        v2.Venda(50);
        Vendedor v3 = new Vendedor(1000,"Lucas");
        v3.Venda(50);
        Gerente g1 = new Gerente(2000,"Lucas");
        g1.Venda(1000);
        
        System.out.println("Nome do gerenteresponsavel V1: " + v1.getgerenteresponsavel());
        System.out.println("Nome do gerenteresponsavel V2: " + v2.getgerenteresponsavel());
        System.out.println("Nome do gerenteresponsavel V3: " + v3.getgerenteresponsavel());
        System.out.println("Nome do gerente G1: " + g1.getgerenteresponsavel());
        System.out.println("Salario Base do V1: " + v1.getSalariobase());
        System.out.println("Salario Base do V2: " + v2.getSalariobase());
        System.out.println("Salario Base do V3: " + v3.getSalariobase());
        System.out.println("Salario Base do G1: " + g1.getSalariobase());
        System.out.println("Comissão do V1 : " + v1.getComissao());
        System.out.println("Comissão do V2 : " + v2.getComissao());
        System.out.println("Comissão do V3 : " + v3.getComissao());
        System.out.println("Comissão do G1 : " + g1.getComissao());
        System.out.println("Salário Final do Mes do V1 : " + v1.getSalariomes());
        System.out.println("Salário Final do Mes do V2 : " + v2.getSalariomes());
        System.out.println("Salário Final do Mes do V3 : " + v3.getSalariomes());
        System.out.println("Salário Final do Mes do G1 : " + g1.getSalariomes());
        
        
        
        
        
    }
    
}
