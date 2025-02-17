//Escreva um programa que use um laço for para imprimir todos os números pares de N a Z.
//
//Requisitos:
//N e Z devem ser digitados pelo usuário e devem ser inteiros positivos.

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escreva o valor de N:");
        int n = leitor.nextInt();

        System.out.println("escreva o valor de Z:");
        int z = leitor.nextInt();

        if(n >= z){
            System.out.println("\nO valor de N precisa ser menor que Z, tente novamente!");
        }
        else{
            System.out.println("\nOs numeros pares entre " + n + " e " + z + " sao:");
            for(int i = n; i <= z; i++ ){

                if(i % 2 == 0){
                    System.out.print(i + " ");
                }
            }
            System.out.println("\n");
        }
    }
}
