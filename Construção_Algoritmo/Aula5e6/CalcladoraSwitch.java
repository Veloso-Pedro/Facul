package Aula5e6;
import java.util.Scanner;

public class CalcladoraSwitch {
    public static void mostrar() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Calculadora");
        System.out.println("=============");
        System.out.println("+ - Soma");
        System.out.println("- - Subtração");
        System.out.println("* - Multiplicação");
        System.out.println("/ - Divisão");
        char esc = scn.next().charAt(0);

        System.out.println("Digite o primeiro número: ");
        double num1 = scn.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scn.nextDouble();

        switch (esc){
            case '+':
                System.out.println(num1 + "+ "+ num2 + "= "+ (num1+num2));
                break;
            case '-':
                System.out.println(num1 + "- "+ num2 + "= "+ (num1-num2));
                break;
            case '*':
                System.out.println(num1 + "X "+ num2 + "= "+ (num1*num2));
                break;
            case '/':
                if (num2 == 0){
                    System.out.println("Erro!");
                }else{
                    System.out.println(num1 + "/ "+ num2 + "= "+ (num1/num2) + "E o quoiciente é "+ (num1%num2));
                    break;
                }
            default:
                System.out.println("Erro!");
                break;   
        }
        scn.close();
    }
}