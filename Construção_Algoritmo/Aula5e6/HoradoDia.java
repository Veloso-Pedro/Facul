package Aula5e6;
import java.util.Scanner;

public class HoradoDia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a hora atual (1-24): ");
        int hora = s.nextInt();

        if (hora >= 1 && hora <= 12 ){
            System.out.println("Manhã");
        }else if(hora >= 13 && hora <= 18){
            System.out.println("Tarde");
        }else{
            System.out.println("Noite");
        }

        s.close();
    }

}
