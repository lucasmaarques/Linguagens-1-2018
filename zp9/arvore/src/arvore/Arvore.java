
package arvore;

import java.util.TreeSet;

public class Arvore {

    public static void main(String[] args) {
        TreeSet<Dados> tree = new TreeSet<Dados>();
        tree.add(new Dados(1,"Bunda1"));
        tree.add(new Dados(10,"Bunda3"));
        tree.add(new Dados(10,"Bunda3"));
        tree.add(new Dados(15,"Bunda2"));
        tree.add(new Dados(5,"Bunda4"));
        System.out.println("Conjunto de dados: ");
        System.out.println(tree);
        
    }
    
}
