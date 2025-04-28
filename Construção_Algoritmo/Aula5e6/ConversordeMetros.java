package Aula5e6;
import java.util.Scanner;

public class ConversordeMetros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o valor em metros: ");
        double valor = s.nextDouble();
        System.out.println("=========================");
        System.out.println("Escolha qual unidade de medida desejada: ");
        System.out.println("CM - Centímetros");
        System.out.println("KM - Quilômetros");
        String esc = s.next().toUpperCase();

        if (esc.equals("CM")){
            System.out.println(valor + " Metros em Centímetros é igual á " + (valor * 100.0)  );
        }else if (esc.equals("KM")){
            System.out.println(valor + " Metros em Quilômetros é igual á " + (valor / 1000.0)  );
        }

        s.close();
    }
}
