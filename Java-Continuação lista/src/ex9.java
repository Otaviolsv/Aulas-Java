//9 - Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
//“Telefonou para a vítima? “
//“Esteve no local do crime?”
//“Mora perto da vítima? “
//“Devia para a vítima? “
//“Já trabalhou com a vítima? “
//O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
// Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”, entre 3 e 4 como “Cúmplice” e 5 como “Assassino“.
// Caso contrário, ele será classificado como “Inocente“.

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double total = 0;

        System.out.println("Telefonou para a vítima? [s/n]");
        char resposta1 = leitor.next().charAt(0);

        System.out.println("Esteve no local do crime? [s/n]");
        char resposta2 = leitor.next().charAt(0);

        System.out.println("Mora perto da vítima? [s/n]");
        char resposta3 = leitor.next().charAt(0);

        System.out.println("Devia para a vítima? [s/n]");
        char resposta4 = leitor.next().charAt(0);

        System.out.println("Já trabalhou com a vítima? [s/n]");
        char resposta5 = leitor.next().charAt(0);

        if(resposta1 == 's'){
            total = total + 1;
        }
        if(resposta2 == 's'){
            total = total + 1;
        }
        if(resposta3 == 's'){
            total = total + 1;
        }
        if(resposta4 == 's'){
            total = total + 1;
        }
        if(resposta5 == 's'){
            total = total + 1;
        }

        if(total <= 1){
            System.out.println("\nA pessoa é inocente!");
        }
        else if(total == 2){
            System.out.println("\nA pessoa é suspeita!");
        }
        else if(total == 3 | total == 4){
            System.out.println("\nA pessoa é cúmplice!");
        }
        else if(total == 5){
            System.out.println("\nA pessoa é a assasina!");
        }
    }
}
