package POO.Ac1;

public class Caminhoes extends Veiculos {
    protected int qtdEixos;
    protected int cargaMax;

    Caminhoes(String modelo, String montadora, String placa, int qtdEixos, int cargaMax){
        super(modelo, montadora, placa);
        this.setQtdEixos(qtdEixos);
        this.setCargaMax(cargaMax);


    }

    public boolean ValidarQtdEixos(){
        boolean qtdEixosValido = false;

        if(qtdEixos >= 9){
            qtdEixosValido = true;
            System.out.println("Quantidade de eixos validos!!!");
        }else{
            System.out.println("Quantidade de eixos invalido!!!");
        }

        return qtdEixosValido;
    }

    //* Getters 
    public int getQtdEixos() {
        return qtdEixos;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    //* Setters 
    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

}
