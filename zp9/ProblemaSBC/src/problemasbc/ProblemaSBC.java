package problemasbc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProblemaSBC {

    //public static void main(String[] args) {
    //    Map<String, Dados> sapato  = new HashMap<String, Dados>();
    //    Scanner entrada = new Scanner(System.in);
    //    System.out.println("Digite N: ");
    //    int N = entrada.nextInt();
    //    while (N%2 != 0){
    //        System.out.println("Digite um N PAR: ");
    //        N = entrada.nextInt();
    //    }
       // for(int i = 0;i < N;i++)
            //if (sapato.containsKey(i)
    
    public static void main(String[] args) {
        // TODO code application logic here
        String [] entradas = {"38 E", "39 E", "40 D", "38 D", "40 D", "37 E", "37 D", "37 D", "37 E", "37 E", "37 D", "37 D", "37 E", "37 E" };
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite N: ");
        int N = entrada.nextInt();
        while (N%2 != 0){
            System.out.println("Digite um N PAR: ");
            N = entrada.nextInt();
        }
        Map <String, Map> botas = new HashMap<String, Map>();
        for(int i = 0; i < N; i++){
            String [] dados = entradas[i].split(" ");
            //Verifica se a chave já existe
            if(botas.containsKey(dados[0])){
                Map<String, Integer> pe = botas.get(dados[0]);
                int x = pe.get(dados[1]);
                x++;
                pe.put(dados[1], x);
            }
            else{
                Map<String, Integer> par = new HashMap<String, Integer>();
                par.put("D", 0);
                par.put("E", 0);
                par.put(dados[1], 1);
                botas.put(dados[0], par);
            }
        }
        
        System.out.println(botas);
    }
    
}
