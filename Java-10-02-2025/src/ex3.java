// Escreva um programa que receba o raio de uma circunferência e mostre o diâmetro, o comprimento e a área desta.

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o raio de uma circunferencia:");
        double raio = entrada.nextFloat();
        System.out.println("O raio informado foi o " + raio + "Cm");


        double diametro = raio * 2;
        double comprimento = 2 * 3.14 * raio;
        double area = (raio * raio) * 3.14;

        System.out.println("Diâmetro:" + (int)diametro + " | " + "Comprimento: " + (float)comprimento + " | " + "Área: " + area);






    }
}
