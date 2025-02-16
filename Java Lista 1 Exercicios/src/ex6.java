//Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo que pergunte a idade de uma pessoa e diga se ela pode doar sangue ou não

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a sua idade:");

        double idade = leitor.nextDouble();

        if(idade >= 18 && idade <= 67 ){
            System.out.println("Voce pode doar sangue");
        }
        else{
            System.out.println("Voce nao pode doar sangue");
        }

    }
}
