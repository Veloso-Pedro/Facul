import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Pessoa {
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
