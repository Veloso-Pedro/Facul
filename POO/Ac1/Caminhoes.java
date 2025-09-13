package POO.Ac1;

public class Caminhoes extends Veiculos {
    protected int qtdEixos;
    protected int cargaMax;
    protected boolean faixaRefletiva = false;
    protected boolean luzLateral = false;
    protected boolean lona = false;

    Caminhoes(String modelo, String montadora, String placa, int qtdEixos, int cargaMax, boolean faixaRefletiva, boolean luzLateral, boolean lona){
        super(modelo, montadora, placa);
        this.validarQtdEixos(this.setQtdEixos(qtdEixos));
        this.validarCargaMax(this.setCargaMax(cargaMax));
        this.setFaixaRefletiva(faixaRefletiva);
        this.setLuzLateral(luzLateral);
        this.setLona(lona);


    }

    //* Construtor Padrão
    Caminhoes(String modelo, String montadora, String placa, int qtdEixos, int cargaMax){
        this( modelo,  montadora,  placa,  qtdEixos,  cargaMax, false, false, false);
    }

    public String descricaoCaminhoes(){
        return
            "Modelo: " + this.getModelo() + "\n" +
            "Montadora: " + this.getMontadora() + "\n" +
            "Placa: " + this.getPlaca() + "\n" +
            "Placa Valida: " + this.ValidarPlaca(this.getPlaca()) + "\n" +
            "Quantidade de eixos: " + this.getQtdEixos() + "\n" +
            "Quantidade de carga maxima: "+ this.getCargaMax() + " Toneladas" + "\n" +
            "Faixa Refletiva: " + this.getFaixaRefletiva() + "\n" +
            "Luz Lateral: " + this.getLuzLateral() + "\n" +
            "Lona: " + this.getLona() + "\n";
    }

    public void validarQtdEixos(int i){
       
        if(i > 9) {
            throw new IllegalArgumentException("A Quantidade maxima de eixos permitido por lei é 9!");
        }
    }

     public void validarCargaMax(int i){

        if(i > 74){
            throw new IllegalArgumentException("A Quantidade maxima de peso permitido por lei é 74 toneladas");
        } 
    }

    //* Getters 
    public int getQtdEixos() {
        return this.qtdEixos;
    }

    public int getCargaMax() {
        return this.cargaMax;
    }

    public boolean getFaixaRefletiva() {
        return this.faixaRefletiva;
    }

    public boolean getLuzLateral() {
        return this.luzLateral;
    }

    public boolean getLona() {
        return this.lona;
    }

    //* Setters 
    public int setQtdEixos(int qtdEixos) {
        return this.qtdEixos = qtdEixos;
    }

    public int setCargaMax(int cargaMax) {
        return this.cargaMax = cargaMax;
    }

    public void setFaixaRefletiva(boolean faixaRefletiva) {
        this.faixaRefletiva = faixaRefletiva;
    }

    public void setLuzLateral(boolean luzLateral) {
        this.luzLateral = luzLateral;
    }

    public void setLona(boolean lona) {
        this.lona = lona;
    }

}
