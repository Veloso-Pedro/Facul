package Aula7;
import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int f1 = 1;
        int f2 = 1;
        int fib = 0;

        System.out.println("Digite até que termo você deseja ver da Sequencia de Fibonacci: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++){
              
            System.out.println(f1);
        
            fib = f1 + f2;
            f1 = f2;
            f2 = fib;
           
        }
        s.close();
    }

}
