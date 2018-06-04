package atividade2;

/**
 *
 * @author lucas.araujo
 */
public class Desejos extends Lista implements Compra{

    @Override
    public boolean adicionarALista(Produto p) {
        if (getSize() <= 5) {
            adicionarProduto(p);
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public int getRestantes(){
        return 5 - getSize();
    }
    
    @Override
    public boolean removerUltimoDaLista(){
        if (getVazio()){
            return false;
        } else {
            removerProduto(getSize()-1);
            return true;
        }
    }
    
    @Override
    public String retornarResumo(){
        return exibirLista();
    }
    
    @Override
    public void limparLista(){
        limpar();
    }

}
