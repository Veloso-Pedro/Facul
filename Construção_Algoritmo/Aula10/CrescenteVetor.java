package Aula10;

import java.util.Arrays;
import java.util.Scanner;

class CrescenteVetor {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] Vetor = new int[10];
        

        System.out.println("Apenas Números Inteiros!!");
        System.out.println("==============================");
        for(int i =  0; i < Vetor.length;i ++){
            System.out.println("Digite o "+ (i + 1)+"° número: ");
            Vetor[i] = s.nextInt();
        }

        Arrays.sort(Vetor);

        
        System.out.println("==============");
        for(int i = 0; i < Vetor.length; i++){
            System.out.println(Vetor[i]+ " ");
        }

        s.close();
    }
}