package Aula10;

import java.util.Scanner;

public class MaioreMenorVetor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] Vetor = new int[5];
        int Maior = 0;
        int Menor = 0;
        for(int i =  0; i < Vetor.length;i ++){
            System.out.println("Digite o "+ (i + 1)+"° número: ");
            Vetor[i] = s.nextInt();
        }

        Maior = Vetor[0];
        Menor = Vetor[0];
        for(int i = 0; i < Vetor.length; i ++){
            if (Vetor[i] > Maior ){
                Maior = Vetor[i];
            }else if(Vetor[i] < Menor){
                Menor = Vetor[i];
            }
        }

        System.out.println("Maior: "+Maior);
        System.out.println("Menor: "+ Menor);


    }
}
