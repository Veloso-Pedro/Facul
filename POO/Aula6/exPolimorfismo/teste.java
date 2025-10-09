package POO.Aula6.exPolimorfismo;

public class teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Douglas", "null");
        Aluno a1 = new Aluno("marcos", "", "245");
        Professor pf1 = new Professor("Santos", null, "Doutorado");
        Funcionario f1 = new Funcionario("fernando", null, "bombeiro");

        System.out.println(p1.enviarEmail());
        System.out.println(pf1.enviarEmail());
        System.out.println(a1.enviarEmail());
        System.out.println(f1.enviarEmail());
    }
}
