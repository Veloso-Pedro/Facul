
public class ListaExercicio2 {
    
    public static class Produto{
        String nome;
        String marca;
        double precoCusto;
        double precoVenda;

        Produto(String nome, String marca, double precoCusto, double precoVenda){
            this.nome = nome;
            this.marca = marca;
            this.precoCusto = precoCusto;
            this.precoVenda = precoVenda;
        }

        public double lucro(){
            return precoVenda - precoCusto;
        }

        public String descricao(){
            return
                "Nome: " + this.nome + "\n" +
                "Marca: " + this.marca + "\n" +
                "Preço de Custo: R$ " + String.format("%.2f", this.precoCusto)  + "\n" +
                "Preço de Venda: R$ " + String.format("%.2f", this.precoVenda) + "\n"; 
        }
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Camiseta", "Nike", 15.50, 65.00);

        System.out.println( p1.descricao());
        System.out.println("Lucro: R$ " + String.format("%.2f", p1.lucro()));
    } 
}
