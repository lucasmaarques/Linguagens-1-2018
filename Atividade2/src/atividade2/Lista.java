package atividade2;

/**
 *
 * @author lucas.araujo
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Lista {

    private ArrayList<Produto> produto = new ArrayList<Produto>();

    public void adicionarProduto(Produto p) {
        this.produto.add(p);
    }

    public void removerProduto(int n) {
        this.produto.remove(n);
    }

    public String exibirLista() {
        Iterator<Produto> p = this.produto.iterator();
        Produto pTemp;
        String s = "ITENS:\n";
        while (p.hasNext()) {
            pTemp = p.next();
            s = s + pTemp.exibirResumo() + "\n";
        }
        return s;
    }
    
    public String exibirPed(){
    Iterator<Produto> p = this.produto.iterator();
        Produto pTemp;
        String s = "ITENS:\n";
        while (p.hasNext()) {
            pTemp = p.next();
            s = s + pTemp.exibirInfos() + "\n";
        }
        return s;
    }
    
    public void limpar(){
        this.produto.clear();
    }
    
    public boolean getVazio(){
        return this.produto.isEmpty();
    }
    
    public int getSize(){
        return this.produto.size();
    }
    
    public ArrayList<Produto> getLista(){
        return this.produto;
    }
}
