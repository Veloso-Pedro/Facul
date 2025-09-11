package POO.Ac1;

public class Caminhoes extends Veiculos {
    protected int qtdEixos;
    protected int cargaMax;

    Caminhoes(String modelo, String montadora, String placa, int qtdEixos, int cargaMax){
        super(modelo, montadora, placa);
        this.setQtdEixos(qtdEixos);
        this.setCargaMax(cargaMax);


    }

    public String descricaoCaminhoes(){
        return
            "Modelo: " + this.getModelo() + "\n" +
            "Montadora: " + this.getMontadora() + "\n" +
            "Placa: " + this.getPlaca() + "\n" +
            "Placa Valida: " +this.ValidarPlaca()+ "\n" +
            "Quantidade de eixos: " +this.getQtdEixos()+ "\n" +
            "Quantidade de eixos valido: " +this.validarQtdEixos()+ "\n" +
            "Quantidade de carga maxima: "+this.getCargaMax()+ " Toneladas" + "\n" +
            "Quantidade de carga maxima valida: " +this.validarCargaMax()+ "\n";


    }

    public boolean validarQtdEixos(){
        boolean qtdEixosValido = false;

        if(qtdEixos <= 9){
            qtdEixosValido = true;
        }
        return qtdEixosValido;
    }

     public boolean validarCargaMax(){
        boolean cargaMaxValido = false;

        if(qtdEixos <= 74){
            cargaMaxValido = true;
        }
        return cargaMaxValido;
    }

    //* Getters 
    public int getQtdEixos() {
        return this.qtdEixos;
    }

    public int getCargaMax() {
        return this.cargaMax;
    }

    //* Setters 
    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

}
