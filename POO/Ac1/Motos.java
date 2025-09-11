package POO.Ac1;

public class Motos extends Veiculos {
    protected int cilindradas;

    Motos(String modelo, String montadora, String placa, int cilindradas){
        super(modelo,montadora, placa);
        this.setCilindradas(cilindradas);
        
    }

    public String descricaoMoto(){
        return
            "Modelo: " + this.getModelo() + "\n" +
            "Montadora: " + this.getMontadora() + "\n" +
            "Placa: " + this.getPlaca() + "\n" +
            "Placa Valida: " +this.ValidarPlaca()+ "\n" +
            "Cilindradas: "+this.getCilindradas()+ " CC" + "\n";

    }

    //* Getters
    public int getCilindradas() {
        return this.cilindradas;
    }

    //* Setters
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
}
