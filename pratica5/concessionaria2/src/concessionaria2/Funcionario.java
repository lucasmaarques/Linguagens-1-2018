package concessionaria2;

public class Funcionario {
    protected double salarioBase;
    protected double salarioDoMes;
    protected double comissao;
    protected double vendasConcessionaria;
    protected double vendasRealizadas;
    
    public void SuperClasse(int rsalariobase,int rsalariodomes,int rcomissao,int rvendasconcessionaria,int rvendasrealizadas){
        this.salarioBase = rsalariobase;
        this.salarioDoMes = rsalariodomes;
        this.comissao = rcomissao;
        this.vendasConcessionaria = rvendasconcessionaria;
        this.vendasRealizadas = rvendasrealizadas;
    }
}

public void venda(double valorVenda) {
           this.vendasRealizadas += valorVenda;
           Gerente.vendasConcessionaria += valorVenda;
       }

    public double getComissao() {
           comissao();
           return this.comissao;
       }

    public double getSalarioBase() {
           return this.salarioBase;
       }
        
       public double getSalarioDoMes() {
           this.salarioDoMes = this.salarioBase + this.comissao;
           return this.salarioDoMes;
       }