package Aula3;
import java.util.Scanner;

public class QuadradodeNumero {
    public static void mostrar() {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        

        System.out.println("Calculadora de Raiz Quadrada");
        System.out.println("============================");
        System.out.println("Digite seu número: "); num = scanner.nextInt();

        num = num *num;

        System.out.println("A raiz quadrada do seu número é "+(num));

        scanner.close();
    }
}
