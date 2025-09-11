package POO.Ac1;

public class Carros extends Veiculos {
    protected int qtdPortas;
    protected int potencia;

    Carros(String modelo, String montadora, String placa, int qtdPortas, int potencia){
        super(modelo, montadora, placa);
        this.setQtdPortas(qtdPortas);
        this.setPotencia(potencia);

    }


    public boolean ValidarPortas(){
        boolean portasValidas = false;

        
        if( qtdPortas > 4){
            System.out.println("Quantidade de portas invalida!!");
        }else{
            portasValidas = true;
            System.out.println("Quantidade de Portas Validas!!");
        }

        return portasValidas;
    }

    //* Getters
    public int getQtdPortas() {
        return qtdPortas;
    }

    public int getPotencia() {
        return potencia;
    }

    //* Setters 
    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
