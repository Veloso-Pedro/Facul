package POO.Aula6.exPolimorfismo;

public class Aluno extends Pessoa {
    private String ra;

    Aluno(String nome, String email, String ra){
        super(nome, email);
        setRa(ra);

    }

    @Override
    public String enviarEmail(){
        return "Olá Aluno " + this.getNome() + " !";
    }

    public String getRa() {
        return ra;
    }

    // --- Divisão entre getters e setters ---

    public void setRa(String ra) {
        this.ra = ra;
    }
}
