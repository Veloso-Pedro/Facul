package Aula10;

import java.util.Scanner;

public class VetorInvertido {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] Vetor = new String[10];

        for(int i = 0; i < Vetor.length; i++){
            System.out.println("Digite o "+(i+1)+"° Número: ");
            Vetor[i] = s.next();
        }

        for(int i = 9; i < Vetor.length; i --){
            System.out.println(Vetor[i]+ " ");
        }

        s.close();
    }
}
