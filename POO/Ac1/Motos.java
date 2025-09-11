package POO.Ac1;

public class Motos extends Veiculos {
    protected int cilindradas;

    Motos(String modelo, String montadora, String placa, int cilindradas){
        super(modelo,montadora, placa);
        this.setCilindradas(cilindradas);
        
    }

    //* Getters
    public int getCilindradas() {
        return cilindradas;
    }

    //* Setters
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
}
