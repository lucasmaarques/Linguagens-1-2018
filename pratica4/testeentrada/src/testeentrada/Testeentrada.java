package testeentrada;
import java.util.Scanner;


public class Testeentrada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma idade: ");
        int a = entrada.nextInt();
        System.out.println("A sua idade é " + a);  
    }
    
}
