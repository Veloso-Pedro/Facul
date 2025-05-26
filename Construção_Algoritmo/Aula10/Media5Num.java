package Aula10;

import java.util.Scanner;

public class Media5Num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] Numeros = new int[5];
        int somador = 0;


        System.out.println("Apenas Números Inteiros!!");
        System.out.println("==============================");
        for(int i =  0; i < Numeros.length;i ++){
            System.out.println("Digite o "+ (i + 1)+" número: ");
            Numeros[i] = s.nextInt();
        }

        for(int i = 0; i < Numeros.length; i ++){
            somador += Numeros[i];
        }

        System.out.println("A média dos números inseridos é: "+ (somador/5));

        s.close();
    }
    
}
