package Aula10;

import java.util.Scanner;

public class MediaAlturaVetor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Double[] Numeros = new Double[5];
        Double somador = 0.0;


        System.out.println("Alturas em Metros");
        System.out.println("==============================");
        for(int i =  0; i < Numeros.length;i ++){
            System.out.println("Digite o "+ (i + 1)+"° Altura: ");
            Numeros[i] = s.nextDouble();
        }

        for(int i = 0; i < Numeros.length; i ++){
            somador += Numeros[i];
        }

        System.out.print("A média dos números inseridos é: "+ (somador/5.00));

        s.close();
    }
}
