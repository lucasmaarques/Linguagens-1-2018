package exercicio1;

import java.util.ArrayList;

public class Exercicio1 {


    public static void main(String[] args) {
        descricaoDAO descricaoDAO = new descricaoDAO();
        if(descricaoDAO.CreateTable()) System.out.println("Tabela Criada");
        else System.out.println("Algo de errado aconteceu!");
        descricaoDAO.ZeraTable();
        descricao descricao1 = new descricao("a1", 10, 60);
        descricaoDAO.InsertItem(descricao1);
        ArrayList<descricao> descricao = descricaoDAO.GetAll();
        System.out.println(descricao);
        descricao descricao1 = new descricao("lucas", 20, 100);
        descricaoDAO.AtualizaDados(descricao1);
    }
    
}
