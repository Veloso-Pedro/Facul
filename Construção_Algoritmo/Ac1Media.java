import java.util.Scanner;

public class Ac1Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declaração de variáveis 
        double Ac1 = 0;
        double Ac2 = 0;
        double Ag = 0;
        double Af = 0;
        
        // Entrada das variáveis
        System.out.println("Calculadora de média");
        System.out.println("===============================");
        System.out.println("Digite sua nota da Ac1: "); Ac1 = scanner.nextDouble();
        System.out.println("===============================");
        System.out.println("Digite sua nota da Ac2: "); Ac2 = scanner.nextDouble();
        System.out.println("===============================");
        System.out.println("Digite sua nota da Ag: "); Ag = scanner.nextDouble();
        System.out.println("===============================");
        System.out.println("Digite sua nota da Af: "); Af = scanner.nextDouble();
        System.out.println("===============================");
        // Calculando a média e prova real para garantir que os calculos estão certos
        double media = (Ac1 * 0.15) + (Ac2 * 0.30) + (Ag * 0.10) + (Af * 0.45);
        //System.out.println(Ac1 * 0.15); System.out.println(Ac2 * 0.30); System.out.println(Ag * 0.10); System.out.println(Af * 0.45);

        // Saída dos dados
        System.out.println("Nota mínima para aprovação: 5.0");
        System.out.println("===============================");
        System.out.println("Sua média é "+ media);
        System.out.println("===============================");
        
        if (media >= 5){
            System.out.println("Status: Aprovado!");
            System.out.println("=================");
        }else{
            System.out.println("Status: Reprovado!");
            System.out.println("=================");
        }
        scanner.close();
    }
}
