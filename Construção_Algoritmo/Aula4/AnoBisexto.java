package Aula4;
import java.util.Scanner;

public class AnoBisexto {
    public static void mostrar() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite um número: "); 
        int ano = scn.nextInt();

        if (ano % 4 == 0 || ano % 400 == 0){
            System.out.println("ANO BISEXTO!!");
        }else{
            System.out.println("ANO NORMAL!");
        }
        scn.close();
    }
}
