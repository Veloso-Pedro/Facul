package ex2;

public class Pessoa {
    protected String nome;
    protected String dataNascimento;

    Pessoa(String nome, String dataNascimento){
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
