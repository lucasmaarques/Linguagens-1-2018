package organizandojava;

import java.util.ArrayList;
import java.util.Collections;

public class OrganizandoJava {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Teste2");
        nomes.add("Teste1");
        nomes.add("Teste4");
        nomes.add("Teste3");
        System.out.println("Sem ordem:");
        System.out.println(nomes);
        System.out.println("");
        Collections.sort(nomes);
        System.out.println("Com ordem:");
        System.out.println(nomes);
        System.out.println("");
        System.out.println(Collections.max(nomes));
        
    }
    
}
