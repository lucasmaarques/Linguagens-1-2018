package javasqlite;

import java.util.ArrayList;

public class JavaSQlite {

    public static void main(String[] args) {
        ItemDAO itemDAO = new ItemDAO();
        if(itemDAO.CreateTable()) System.out.println("Tabela Criada");
        else System.out.println("Algo de errado aconteceu!");
        ArrayList<Item> items = itemDAO.GetAll();
        System.out.println(items);
        /*
        Item item = new Item(1, 10, "Pokebola", 50);
        itemDAO.InsertItem(item);
        item = new Item(2,8,"Poção",100);
        itemDAO.InsertItem(item);
        item = new Item(3,7,"Poção",200);*/
    }
        
    
}
