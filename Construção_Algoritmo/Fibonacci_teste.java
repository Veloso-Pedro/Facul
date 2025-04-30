import java.util.Scanner;

public class Fibonacci_teste {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int f1 = 0;
        int f2 = 1;

        System.out.println("Digite até que termo você deseja ver da Sequencia de Fibonacci: ");
        int n = s.nextInt();

        for (int i = 0; i <= n - 2; i++){
            if (n < 2) {
                System.out.println(n);
            }else {
                
                int fib = f1 + f2;
                f1 = f2;
                f2 = fib;
    
    
                System.out.println(fib);
            }
        }

        
        s.close();
    }
}
    

