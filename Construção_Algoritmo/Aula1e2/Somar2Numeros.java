package Aula1e2;
import java.util.Scanner;

public class Somar2Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de dois números");
        
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("O resultado da sua soma é "+(num1+num2));

        scanner.close();
    }
}
