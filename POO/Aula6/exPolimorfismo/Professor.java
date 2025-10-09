package POO.Aula6.exPolimorfismo;

public class Professor extends Pessoa {
    private String formacao;

    Professor(String nome, String email, String formacao){
        super(nome, email);

    }

    @Override
    public String enviarEmail(){
        return "Olá prof. " + this.getNome() + " !";
    }

    public String getFormacao() {
        return formacao;
    }

    // ---- divisão entre getters e setters ----

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
