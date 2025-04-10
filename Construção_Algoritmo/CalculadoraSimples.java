import java.util.Scanner;

public class CalculadoraSimples {   
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Calculadora Simples:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int esc = scn.nextInt();

        if (esc == 1 | esc == 2 | esc == 3 | esc == 4){
            System.out.println("Digite o primeiro número: ");
            double num1 = scn.nextDouble();
            System.out.println("Digite o segundo número: ");
            double num2 = scn.nextDouble();
            if (esc == 1){
                System.out.println("A Soma é "+ (num1 + num2));
            }else if (esc == 2){
                System.out.println("A Subtração é "+ (num1 - num2));
            }else if (esc == 3){
                System.out.println("A Mulplicação é "+ (num1 * num2));
            }else if (esc == 4){
                System.out.println("A Divisão é "+ (num1 / num2));
            }
            scn.close();
        }
    }
}
