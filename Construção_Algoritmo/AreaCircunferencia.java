import java.util.Scanner;

public class AreaCircunferencia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float nota = 0;

        System.out.println("Digite a primeira nota: ");
        nota = scanner.nextFloat();
        System.out.println("Digite a segunda nota: ");
        nota = scanner.nextFloat() + nota;
        System.out.println("Digite a terceira nota: ");
        nota = scanner.nextFloat() + nota;
        float media = nota/3;
        System.out.println("A sua nota é "+ media);
    }
    
}
