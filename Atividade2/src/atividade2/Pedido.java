package atividade2;

import static atividade2.Atividade2.carrinho;

/**
 *
 * @author lucas.araujo
 */
public class Pedido {
    private Cliente cl;
    private Carrinho ca;
    
    public Pedido(Cliente cli, Carrinho carrinho) {
        this.cl = cli;
        this.ca = carrinho;
    }

    public String resumoPedido() {
        return carrinho.retornarInfo() + "\nUm boleto foi enviado para o email 51. Obrigado pela prefer▒ncia! :D\n================================" ;
    }
    
}
