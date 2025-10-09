package POO.Aula6;

public class teste {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        Quadrado q2 = new Quadrado();
        q1.altura = 20;
        q1.largura = 20;
        q2.altura = 20;
        q2.largura = 20;

        System.out.println(q1.equals(q2));
    }
}
