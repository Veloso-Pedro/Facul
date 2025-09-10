package ex2;

public class Vendedor extends Pessoa {
    private String cpf;
    protected String dataContratacao;
    protected double salarioBase;
    protected double percentualComissao;

    public Vendedor(String nome,String dataNascimento, String cpf, String dataContratacao, double salarioBase, double percentualComissao) {
        super(nome, dataNascimento);
        this.setCpf(cpf);
        this.setDataContratacao(dataContratacao);
        this.setSalarioBase(salarioBase);
        this.setPercentualComissao(percentualComissao);
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}
