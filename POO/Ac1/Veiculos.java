package POO.Ac1;


public class Veiculos {
    protected String modelo;
    protected String montadora;
    protected String placa;
    protected String ano;
    protected String cor;
    protected double valor;

    Veiculos(String modelo, String montadora, String placa, int ano, String cor, double valor){
        this.setModelo(modelo);
        this.setMontadora(montadora);
        this.ValidarPlaca(this.setPlaca(placa));
        this.setAno(ano);
        this.setCor(cor);
        this.setValor(valor);
        
    }


    public String descricaoVeiculo(){
        return
            "Modelo: " + this.getModelo() + "\n" +
            "Montadora: " + this.getMontadora() + "\n" +
            "Placa: " + this.getPlaca() + "\n" +
            "Placa Valida: " +this.ValidarPlaca(this.getPlaca())+ "\n" +
            "Ano: " + this.getAno() + "\n" +
            "Cor: " + this.getCor() + "\n" +
            "Valor: R$ " + String.format("%.2f",this.getValor()) +  "\n";
    }

    public boolean ValidarPlaca(String i){
        boolean placaValida = false;
        // Padrão antigo | Padrão mercosul ^ (?: [A-Z]{3} -? \\d{4} | [A-Z]{3} \\d [A-Z] \\d{2})$ 
        String regex = "^(?:[A-Z]{3}-?\\d{4}|[A-Z]{3}\\d[A-Z]\\d{2})$";

        if (this.getPlaca().matches(regex)){
            placaValida = true;
        }

        return placaValida;
    }

    //* Getters
    public String getModelo() {
        return this.modelo;
    }

    public String getMontadora() {
        return this.montadora;
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getAno() {
        return this.ano;
    }

    public String getCor() {
        return this.cor;
    }

    public double getValor() {
        return this.valor;
    }

    //* Setters
    public void setModelo(String modelo) {
        
        if(modelo == null){
            throw new IllegalArgumentException("Modelo não pode ser nulo!");
        }
        
        this.modelo = modelo.toUpperCase();
    }

    public void setMontadora(String montadora) {
        
        if (montadora == null){
            throw new IllegalArgumentException("Montadora não pode ser nulo!");
        }
        
        this.montadora = montadora.toUpperCase();
    }

    public String setPlaca(String placa) {

        if(placa == null){
            throw new IllegalArgumentException("Placa não pode ser nula!");
        }

        return this.placa = placa.toUpperCase();
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
