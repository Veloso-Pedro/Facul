package POO.Aula5.pacote01;

public class FuncoesUteis{
    
    public boolean Validarcpf(String i) {
        boolean Validarcpf = false;
        String regex = "^(?:\\d{3}.\\d{3}.\\d{3}-\\d{2})$";

        if(i.matches(regex)){
            Validarcpf = true;
        }

        return Validarcpf;
    }

    public void  CalcularIMC(double a, double p) {
        double IMC = a /(p*p);

        

        System.out.println(IMC);

    }

    public  void Avaliar(double n, double p){
        boolean aprovado = false;

        if(n >= 5 && p >= 75){
            aprovado = true;
        }
        
        System.out.println("Aprovado: " + aprovado);
    }
}
