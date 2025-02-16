//12- Escreva um programa que receba uma letra do alfabeto e transforme ela para o case contrário.

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("\nEscreva uma letra do alfabeto:");


        char letra = leitor.next().charAt(0);

        if(Character.isUpperCase(letra)) {
            char letraLowerCase = Character.toLowerCase(letra);
            System.out.println("\nO case contrário da letra " + letra + " é " + letraLowerCase);
        }
        else if(Character.isLowerCase(letra)){
            char letraUpperCase = Character.toUpperCase(letra);
            System.out.println("\nO case contrário da letra " + letra + " é " + letraUpperCase);
        }
        else {
            System.out.println("Valor inválido");
        }
    }
}
