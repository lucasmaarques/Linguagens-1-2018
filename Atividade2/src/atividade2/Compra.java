package atividade2;

/**
 *
 * @author lucas.araujo
 */
public interface Compra {

    public boolean adicionarALista(Produto p);

    public int getRestantes();

    public boolean removerUltimoDaLista();

    public String retornarResumo();

    public void limparLista();
}
