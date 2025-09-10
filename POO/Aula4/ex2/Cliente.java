package ex2;

public class Cliente extends Pessoa {
    private String cpf;
    protected String email;
    private String NumCartao;
    protected String telefone;

    public Cliente(String nome,String dataNascimento, String cpf, String email, String NumCartao, String telefone) {
        super(nome, dataNascimento);
        this.setCpf(cpf);
        this.setEmail(email);
        this.setNumCartao(NumCartao);
        this.setTelefone(telefone);
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumCartao() {
        return NumCartao;
    }

    public void setNumCartao(String numCartao) {
        this.NumCartao = numCartao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
