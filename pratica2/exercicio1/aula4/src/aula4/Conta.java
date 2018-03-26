package aula4;

public class Conta {

    private String numeroConta;
    private double saldo;
    Cliente cliente;
 
    public double getSaldo(){
    return this.saldo;
}
    
    public String getNumeroConta(){
    return this.numeroConta;
}
    
    public String visualizarSaldo() {
        return Double.toString(this.saldo);

    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;

    }

    public boolean sacar(double valor) {
        boolean resp = false;
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            resp = true;
        }
        return resp;
    }

    public boolean transferirSaldo(double valor, Conta destinatario) {
        boolean resp = false;
        if (this.sacar(valor)) {
            destinatario.depositar(valor);
            resp = true;
        }

        return resp;

    }

    public Conta(String nConta,double saldo,String nome,String endereço,String cpf, int idade){
        this.saldo = saldo;
        this.numeroConta = nConta;
        this.cliente = new Cliente( nome, endereço, cpf, idade);
    }
}
