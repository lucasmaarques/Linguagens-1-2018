package problemasbc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProblemaSBC {

    public static void main(String[] args) {
        Map<String, Dados> sapato  = new HashMap<String, Dados>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite N: ");
        int N = entrada.nextInt();
        while (N%2 != 0){
            System.out.println("Digite um N PAR: ");
            N = entrada.nextInt();
        }
       // for(int i = 0;i < N;i++)
            //if (sapato.containsKey(i)
        //codigoslack
        
    }
    
}
