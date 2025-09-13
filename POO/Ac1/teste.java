package POO.Ac1;

public class teste {
    public static void main(String[] args) {

        System.out.println("===== Veículo =====");
        Veiculos v = new Veiculos("Focus", "Ford", "FoP6i74");

        System.out.println(v.descricaoVeiculo());

        System.out.println("===== Carro =====");

        Carros c = new Carros("Focus", "Ford", "fop6874", 4, 250, "Automatico");

        System.out.println(c.descricaoCarros());

        System.out.println("===== Moto =====");

        Motos m = new Motos("R 1250 GS", "bwm", "lub4990", 1254);

        System.out.println(m.descricaoMotos());

        System.out.println("===== Caminhão =====");

        Caminhoes i = new Caminhoes("Actros Evolution 2653 S 6x4", "mercedes", "NEX-4811", 9, 74);

        System.out.println(i.descricaoCaminhoes());
    }
}
