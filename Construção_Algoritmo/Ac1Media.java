import java.util.Scanner;

public class Ac1Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declaração de variáveis 
        double notaAc1 = 0;
        double notaAc2 = 0;
        double notaAg = 0;
        double notaAf = 0;
        double notaNm = 0;
        
        // Entrada das variáveis
        System.out.println("Calculadora de média");
        System.out.println("===============================");
        System.out.print("Digite sua nota da Ac1: "); notaAc1 = scanner.nextDouble();
        System.out.println("===============================");
        System.out.print("Digite sua nota da Ac2: "); notaAc2 = scanner.nextDouble();
        System.out.println("===============================");
        System.out.print("Digite sua nota da Ag: "); notaAg = scanner.nextDouble();
        System.out.println("===============================");
        System.out.print("Digite sua nota da Af: "); notaAf = scanner.nextDouble();
        System.out.println("===============================");
        System.out.print("Digite a nota mínima para aprovação:"); notaNm = scanner.nextDouble();
        System.out.println("==============================="); 

        // Calculando a média e prova real para garantir que os calculos estão certos
        double media = (notaAc1 * 0.15) + (notaAc2 * 0.30) + (notaAg * 0.10) + (notaAf * 0.45);
        //System.out.println(Ac1 * 0.15); System.out.println(Ac2 * 0.30); System.out.println(Ag * 0.10); System.out.println(Af * 0.45);

        // Saída dos dados
        System.out.println("Nota mínima para aprovação: "+ (notaNm));
        System.out.println("===============================");

        System.out.println("Sua nota Ac1: "+ (notaAc1));
        System.out.println("Sua nota Ac2: "+ (notaAc2));
        System.out.println("Sua nota Ag: "+ (notaAg));
        System.out.println("Sua nota Af: "+ (notaAf));

        System.out.println("===============================");
        System.out.printf("Sua média é %.1f%n ", media);
        System.out.println("================================");
        
        if (media >= notaNm){
            System.out.println("Status: Aprovado!");
            System.out.println("=================");
        }else{
            System.out.println("Status: Reprovado!");
            System.out.println("=================");
        }
        scanner.close();
    }
}
