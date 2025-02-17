//Escreva um programa que calcule o fatorial de um número inteiro N usando um laço for.
//
//Requisitos:
//O número N deve ser inserido pelo usuário.

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informa um numero para calcular o fatorial:");
        int n = leitor.nextInt();

        int fatorial = 1;

        for(int i = 1 ; i <= n ; i++){

            fatorial = fatorial * i;

            System.out.printf("O fatorial de %d %d" , n,fatorial);
        }

    }
}
