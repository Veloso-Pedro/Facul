package POO.Aula6.exPolimorfismo;

public class Pessoa {
    private String nome;
    private String email;

    Pessoa(String nome, String email){
        setNome(nome);
        setEmail(email);
    }

    public String enviarEmail() {
        return "Olá Sr. " + this.getNome() + " !";
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
