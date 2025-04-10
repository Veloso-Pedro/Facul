import java.util.Scanner;

public class PositivoNegativoZero {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scn.nextInt();

        if (num == 0){
            System.out.println("Seu número é zero");
        }else if(num > 0){
            System.out.println("Seu número é positivo");
        }else{
            System.out.println("Seu número é negativo");
        }
        scn.close();
    }
}
