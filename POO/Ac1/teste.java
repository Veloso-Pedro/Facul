package POO.Ac1;

public class teste {
    public static void main(String[] args) {
        Veiculos v = new Veiculos("Focus", "Ford", "FOP6874");

        
        System.out.println(v.descricaoVeiculo());

        System.out.println("=================================");

        Carros c = new Carros("Focus", "Ford", "fop6874", 4, 250);

        System.out.println(c.descricaoCarros());
    }
}
