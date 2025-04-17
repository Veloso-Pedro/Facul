import java.util.Scanner;

public class ConversordeMedidas {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite Qual o valor você quer converter: ");
        System.out.println("CM - Centímetros");
        System.out.println("M - Metro ");
        System.out.println("KM - Quilômetros");
        String esc = scn.next().toUpperCase();

        switch (esc) {
            case "CM":
                System.out.println("Digite para qual valor você deseja converter:");
                System.out.println("M - Metro ");
                System.out.println("KM - Quilômetros");
                String esc1 = scn.next().toUpperCase();

                if (esc1.equals("M")){
                    System.out.println("Digite o valor em CM: ");
                    double valor = scn.nextDouble();

                    System.out.println("A conversão de "+ (valor)+" CM para Metros é igual a "+(valor / 100.0));
                }else if (esc1.equals("KM")){
                    System.out.println("Digite o valor em CM: ");
                    double valor = scn.nextDouble();

                    System.out.println("A conversão de "+ (valor)+" CM para Quilômetros é igual a "+(valor / 100000.0));  
                }else{
                    System.out.println("Erro!");
                }
                break;
            case "M":
                System.out.println("Digite para qual valor você deseja converter:");
                System.out.println("CM - Centímetros ");
                System.out.println("KM - Quilômetros");
                String esc2 = scn.next().toUpperCase();
                if (esc2.equals("CM")){
                    System.out.println("Digite o valor em M: ");
                    double valor = scn.nextDouble();

                    System.out.println("A conversão de "+ (valor)+" M para Centímetros é igual a "+(valor * 100.0));
                }else if (esc2.equals("KM")){
                    System.out.println("Digite o valor em M: ");
                    double valor = scn.nextDouble();

                    System.out.println("A conversão de "+ (valor)+" M para Quilômetros é igual a "+(valor / 1000.0));  
                }else{
                    System.out.println("Erro!");
                }
                break;
            case "KM":
                System.out.println("Digite para qual valor você deseja converter:");
                System.out.println("CM - Centímetros ");
                System.out.println("M - Metros");
                String esc3 = scn.next().toUpperCase();
                if (esc3.equals("CM")){
                    System.out.println("Digite o valor em KM: ");
                    double valor = scn.nextDouble();

                    System.out.println("A conversão de "+ (valor)+" KM para Centímetros é igual a "+(valor * 100000.0));
                }else if (esc3.equals("M")){
                    System.out.println("Digite o valor em KM: ");
                    double valor = scn.nextDouble();

                    System.out.println("A conversão de "+ (valor)+" KM para Metros é igual a "+(valor * 1000.0));  
                }else{
                    System.out.println("Erro!");
                }
                break;
            default:
                System.out.println("Erro!");
                break;
        }
        scn.close();
    }
}
