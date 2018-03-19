package aula4;

public class Conta {

    int numeroConta;
    double saldo;
    Cliente cliente;
 

    String visualizarSaldo() {
        return Double.toString(this.saldo);

    }

    void depositar(double valor) {
        this.saldo = this.saldo + valor;

    }

    boolean sacar(double valor) {
        boolean resp = false;
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            resp = true;
        }
        return resp;
    }

    boolean transferirSaldo(double valor, Conta destinatario) {
        boolean resp = false;
        if (this.sacar(valor)) {
            destinatario.depositar(valor);
            resp = true;
        }

        return resp;

    }

}
