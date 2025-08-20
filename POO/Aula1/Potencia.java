package POO.Aula1;
import java.util.Scanner;

public class Potencia {
    public double pot(int a, int b){
       double pot = Math.pow(a, b);

        return pot;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int x = s.nextInt();
        System.out.println("Digite o segundo número: ");
        int y = s.nextInt();

        Potencia t1 = new Potencia();

        double pot = t1.pot(x, y);

        System.out.println("A potencia é " + pot);
    }
}
