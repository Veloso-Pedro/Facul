import java.util.Scanner;

public class ListaExercicio1 {
    public int maiorNum(int num1, int num2, int num3){
        int maior;

        maior = num1;

        if(num1 == num2 || num2 == num3 || num1 == num3 ){
            maior = 0;
        }
        if(maior < num2){
            maior = num2;
        }
        if (maior < num3) {
            maior = num3;
        }
        return maior;
    }

    public double media(int a, int b, int c){
        double media = (a + b + c) / 3;
        return media;

    }

    public void conv(int minTotal){
        int horas = minTotal / 60;
        int min = minTotal % 60;

        System.out.println(minTotal + " minutos equivale a " + horas + "h " +min+ "min");
    }

     public void tipoNum(int num) {
            if(num >= 0){
                System.out.println("Positivo");
            }else if(num < 0){
                System.out.println("Negativo");
            }
    }

    public double pot(int a, int b){
       double pot = Math.pow(a, b);

        return pot;
    }

    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int escolha;

        do {

            System.out.println("Escolha qual exercicio vc deseja ver: ");
            System.out.println("1- Maior Número");
            System.out.println("2- Média de Três Números");
            System.out.println("3- Conversão de Minutos para Horas");
            System.out.println("4- classificação de Números");
            System.out.println("5- Potência");
            System.out.println("0- Sair!!");

            escolha = s.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o primeiro número: ");
                    int x = s.nextInt();
                    System.out.println("Digite o segundo número: ");
                    int y = s.nextInt();
                    System.out.println("Digite o terceiro número: ");
                    int z = s.nextInt();

                    ListaExercicio1 t1 = new ListaExercicio1();

                    int maior = t1.maiorNum(x, y, z);

                    System.out.println("Maior Número: " + maior );

                    System.out.println("============================");
                    break;

                case 2:
                    System.out.println("Digite o primeiro número: ");
                    int a = s.nextInt();
                    System.out.println("Digite o segundo número: ");
                    int b = s.nextInt();
                    System.out.println("Digite o terceiro número: ");
                    int c = s.nextInt();

                    ListaExercicio1 t2 = new ListaExercicio1();

                    double media = t2.media(a, b, c);

                    System.out.println("A média é  "+ media);

                    System.out.println("============================");
                    break;

                case 3:
                    System.out.println("Digite uma quantidade de minutos? ");
                    int resposta = s.nextInt();

                    ListaExercicio1 t3 = new ListaExercicio1();
                    t3.conv(resposta);

                    System.out.println("============================");
                    break;

                case 4:
                    System.out.println("Digite um número: ");
                    int num = s.nextInt();

                    ListaExercicio1 t4 = new ListaExercicio1();
                    t4.tipoNum(num);

                    System.out.println("============================");
                    break;

                case 5:
                    System.out.println("Digite o primeiro número: ");
                    int base = s.nextInt();
                    System.out.println("Digite o segundo número: ");
                    int exp = s.nextInt();

                    ListaExercicio1 t5 = new ListaExercicio1();

                    double pot = t5.pot(base, exp);

                    System.out.println("A potencia é " + pot);

                    System.out.println("============================");
                    break;
                    

                case 0:
                    System.out.println("Obrigado por testar!!");
                    System.out.println("Saindo...");

                    System.out.println("============================");
                    break;

                default:
                    System.out.println("Erro!!");

                    System.out.println("============================");
                    break;
            }
            
        } while (escolha != 0);

    }
}