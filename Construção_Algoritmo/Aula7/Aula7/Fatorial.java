package Aula7;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int fato = 1;

        System.out.println("Calculadora Fatorial");
        System.out.println("========================");
        System.out.println("Digite o número: ");
        int num = s.nextInt();

        for (int i = 1; i <= num; i++ ){
             fato *= i;
        }
        System.out.println(fato);
        s.close();
    }
}
