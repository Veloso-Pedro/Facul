import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.ZoneId;



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

    public static class Pessoa{
        String nome;
        String sobrenome;
        LocalDate dataN;
        String email;

        Pessoa(String nome, String sobrenome, String dataN){
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.dataN = validarData(dataN);
            this.email = nome.toLowerCase() + "." + sobrenome.toLowerCase() + "@dominio.";
        }

        private LocalDate validarData(String dataTexto) {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate data = LocalDate.parse(dataTexto, formatter);

                if (data.isAfter(LocalDate.now())) {
                    throw new IllegalArgumentException("Data de nascimento não pode ser no futuro!");
                }

                return data;
            } catch (DateTimeParseException e) {
                throw new IllegalArgumentException("Data inválida! Use o formato dd/MM/yyyy");
            }
        }

        public long getDataNascimentoEpoch() {
            return this.dataN.atStartOfDay(ZoneId.systemDefault()).toEpochSecond();
        }


        public String descricao(){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return
                "nome: " + this.nome + "\n" +
                "sobrenome: " + this.sobrenome + "\n" +
                "Data de Nascimento: " + this.dataN.format(formatter) + "\n" +
                "Email: " + this.email + "\n";
        }


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Produto p1 = new Produto("Camiseta", "Nike", 15.50, 65.00);

        System.out.println( p1.descricao());
        System.out.println("Lucro: R$ " + String.format("%.2f", p1.lucro()));

        System.out.println("==========================================================");

        Pessoa people = new Pessoa("Carlos", "Lima", "22/08/2025");

        System.out.println(people.descricao());
    } 
}
