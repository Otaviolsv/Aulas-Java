//Escreva um programa que receba uma nota de um aluno e diga se ele foi aprovado, reprovado ou ficou de recuperação, sendo:
//Nota 7 ou mais : Passou direto
//	Entre 5 e 6.9: Recuperação
//	Menor que 5: Reprovado


import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua nota: ");
        float nota = entrada.nextFloat();

        if(nota > 10 || nota < 0){
            System.out.println("Nota invalida! Tente novamente");
        }
        else if(nota >= 7){
            System.out.println("Parabéns você passou direto");
        }
        else if(nota >= 5){
            System.out.println("Você está de recuperação");
        }
        else if(nota < 5){
            System.out.println("Voce está reprovado");
        }
    }
}
