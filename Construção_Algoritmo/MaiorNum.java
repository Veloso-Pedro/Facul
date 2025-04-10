import java.util.Scanner;

public class MaiorNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scn.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scn.nextDouble();

        if (num1 > num2){
            System.out.println(num1 +" é maior que "+ num2 );
        }else{
            System.out.println(num2+ " é maior que "+ num1);
        }
        scn.close();
    }
}
