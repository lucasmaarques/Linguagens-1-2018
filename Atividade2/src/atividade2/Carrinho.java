package atividade2;

import java.util.ArrayList;

/**
 *
 * @author lucas.araujo
 */
public class Carrinho extends Lista implements Compra{

    @Override
    public boolean adicionarALista(Produto p) {
        if (getSize() <= 12) {
            adicionarProduto(p);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getRestantes() {
        return 12 - getSize();
    }

    @Override
    public boolean removerUltimoDaLista() {
        if (getVazio()) {
            return false;
        } else {
            removerProduto(getSize()-1);
            return true;
        }
    }
    
    public ArrayList<Produto> getCarrinho(){
        return getLista();
    }

    @Override
    public String retornarResumo() {
        return exibirLista();
    }
    
    public String retornarInfo() {
        return exibirPed();
    }

    @Override
    public void limparLista() {
        limpar();
    }

}
