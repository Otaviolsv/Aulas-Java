//Escreva um programa que peça um número N e use um laço while para imprimir todos os números de 1 até N.
//
//Requisitos:
//O número N deve ser inserido pelo usuário.


import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\nInforme o numero final [N]");
        int n = leitor.nextInt();

        int i = 1;


        System.out.print("\nSegue os numeros de 1 ate " + n + ":");
        System.out.println();
        while(i <= n){

            System.out.print(i + " ");
            i++;

        }
        System.out.println("\n");
    }
}
