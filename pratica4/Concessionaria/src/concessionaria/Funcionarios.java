package concessionaria;

public class Funcionarios {
    private double comissao;
    private double salariobase;
    private double salariomes;
    private static double vendasconcessionaria;
    private static double numerofuncionarios;
    


public Funcionarios(double salariobase){
 this.salariobase = salariobase;
 Funcionarios.numerofuncionarios += 1;
}  
public void Vendas(double valorvenda){
    Funcionarios.vendasconcessionaria += valorvenda;
}
public double getComissao(){
    this.comissao = ((0.05*Funcionarios.vendasconcessionaria)/Funcionarios.numerofuncionarios);
    return this.comissao;
}
public double getSalariobase(){
    return this.salariobase;
}
public double getSalariomes(){
    this.salariomes = this.salariobase + this.comissao;
    return this.salariomes;
}
}

