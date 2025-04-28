package Aula3;
import java.util.Scanner;

public class AreaCircunferencia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14;
        double raio = 0;
        double area = 0;
        
        System.out.println("Calculadora de área da círcunferencia!");
        System.out.println("======================================");
        System.out.println("Digite o valor do raio da círcunferencia: "); raio = scanner.nextDouble();

        area = (raio*raio)*pi;

        System.out.println("A área da sua círcunferencia é "+(area));

        scanner.close();
    }
    
}
