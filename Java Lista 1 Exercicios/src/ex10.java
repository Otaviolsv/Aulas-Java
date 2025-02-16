//10- Um posto está vendendo combustíveis com a seguinte tabela de descontos:
// Álcool: Até 20 litros: desconto de 3% por litro. Acima de 20 litros: Desconto de 5% por litro 99.
//Gasolina: Até 20 litros: desconto de 4% por litro, Acima de 20 litros, desconto de 6% por litro
//Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool. G-gasolina),
//Calcule e imprima o valor a ser pago pelo cliente. Considere o Preço da Gasolina como 5 reais o litro, e o do Alcool como 4 reais o litro.

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\nInforme o tipo de combustivel [A-álcool. G-gasolina]:");
        char tipo = leitor.next().charAt(0);

        System.out.println("Informe a quantidade de litros");
        double litros = leitor.nextDouble();


        if(tipo == 'A' | tipo == 'a' ){
            double precoA = litros * 4;
            System.out.println("\nO cliente escolheu Alcool");

            if(litros <= 20){
            double precoF = precoA - (precoA * 0.03);
            System.out.println("O valor a ser pago pelo cliente é R$" + precoF);
        }
            else if(litros > 20){
            double precoF = precoA - (precoA * 0.05);
            System.out.println("O valor a ser pago pelo cliente é R$" + precoF);
        }

        }
        if(tipo == 'G' | tipo == 'g'){
            double precoG = litros * 5;
            System.out.println("\nO cliente escolheu Gasolina");

            if(litros <=20){
                double precoF = precoG - (precoG * 0.04);
                System.out.println("O valor a ser pago pelo cliente é R$" + precoF);
            }
            else if(litros >20){
                double precoF = precoG - (precoG * 0.06);
                System.out.println("O valor a ser pago pelo cliente é R$" + precoF);
            }
        }


    }
}
