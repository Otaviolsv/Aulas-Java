//Escreva um programa que use um laço for para somar os números de N a Z e exibir o resultado.
//
//Requisitos:
//N e Z devem ser digitados pelo usuário e devem ser inteiros positivos.

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("\nInforme o numero inicial[n]:");
        int n = leitor.nextInt();

        System.out.println("informe o numero final[Z]:");
        int z = leitor.nextInt();

        int soma = 0;


        if(n >= z){
            System.out.println("\nO valor de N precisa ser menor que Z, tente novamente!");
        }
        else{
            System.out.println("\nOs numeros entre " + n + " e " + z + " sao:");
        for(int i = n; i <= z; i++){

            System.out.print(i + " ");

            soma = soma + i;

            if(i == z){

                System.out.println("\n\nO total da soma dos numeros e igual a: ");
                System.out.println(soma);

            }
        }
    }
        }
}
