package POO.Aula6.exPolimorfismo;

public class Funcionario extends Pessoa {
    private  String funcao;

    Funcionario(String nome, String email, String funcao){
        super(nome, email);
        setFuncao(funcao);
    }

    @Override
    public String enviarEmail(){
        return "Olá Colaorador " + this.getNome() + " !";
    }

    // ----- Getters -----
    public String getFuncao() {
        return funcao;
    }

    // ----- Setters -----
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
