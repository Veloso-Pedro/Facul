import java.util.Scanner;

import Aula1e2.ComoFazerUmSanduiche;
import Aula1e2.ReceitaCafe;
import Aula1e2.ReceitaSanduiche;
import Aula1e2.Somar2Numeros;
import Aula3.AreaCircunferencia;
import Aula3.AreadoTriangulo;
import Aula3.Conversao_Cast;
import Aula3.Media3Numeros;
import Aula3.QuadradodeNumero;
import Aula4.AnoBisexto;
import Aula4.CalculadoraSimples;
import Aula4.MaiorNum;
import Aula4.PositivoNegativoZero;
import Aula4.VerificacaodeIdade;
import Aula5e6.CalcladoraSwitch;
import Aula5e6.CalculadoraIMC;
import Aula5e6.CalendariodeEventos;
import Aula5e6.ClassificacaodeTriangolo;
import Aula5e6.ConversordeMedidas;
import Aula5e6.ConversordeMetros;
import Aula5e6.DiadaSemana;
import Aula5e6.HoradoDia;

public class Biblioteca_de_Exercicios {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int qtdL = 5;
       int escL = 0;
       int escI = 0;
       
      do{
        System.out.println("Biblioteca de Exercícios");
        System.out.println("============================");
        System.out.println("Quantidade de Listas ativas: "+qtdL);
        System.out.println("==============================");
        System.out.println("Digite qual Lista desejada (1 até "+qtdL+") ou aperte 0 para sair:");
        escL = s.nextInt();

        switch (escL) {
            case 1:
                System.out.println("Lista 1");
                System.out.println("====================");
                System.out.println("1- ComoFazerUmSanduiche");
                System.out.println("2- ReceitaCafe");
                System.out.println("3- ReceitaSanduiche");
                System.out.println("4- Somar2Numeros");
                escI = s.nextInt();
                if (escI == 1){
                    ComoFazerUmSanduiche.mostrar();
                }else if (escI == 2){
                    ReceitaCafe.mostrar();
                }else if (escI == 3){
                    ReceitaSanduiche.mostrar();
                }else if (escI == 4){
                    Somar2Numeros.mostrar();
                }else{
                    System.out.println("Erro!");
                }
                break;
            case 2:
                System.out.println("Lista 2");
                System.out.println("====================");
                System.out.println("1- AreaCircunferencia");
                System.out.println("2- AreadoTriangulo");
                System.out.println("3- Conversao_Cast");
                System.out.println("4- Media3Numeros");
                System.out.println("5- QuadradodeNumero");
                escI = s.nextInt();
                if (escI == 1){
                    AreaCircunferencia.mostrar();
                }else if (escI == 2){
                    AreadoTriangulo.mostrar();
                }else if (escI == 3){
                    Conversao_Cast.mostrar();
                }else if (escI == 4){
                    Media3Numeros.mostrar();
                }else if (escI == 5){
                    QuadradodeNumero.mostrar();
                }else{
                    System.out.println("Erro!");
                }
                break;
            case 3:
                System.out.println("Lista 3");
                System.out.println("====================");
                System.out.println("1- AnoBisexto");
                System.out.println("2- CalculadoraSimples");
                System.out.println("3- MaiorNum");
                System.out.println("4- PositivoNegativoZero");
                System.out.println("5- VerificacaodeIdade");
                escI = s.nextInt();
                if (escI == 1){
                    AnoBisexto.mostrar();
                }else if (escI == 2){
                    CalculadoraSimples.mostrar();
                }else if (escI == 3){
                    MaiorNum.mostrar();
                }else if (escI == 4){
                    PositivoNegativoZero.mostrar();
                }else if (escI == 5){
                    VerificacaodeIdade.mostrar();
                }else{
                    System.out.println("Erro!");
                }
                break;
            case 4:
                System.out.println("Lista 4");
                System.out.println("====================");
                System.out.println("1- CalcladoraSwitch");
                System.out.println("2- CalculadoraIMC");
                System.out.println("3- CalendariodeEventos");
                System.out.println("4- ClassificacaodeTriangolo");
                System.out.println("5- ConversordeMedidas");
                System.out.println("6- ConversordeMetros");
                System.out.println("7- DiadaSemana");
                System.out.println("8- HoradoDia");
                escI = s.nextInt();
                if (escI == 1){
                    CalcladoraSwitch.mostrar();
                }else if (escI == 2){
                    CalculadoraIMC.mostrar();
                }else if (escI == 3){
                    CalendariodeEventos.mostrar();
                }else if (escI == 4){
                    ClassificacaodeTriangolo.mostrar();
                }else if (escI == 5){
                    ConversordeMedidas.mostrar();
                }else if (escI == 6){
                    ConversordeMetros.mostrar();
                }else if (escI == 7){
                    DiadaSemana.mostrar();
                }else if (escI == 8){
                    HoradoDia.mostrar();
                }else{
                    System.out.println("Erro!");
                }

                break;
            default:
                break;
        }
      }while(escL != 0);
    }
}
