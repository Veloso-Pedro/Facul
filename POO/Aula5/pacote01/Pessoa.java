package POO.Aula5.pacote01;

public class Pessoa {
    private String nome;
    private String cpf;
    protected double altura;
    protected double peso;


// Getters
public String getNome() {
    return nome;
}

public String getCpf() {
    return cpf;
}

public double getAltura() {
    return altura;
}

public double getPeso() {
    return peso;
}

// Setters
public void setNome(String nome) {
    this.nome = nome;
}

public void setCpf(String cpf) {
    this.cpf = cpf;
}

public void setAltura(double altura) {
    this.altura = altura;
}

public void setPeso(double peso) {
    this.peso = peso;
}
}
