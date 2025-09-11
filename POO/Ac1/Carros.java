package POO.Ac1;

public class Carros extends Veiculos {
    protected int qtdPortas;
    protected int potencia;

    Carros(String modelo, String montadora, String placa, int qtdPortas, int potencia){
        super(modelo, montadora, placa);
        this.setQtdPortas(qtdPortas);
        this.setPotencia(potencia);

    }

    public String descricaoCarros(){
        return
            "Modelo: " + this.getModelo() + "\n" +
            "Montadora: " + this.getMontadora() + "\n" +
            "Placa: " + this.getPlaca() + "\n" +
            "Placa valida: " +this.ValidarPlaca()+ "\n" +
            "Potencia: " +this.getPotencia()+ " CV" + "\n" +
            "Quantidade de portas: " +this.getQtdPortas()+ "\n" +
            "Quantidade de portas valida: " +this.validarPortas()+ "\n";


    }


    public boolean validarPortas(){
        boolean portasValidas = false;

        
        if( qtdPortas <= 4){
            portasValidas = true;
        }

        return portasValidas;
    }

    //* Getters
    public int getQtdPortas() {
        return this.qtdPortas;
    }

    public int getPotencia() {
        return this.potencia;
    }

    //* Setters 
    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
