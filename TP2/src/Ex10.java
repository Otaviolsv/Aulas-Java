//Desenvolva um jogo de adivinhação em que o usuário deve descobrir um número gerado aleatoriamente pelo programa (entre 1 e 100).
//O programa deve informar se o palpite é maior ou menor que o número sorteado até que o usuário acerte

import java.util.Random;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int aleatorio = (int)(Math.random() * 11);

        System.out.println("\n====Bem vindo ao jogo de adivinhação====");
        System.out.println("Número gerado, tente adivinhar:");
        

        for(;;){
            System.out.println("\nAdivinhe o número gerado:");
            int tentativa = leitor.nextInt();
            if(tentativa == aleatorio){
                System.out.println("\nParabéns, você acertou!!!");
                break;
            }
            else{
                System.out.println("\nVocê errou :(");
                if(tentativa < aleatorio){
                    System.out.println("Tente um número maior");
                }
                if(tentativa > aleatorio){
                    System.out.println("Tente um número menor");
                }
            }
        }
    }
}
