package POO.Aula1;

import java.util.Scanner;

public class MaiorNum {
    public int maior(int num1, int num2, int num3){
        int MaiorNum;
        
        
        MaiorNum = num1;

        if (MaiorNum < num2){
            MaiorNum = num2;
            if(MaiorNum < 3){
                MaiorNum = num3;
            }
        }
        return MaiorNum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int x = s.nextInt();
        System.out.println("Digite o segundo número: ");
        int y = s.nextInt();
        System.out.println("Digite o terceiro número: ");
        int z = s.nextInt();

        MaiorNum t1 = new MaiorNum();

        int maior = t1.maior(x, y, z);

        System.out.println("Maior Número: " + maior );


    }
}
