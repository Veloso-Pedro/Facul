//Pedro Veloso Santiago Lima (RA: 251170)
// Eros Henrique Ferreira Vasconcelos (RA: 250940)

import java.util.Scanner;

public class Ac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declaração de variáveis (Ac1) 
        double notaAc1 = 0.0;
        double notaAc2 = 0.0;
        double notaAg = 0.0;
        double notaAf = 0.0;
        double notaNm = 0.0;
        // Declaração de Novas Variáveis (Ac2)
        double pesoAc1 = 0.0;
        double pesoAc2 = 0.0;
        double pesoAg = 0.0;
        double pesoAf = 0.0;
        double media = 0.0;
        double somaPesos = 0.0; // Variável para calcular a soma dos Pesos
        int esc = 0; // Variável da Escolha do Usuario 

        // Entrada das Novas Variáveis (Ac2)
        do { // Loop para garantir que os pesos vão respeitar a soma dos pesos
            System.out.println("Calculadora de média");
            System.out.println("===============================");
            System.out.println("Entrada dos Pesos (Apenas Números inteiros)");
            System.out.println("===============================");
            System.out.print("Digite o peso da Ac1: "); pesoAc1 = scanner.nextDouble();
            System.out.println("===============================");
            System.out.print("Digite o peso da Ac2: "); pesoAc2 = scanner.nextDouble();
            System.out.println("===============================");
            System.out.print("Digite o peso da Ag: "); pesoAg = scanner.nextDouble();
            System.out.println("===============================");
            System.out.print("Digite o peso da Af: "); pesoAf = scanner.nextDouble();
            System.out.println("===============================");

            somaPesos = pesoAc1 + pesoAc2 + pesoAg + pesoAf;
            if (somaPesos != 100.0) {
                System.out.println("A soma dos pesos deve ser exatamente 100%.");
                System.out.println("Entre Novamente com os Pesos:");
                System.out.println("===============================");

            }
        } while (somaPesos != 100);
        // Entrada das variáveis
        do { // Loop DoWhile
            System.out.println("Entradas de Notas");
            System.out.println("===============================");
            System.out.print("Digite sua nota da Ac1: "); notaAc1 = scanner.nextDouble();
            System.out.println("===============================");
            System.out.print("Digite sua nota da Ac2: "); notaAc2 = scanner.nextDouble();
            System.out.println("===============================");
            System.out.print("Digite sua nota da Ag: "); notaAg = scanner.nextDouble();
            System.out.println("===============================");
            System.out.print("Digite sua nota da Af: "); notaAf = scanner.nextDouble();
            System.out.println("===============================");
            do { // Loop Interno para garantir que a nota mínima vai ser maior que 3
                System.out.print("Digite a nota mínima para aprovação (maior que 3): ");
                notaNm = scanner.nextDouble();
                if (notaNm < 3) {
                    System.out.println("Erro: A nota mínima deve ser maior que 3.");
                }
            } while (notaNm < 3);
            System.out.println("==============================="); 

            // Calculando a média e prova real para garantir que os calculos estão certos
            media = (notaAc1 * (pesoAc1/100)) + (notaAc2 * (pesoAc2/100)) + (notaAg * (pesoAg/100)) + (notaAf * (pesoAf/100));
            

            // Saída dos dados
            System.out.println("Nota mínima para aprovação: "+ (notaNm));
            System.out.println("===============================");

            System.out.println("Ac1 -> nota: "+ (notaAc1)+" peso: "+(pesoAc1));
            System.out.println("Ac2 -> nota: "+ (notaAc2)+" peso: "+(pesoAc2));
            System.out.println("Ag -> nota: "+ (notaAg)+" peso: "+(pesoAg));
            System.out.println("Af -> nota: "+ (notaAf)+" peso: "+(pesoAf));

            System.out.println("===============================");
            System.out.printf("Sua média é %.1f%n", media);
            System.out.println("================================");

            if (media < notaNm - 1) {
            System.out.println("Reprovado");
            } else if (media < notaNm) {
            System.out.println("Recuperação");
            } else if (media == 10.0) {
            System.out.println("Aprovado com Excelência");
            } else {
            System.out.println("Aprovado");
            }

            System.out.println("================================");
            System.out.println("Deseja realizar uma nova simulação? (1- Continuar/ 2- Parar)");
            esc = scanner.nextInt();

            if(esc == 2){
                System.out.println("Obrigado por usar o programa!");
            }

        } while (esc != 2);

        scanner.close();
    }  
}
