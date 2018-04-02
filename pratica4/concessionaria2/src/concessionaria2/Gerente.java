
package concessionaria2;


public class Gerente {
    private double comissao;
    private double salariobase;
    private double salariomes;
    private static double vendasgerentes;
    private static double numerogerentes;
    private String nomegerente;
    
public Gerente(double salariobase, String nomegerente){
 this.salariobase = salariobase;
 Gerente.numerogerentes += 1;
 this.nomegerente = nomegerente;
}  

public void Venda(double valorvenda){
    Gerente.vendasgerentes += valorvenda;
}
public double getComissao(){
    this.comissao = ((0.1*vendasgerentes)+(0.5*this.salariobase));
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
    return this.nomegerente;
}

}
