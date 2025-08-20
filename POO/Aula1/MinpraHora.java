package POO.Aula1;

import java.util.Scanner;

public class MinpraHora {
    public double conv(double min) {
       if (min < 60){
            return min;
       }else if(min > 60){
           min = min / 60;
            return min;   
       }

       return min;        
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        MinpraHora t1 = new MinpraHora();

        double horas = t1.conv(90);

        System.out.println(horas);
    }
}
