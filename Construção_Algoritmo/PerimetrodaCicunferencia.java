import java.util.Scanner;

public class PerimetrodaCicunferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int altura = 0;
        int area = 0;

        System.out.println("Qual a base do triangulo: ");
        base = scanner.nextInt();
        System.out.println("Altura: ");
        altura = scanner.nextInt();
        area = base*altura/2;
        System.out.println("A área do triângulo com base "+ base + " e altura "+ altura + " É: "+ area);
        
    }
}
