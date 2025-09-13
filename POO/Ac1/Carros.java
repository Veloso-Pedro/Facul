package POO.Ac1;

public class Carros extends Veiculos {
    protected int qtdPortas;
    protected int potencia;
    protected String cambio;
    protected boolean freioABS;
    protected boolean kitCamera;

    Carros(String modelo, String montadora, String placa, int qtdPortas, int potencia, String cambio, boolean freioABS, boolean kitCamera){
        super(modelo, montadora, placa);
        this.validarPortas(this.setQtdPortas(qtdPortas));
        this.validarPotencia(this.setPotencia(potencia));
        this.setCambio(cambio);
        this.setFreioABS(freioABS);
        this.setKitCamera(kitCamera);

    }

    //* Construtor Padrão
    Carros(String modelo, String montadora, String placa, int qtdPortas, int potencia, String cambio){
        this( modelo,  montadora, placa,  qtdPortas,  potencia,  cambio, false, false);
    }

    public String descricaoCarros(){
        return
            "Modelo: " + this.getModelo() + "\n" +
            "Montadora: " + this.getMontadora() + "\n" +
            "Placa: " + this.getPlaca() + "\n" +
            "Placa valida: " + this.ValidarPlaca(this.getPlaca())+ "\n" +
            "Potencia: " + this.getPotencia() + " CV" + "\n" +
            "Quantidade de portas: " + this.getQtdPortas() + "\n" +
            "Cambio: " + this.getCambio() + "\n" +
            "Freio ABS: " + this.getFreioABS() + "\n" +
            "Kit de Cameras: " + this.getKitCamera() + "\n"; 


    }


    public void validarPortas(int p){
        
        if (p > 4){
            throw new IllegalArgumentException("O maximo de portas é quatro!");
        }
    }

    public void validarPotencia(int p) {
        if (p <= 0) {
            throw new IllegalArgumentException("A potencia não pode ser neegativa! nem zero!");
        }
    }

    //* Getters
    public int getQtdPortas() {
        return this.qtdPortas;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public String getCambio() {
        return this.cambio;
    }

    public boolean getFreioABS() {
        return this.freioABS;
    }

    public boolean getKitCamera() {
        return this.kitCamera;
    }

    //* Setters 
    public int setQtdPortas(int qtdPortas) {
        return this.qtdPortas = qtdPortas;
    }

    public int setPotencia(int potencia) {
        return this.potencia = potencia;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio.toUpperCase();
    }

    public void setFreioABS(boolean freioABS) {
        this.freioABS = freioABS;
    } 

    public void setKitCamera(boolean kitCamera) {
        this.kitCamera = kitCamera;
    }
}
