package Aula5e6;
import java.util.Scanner;

public class CalendariodeEventos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Escolha o mês desejado (1-12): ");
        int mes = s.nextInt();

        switch (mes) {
            case 1:
                System.out.println("01/01 — Confraternização Universal (feriado)");
                System.out.println("=====================");
                System.out.println("06/01 — Dia de Reis");
                System.out.println("=====================");
                System.out.println("Férias escolares (mês inteiro)");
                System.out.println("=====================");
                break;
            case 2:
                System.out.println("Carnaval (geralmente fevereiro ou março)");
                System.out.println("14/02 — Dia de São Valentim (Valentine’s Day — fora do Brasil)");
                break;
            case 3:
                System.out.println("08/03 — Dia Internacional da Mulher");
                System.out.println("Carnaval (se não for em fevereiro)");
                System.out.println("Início do Outono (20 ou 21/03)");
                break;
            case 4:
                System.out.println("07/04 — Dia Mundial da Saúde");
                System.out.println("Sexta-feira Santa");
                System.out.println("Páscoa");
                System.out.println("21/04 — Tiradentes (feriado)");
                System.out.println("22/04 — Descobrimento do Brasil");
                break;
            case 5:
                System.out.println("01/05 — Dia do Trabalhador (feriado)");
                System.out.println("12/05 (2024) — Dia das Mães (2º domingo de maio)");
                System.out.println("13/05 — Abolição da Escravatura (Lei Áurea)");
                break;
            case 6:
                System.out.println("12/06 — Dia dos Namorados (Brasil)");
                System.out.println("Corpus Christi");
                System.out.println("Festas Juninas (mês inteiro)");
                System.out.println("Início do Inverno (20 ou 21/06)");
                break;
            case 7:
                System.out.println("Férias escolares (normalmente)");
                System.out.println("09/07 — Revolução Constitucionalista (feriado em SP)");
                break;
            case 8:
                System.out.println("11/08 — Dia do Estudante");
                System.out.println("25/08 — Dia do Soldado");
                System.out.println("Dia dos Pais (2º domingo de agosto)");
                break;
            case 9:
                System.out.println("07/09 — Independência do Brasil (feriado)");
                System.out.println("Início da Primavera (22 ou 23/09)");
                break;
            case 10:
                System.out.println("04/10 — Dia de São Francisco de Assis");
                System.out.println("12/10 — Nossa Senhora Aparecida / Dia das Crianças (feriado)");
                System.out.println("15/10 — Dia do Professor");
                System.out.println("31/10 — Halloween (mais comemorado fora do Brasil)");
                break;
            case 11:
                System.out.println("02/11 — Finados (feriado)");
                System.out.println("15/11 — Proclamação da República (feriado)");
                System.out.println("20/11 — Dia da Consciência Negra (feriado em alguns estados)");
                break;
            case 12:
                System.out.println("21 ou 22/12 — Início do Verão");
                System.out.println("24/12 — Véspera de Natal");
                System.out.println("25/12 — Natal (feriado)");
                System.out.println("31/12 — Véspera de Ano Novo (Réveillon)");
                break;
            default:
                System.out.println("Digite um valor valido!");
                break;
        }
        s.close();
    }
}
