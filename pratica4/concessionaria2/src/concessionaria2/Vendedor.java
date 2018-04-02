package concessionaria2;

public class Vendedor {
    
    private double comissao;
    private double salariobase;
    private double salariomes;
    private static double vendasconcessionaria;
    private static double numerofuncionarios;
    private String gerenteresponsavel;
    

public Vendedor(double salariobase, String gerenteresponsavel){
 this.salariobase = salariobase;
 this.gerenteresponsavel = gerenteresponsavel;
 Vendedor.numerofuncionarios += 1;
}  

public void Venda(double valorvenda){
    Vendedor.vendasconcessionaria += valorvenda; 
}
public double getComissao(){
    this.comissao = ((0.05*Vendedor.vendasconcessionaria)/Vendedor.numerofuncionarios);
    return this.comissao;
}
public double getSalariobase(){
    return this.salariobase;
}
public double getSalariomes(){
    this.salariomes = this.salariobase + this.comissao;
    return this.salariomes;
}
public String getgerenteresponsavel(){
    return this.gerenteresponsavel;
}
}

