//Escreva um programa que receba um inteiro do teclado e imprima se ele é par ou ímpar.

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in)
                ;
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();



        if(numero % 2 != 0){
            System.out.println("O número " + numero + " é impar");
        }
        else {
            System.out.println("O número " + numero + " é par");
        }



    }
}