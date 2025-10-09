package POO.Aula5.pacote01;

public class Aluno extends Pessoa {
    private double nota;
    private double presenca;

    // Getters
    public double getNota() {
        return nota;
    }

    public double getPresença() {
        return presenca;
    }

    // Setters
    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setPresenca(double presenca) {
        this.presenca = presenca;
    }
}
