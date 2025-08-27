public class Produto {

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