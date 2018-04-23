package concessionaria;

public class Vendedor extends Funcionario {
    private double comissao;
    private double valorVendas;
    
    public Vendedor(String rnome, double rsalario){
        super(rnome,rsalario);    
    }
    
    public void realizarVenda(double valorVenda){
        this.valorVendas += valorVenda;
    }
    
}
