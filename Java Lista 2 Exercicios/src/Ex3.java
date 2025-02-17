//Escreva um programa que peça um número inteiro e use um laço for para imprimir a tabuada desse número de 1 a 10.
//
//Requisitos:
//O número deve ser inserido pelo usuário.

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("\nInforme informe um numero inteiro para saber a tabuada");
        int n = leitor.nextInt();

        System.out.println("\nTabuada de " + n + ":");

        for (int i = 1; i <= 10; i++){

            int tabuada = n * i;

            System.out.println(n + " x " + i + " = " + tabuada);


        }

    }
}
