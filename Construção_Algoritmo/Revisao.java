import java.util.Scanner;

public class Revisao {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int qtdSalas = 3;
        int qtdSlots = 5;
        boolean[][] quadroDeReservas = new boolean[qtdSalas][qtdSlots];
        String continuar = " ";
        int salaEscolida;
        //int indiceSalaEscolhida = - 1; int indiceSlot = -1;

        do {
            do {
                System.out.println("Escolha a sala (1-3)");
                salaEscolida = s.nextInt();
            } while (salaEscolida < 1 || salaEscolida > 3);

            //for(int slot)


            System.out.println("Dseja cotinuar? (s- sim): ");
            continuar = s.next();
        } while (continuar.toLowerCase().equals("s"));
    }
}
