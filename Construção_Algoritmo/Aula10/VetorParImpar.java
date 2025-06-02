package Aula10;

import java.util.Scanner;

public class VetorParImpar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int qtdNum;
        int pares = 0;
        int impares = 0;

        System.out.println("Quantos Números Inteiro você deseja inserir");
        qtdNum = s.nextInt();

        int[] Vetor = new int[qtdNum];

        for(int i = 0; i < Vetor.length; i++){
            System.out.println("Digite o "+(i+1)+"° Número: ");
            Vetor[i] = s.nextInt();
        }

        for(int i = 0; i < Vetor.length; i++){
            if(Vetor[i] % 2 == 0){
                pares += Vetor[i];
            }else{
                impares += Vetor[i];
            }
        }

        System.out.println("A Quantidade de Pares no vetor são: "+pares);
        System.out.println("A Quantidade de Impares no vetor são "+impares);

        s.close();


    }
}
