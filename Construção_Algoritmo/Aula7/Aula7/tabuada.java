package Aula7;
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o número que vc deseja ver a tabuada: ");
        int num = s.nextInt();

        for (int i = 1; i <= 10; i++){
            int multi = i * num;

            System.out.println(num+" X "+i+" = "+multi);
        }

        s.close();
    }
}
