package Aula7;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);

        int pares = 0;
        int contador = 0;

        System.out.println("Digite o número desejado: ");
        int num = s.nextInt();

        for (int i = 1; i <= num; i++){
            if (i % 2 == 0){
                pares += i;
                contador++;
            }
        }

        System.out.println("A soma dos números pares de 1 até "+num+" é igual á "+pares);
        System.out.println("A quantidade de Números pares aparecem é "+ contador);

        s.close();

    }
}
