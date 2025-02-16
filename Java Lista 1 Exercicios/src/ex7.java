//7 - Escreva um programa que pergunte o dia, mês e ano do aniversário de uma pessoa e diga se a data é válida ou não.
// Caso não seja, diga o motivo. Suponha que todos os meses tem 31 dias e que estejamos no ano de 2013.

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\ndigite o dia do seu aniversario");
        double dia = leitor.nextDouble();

        System.out.println("\ndigite o mes do seu aniversario");
        double mes = leitor.nextDouble();

        System.out.println("\ndigite o ano do seu aniversario");
        double ano = leitor.nextDouble();

        if(dia > 31 | dia < 1 | mes < 1 | mes > 12 | ano != 2013){
            System.out.println("Data invalida");
        }
        else{
            System.out.println("data valida");
        }
    }
}
