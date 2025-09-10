
public class ListaExercicio2 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Camiseta", "Nike", 15.50, 65.00);

        System.out.println( p1.descricao());
        System.out.println("Lucro: R$ " + String.format("%.2f", p1.lucro()));

        System.out.println("==========================================================");

        Pessoa people = new Pessoa();

       
    } 
}
