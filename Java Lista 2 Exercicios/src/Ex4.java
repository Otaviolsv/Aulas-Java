//Escreva um programa que use um laço while para imprimir uma contagem regressiva de N até Z.
//
//Requisitos:
//N e Z devem ser digitados pelo usuário e devem ser inteiros positivos.

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\nInforme o valor inicial[N]:");
        int n = leitor.nextInt();

        System.out.println("Informe o valor final[Z]:");
        int z = leitor.nextInt();

        if(n >= z) {
            System.out.println("O valor de N precisa ser menor que Z, tente novamente!");
        }
        else{
            System.out.println("\nA contagem regressiva de " + n + " ate " + z  + ":");
            int i = n;
            while(i <= z){
                System.out.println(i);
                i++;
            }
        }


    }
}
