package POO.Aula1;

import java.util.Scanner;

import Aula7.tabuada;

public class numTipo {
    public void tipoNum(int num) {
            if(num >= 0){
                System.out.println("Positivo");
            }else if(num < 0){
                System.out.println("Negativo");
            }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int x = s.nextInt();

        numTipo t1 = new numTipo();

        t1.tipoNum(x);


    }
    
}


