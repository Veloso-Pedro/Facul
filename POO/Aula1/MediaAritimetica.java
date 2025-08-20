package POO.Aula1;

import java.util.Scanner;

public class MediaAritimetica {
    public double numMedia(int a, int b, int c)  {
        double media = (a + b + c) / 3;
        return media;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int x = s.nextInt();
        System.out.println("Digite o segundo número: ");
        int y = s.nextInt();
        System.out.println("Digite o terceiro número: ");
        int z = s.nextInt();

        MediaAritimetica t1 = new MediaAritimetica();

        double media = t1.numMedia(x, y, z);

        System.out.println("A média é  "+ media);
    }
}
