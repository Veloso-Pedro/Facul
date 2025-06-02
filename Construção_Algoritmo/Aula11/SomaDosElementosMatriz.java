package Aula11;

import java.util.Scanner;

public class SomaDosElementosMatriz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int colunas;
        int linhas;
        int soma = 0;

        System.out.println("Escolha Qual a quantidade de Linhas voce deseja? ");
        linhas = s.nextInt();
        System.out.println("Escolha Qual a quantidade de Colunas voce deseja? ");
        colunas = s.nextInt();

        int [][] Matriz = new int[linhas][colunas];

        for (int i = 0; i < Matriz.length; i++){
            for(int j = 0; j < Matriz[i].length; j++){
                System.out.println("Posição ["+i+"]["+j+"]: ");
                Matriz[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < Matriz.length; i++){
            for(int j = 0; j < Matriz[i].length; j++){
                soma += Matriz[i][j];
            }
        }

        System.out.println("A Soma Total é "+ soma);

        s.close();
    }
}
