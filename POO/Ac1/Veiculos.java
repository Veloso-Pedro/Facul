package POO.Ac1;


public class Veiculos {
    protected String modelo;
    protected String montadora;
    protected String placa;

    Veiculos(String modelo, String montadora, String placa){
        this.setModelo(modelo);
        this.setMontadora(montadora);
        this.setPlaca(placa.toUpperCase());
    }


    public String descricaoVeiculo(){
        return
            "Modelo: " + getModelo() + "\n" +
            "Montadora: " + getMontadora() + "\n" +
            "Placa: " + getPlaca() + "\n";
    }
    

    


    public boolean ValidarPlaca(){
        boolean placaValida = false;
        // Padrão antigo | Padrão mercosul ^ (?: [A-Z]{3} -? \\d{4} | [A-Z]{3} \\d [A-Z] \\d{2})$ 
        String regex = "^(?:[A-Z]{3}-?\\d{4}|[A-Z]{3}\\d[A-Z]\\d{2})$";

        if (this.getPlaca().matches(regex)){
            placaValida = true;
            System.out.println("Placa válida!!");
        }else{
            System.out.println("Placa Invalida!!");
        }

        return placaValida;
    }

    //* Getters
    public String getModelo() {
        return modelo;
    }

    public String getMontadora() {
        return montadora;
    }

    public String getPlaca() {
        return placa;
    }

    //* Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


}
