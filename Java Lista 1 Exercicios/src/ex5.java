//5 -  Faça um programa que pergunte em que turno você estuda.
// Peça para digitar M-matutino ou V-vespertino ou N-noturno. Imprima a mensagem “Bom dia!” ou  “Boa Noite” ou “Valor inválido”, conforme o caso.

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu turno [M-matutino ou V-vespertino ou N-noturno]:");

        char turno = leitor.next().charAt(0);

        if(turno == 'm'){
            System.out.println("Bom dia!");
        }
        else if(turno == 'v'){
            System.out.println("Boa tarde!");
        }
        else if(turno == 'n'){
            System.out.println("Boa noite!");
        }
        else {
            System.out.println("Valor inválido");
        }
    }
}
