/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizandojava2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author lucas.araujo
 */
public class OrganizandoJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Dados> dados = new ArrayList<Dados> ();
        dados.add(new Dados(2,"Bunda6"));
        dados.add(new Dados(5,"Bunda3"));
        dados.add(new Dados(1,"Bunda2"));
        dados.add(new Dados(6,"Bunda1"));
        Collections.sort(dados);
        System.out.println("Ordem: ");
        System.out.println(dados);
        
    }
    
}
