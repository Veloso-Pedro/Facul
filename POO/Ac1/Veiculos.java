package POO.Ac1;


public class Veiculos {
    protected String modelo;
    protected String montadora;
    protected String placa;

    Veiculos(String modelo, String montadora, String placa){
        this.setModelo(modelo);
        this.setMontadora(montadora);
        this.ValidarPlaca(this.setPlaca(placa));
    }


    public String descricaoVeiculo(){
        return
            "Modelo: " + this.getModelo() + "\n" +
            "Montadora: " + this.getMontadora() + "\n" +
            "Placa: " + this.getPlaca() + "\n" +
            "Placa Valida: " +this.ValidarPlaca(this.getPlaca())+ "\n";
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

    //* Setters
    public void setModelo(String modelo) {
        this.modelo = modelo.toUpperCase();
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora.toUpperCase();
    }

    public String setPlaca(String placa) {

        if(placa == null){
            throw new IllegalArgumentException("Placa não pode ser nula!");
        }

        return this.placa = placa.toUpperCase();
    }


}
