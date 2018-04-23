package concessionaria;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private static double bonusExtra;
    private static double aliquotaBonus = 0.05;
    
    public Funcionario(String rnome,double rsalario){
        this.nome = rnome;
        this.salarioBase = rsalario;
    }
    public static void calcularBonusExtra(double vendasTotais, double nFuncionarios){
        Funcionario.bonusExtra = (vendasTotais*aliquotaBonus)/nFuncionarios;
    }
}
