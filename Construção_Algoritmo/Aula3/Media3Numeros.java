package Aula3;
import java.util.Scanner;

public class Media3Numeros {
    public static void mostrar(){
        Scanner scanner = new Scanner(System.in);

        double nota = 0;
        double media = 0;

        System.out.println("Calculador de Média!");
        System.out.println("====================");
        System.out.println("Digite sua primeira nota: "); nota = scanner.nextDouble();
        System.out.println("Digite sua segunda nota: "); nota = nota + scanner.nextDouble();
        System.out.println("Digite sua terceira nota: "); nota = nota + scanner.nextDouble();
        media = nota / 3;
        System.out.println("sua média é "+(media));
        
        /* 
        if (media >= 5){
            System.out.println("APORVADO!!");
        }else{
            System.out.println("Reprovado");
        }
         */   

         scanner.close();
    }        
}
