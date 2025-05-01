package Aula4;
import java.util.Scanner;

public class VerificacaodeIdade {
    public static void mostrar() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scn.nextInt();

        if (idade >= 60){
            System.out.println("Idoso");
        }else if(idade < 18){
            System.out.println("Criança");
        }else{
            System.out.println("Adulto");
        }
        scn.close();
    }
}
