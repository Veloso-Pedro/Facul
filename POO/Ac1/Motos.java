package POO.Ac1;

public class Motos extends Veiculos {
    protected int cilindradas;
    protected boolean protetorMotor = false;
    protected boolean alarme = false;
    protected boolean bau = false;

    Motos(String modelo, String montadora, String placa, String ano, String cor, double valor, int cilindradas, boolean protetorMotor, boolean alarme, boolean bau){
        super(modelo,montadora, placa, ano, cor, valor);
        this.setCilindradas(cilindradas);
        this.setProtetorMotor(protetorMotor);
        this.setAlarme(alarme);
        this.setBau(bau);
        
    }

    //* Construtor Padrão
    Motos(String modelo, String montadora, String placa, String ano, String cor, double valor, int cilindradas){
        this( modelo,  montadora,  placa, ano, cor, valor, cilindradas, false, false, false);
    }

    public String descricaoMotos(){
        return
            "Modelo: " + this.getModelo() + "\n" +
            "Montadora: " + this.getMontadora() + "\n" +
            "Placa: " + this.getPlaca() + "\n" +
            "Placa Valida: " + this.ValidarPlaca(this.getPlaca())+ "\n" +
            "Ano: " + this.getAno() + "\n" +
            "Cor: " + this.getCor() + "\n" +
            "Valor: R$ " + String.format("%.2f",this.getValor()) +  "\n" +
            "Cilindradas: "+ this.getCilindradas()+ " CC" + "\n" + 
            "Protetor de Motor: " + this.getProtetorMotor()+ "\n" +
            "Alarme: " + this.getAlarme() + "\n" +
            "Bau: " + this.getBau() + "\n";

    }


    //* Getters
    public int getCilindradas() {
        return this.cilindradas;
    }

    public boolean getProtetorMotor() {
        return this.protetorMotor;
    }

    public boolean getAlarme() {
        return this.alarme;
    }

    public boolean getBau() {
        return this.bau;
    }

    //* Setters
    public int setCilindradas(int cilindradas) {
        
        if (cilindradas < 50){
            throw new IllegalArgumentException("Cilindrada não pode ser menor que 50");
        }
        
        return this.cilindradas = cilindradas;
    }

    public void setProtetorMotor(boolean protetorMotor) {
        this.protetorMotor = protetorMotor;
    }

    public void setAlarme(boolean alarme) {
        this.alarme = alarme;
    }

    public void setBau(boolean bau) {
        this.bau = bau;
    }
    
}
