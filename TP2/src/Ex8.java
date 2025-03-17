//Escreva um programa que solicite ao usuário os comprimentos de três lados de um triângulo
//e determine se ele é equilátero, isósceles ou escaleno.
//Verifique também se as medidas formam um triângulo válido(cada lado deve ser menor que a soma dos outros dois.).

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("\n=========Verificador de Triângulos=========");
        System.out.println("\nInforme o primeiro lado: ");
        double lado1 = leitor.nextDouble();
        System.out.println("\nInforme o segundo lado: ");
        double lado2 = leitor.nextDouble();
        System.out.println("\nInforme o terceiro lado: ");
        double lado3 = leitor.nextDouble();


        if(lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2){
            if(lado1 == lado2 && lado1 == lado3){
                System.out.println("\nO triângulo é equilátero");
            }
            else if(lado1 == lado2 || lado1 == lado3){
                System.out.println("\nO triângulo é isósceles");
            }
            else{
                System.out.println("\nO triângulo é escaleno");
            }
        }
        else{
            System.out.println("\nAs medidas informadas não formam um triângulo válido!");
        }
        leitor.close();
    }
}

