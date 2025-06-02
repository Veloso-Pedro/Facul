package Aula11;

import java.util.Scanner;

public class SomadeMatrizes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int linhas;
        int colunas;
        int soma = 0;

        System.out.println("Escolha Qual a quantidade de Linhas voce deseja? ");
        linhas = s.nextInt();
        System.out.println("Escolha Qual a quantidade de Colunas voce deseja? ");
        colunas = s.nextInt();

        int[][] Matriz1 = new int[linhas][colunas];
        int[][] Matriz2 = new int[linhas][colunas];

        System.out.println("Matriz 1: ");
        for (int i = 0; i < Matriz1.length; i++){
            for(int j = 0; j < Matriz1[i].length; j++){
                System.out.println("Posição ["+i+"]["+j+"]: ");
                Matriz1[i][j] = s.nextInt();
            }
        }

        System.out.println("Matriz 2: ");
        for (int i = 0; i < Matriz2.length; i++){
            for(int j = 0; j < Matriz2[i].length; j++){
                System.out.println("Posição ["+i+"]["+j+"]: ");
                Matriz2[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < Matriz1.length; i++){
            for(int j = 0; j < Matriz1[i].length; j++){
                soma += Matriz1[i][j] + Matriz2[i][j];
            }
        }

        System.out.println("A soma das Matrizes é "+ soma);

        s.close();
    }
}
