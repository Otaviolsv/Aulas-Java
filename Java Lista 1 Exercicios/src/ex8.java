//8 - Crie um programa que peça um número ao usuário e armazene ele na variável x. Depois peça outro número e armazene na variável y.
// Mostre esses números. Em seguida, faça com que x passe a ter o valor de y, e que y passe a ter o valor de x.

import  java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor de X:");
        double x = leitor.nextDouble();

        System.out.println("Informe o valor de Y:");
        double y = leitor.nextDouble();

        System.out.println("X = " + x + " | " + "Y = " + y);

        double xtemp = x;
        x = y;
        y = xtemp;


        System.out.println("X = " + x + " | " + "Y = " + y);


    }

}
