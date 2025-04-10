import java.util.Scanner;

public class ClassificacaodeTriangolo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o primeiro Comprimento: ");
        double a = scn.nextDouble();
        System.out.println("Digite o segundo comprimento: ");
        double b = scn.nextDouble();
        System.out.println("Digite o terceiro Comprimento: ");
        double c = scn.nextDouble();

        if (a + b > c && a + c >b && b + c > a){
            if (a == b && a ==c ){
                System.out.println("Equilatero");
            }else if (a == b && b != c){
                System.out.println("Isósceles");
            }else if (a != b && a != c && b != c){
                System.out.println("Escaleno");
            }
        }else{
            System.out.println("Esse triângulo não existe ");
        }
        scn.close();
    }
}
