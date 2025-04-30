import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int inicio0 = 0;
        int inicio1 = 1;
        
        

        System.out.println("Digite até que termo você deseja ver da Sequencia de Fibonacci: ");
        int n = s.nextInt();

        for (int i = 0; i <= n - 1; i++){
            
            if (i == 0){
                System.out.println(i);
            }
            int fib = inicio0 + inicio1;
            inicio0 = inicio1;
            inicio1 = fib;

            System.out.println(inicio0);
        }
        s.close();
    }
}