package Aula5e6;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua altura (em Metros): ");
        double altura = s.nextDouble();
        System.out.println("===============================");
        System.out.println("Digite seu peso (em Kg): ");
        double peso = s.nextDouble();
        System.out.println("===============================");

        double IMC = peso/(altura*altura);

        if (IMC < 18.5){
            System.out.println("Abaixo do peso");
        }else if(IMC >= 18.5 && IMC <= 24.9){
            System.out.println("Peso normal");
        }else if (IMC >= 25.0 && IMC <= 29.9){
            System.out.println("Sobrepeso");
        }else if (IMC >= 30.0 && IMC <=34.9){
            System.out.println("Obesidade grau I");
        }else if (IMC >= 35.0 && IMC <= 39.9){
            System.out.println("Obesidade grau II (severa)");
        }else{
            System.out.println("Obesidade grau III (mórbida)");
        }
        s.close();
    }
}
