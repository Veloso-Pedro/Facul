package POO.Ac1;

public class teste {
    public static void main(String[] args) {

        System.out.println("===== Veículo =====");
        //*Modelo,montadora,placa,ano,cor,valor 
        Veiculos v = new Veiculos("Focus", "Ford", "FoP-6i74", "2010", "Branco", 25000.00);

        System.out.println(v.descricaoVeiculo());

        System.out.println("===== Carro =====");
        //*Modelo,montadora,placa,ano,cor,valor,qtdportas,potencia,cambio,freiosabs,kitcamera
        Carros c = new Carros("Focus", "Ford", "FJB4E12",  "2010", "Preto", 25000.00, 4, 250, "Automatico");

        System.out.println(c.descricaoCarros());

        System.out.println("===== Moto =====");
        //*Modelo,montadora,placa,ano,cor,valor,cilindrada,protetormotor,alarme,bau
        Motos m = new Motos("R 1250 GS", "bwm", "luB4990", "2010", "Prata", 25000.00, 1254);

        System.out.println(m.descricaoMotos());

        System.out.println("===== Caminhão =====");
        //*Modelo,montadora,placa,ano,cor,valor,qqtdeixos,cargamax,faixarefletiva,luzlateral,lona
        Caminhoes i = new Caminhoes("Actros Evolution 2653 S 6x4", "mercedes", "NEX-4811", "2010", "Branco", 25000.00, 9, 74);

        System.out.println(i.descricaoCaminhoes());
    }
}
