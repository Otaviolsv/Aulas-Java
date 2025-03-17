//Crie um programa que solicite ao usuário que cadastre uma senha e,
//em seguida, peça a senha novamente até que seja digitada corretamente
//Utilize um laço de repetição para solicitar a senha até que esteja correta.

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\nInforme uma senha:");
        String senha = leitor.next();
        System.out.println("\nSenha criada!!!");

        for(;;){
            System.out.println("informe a sua senha novamente:");
            String validador = leitor.next();
            if(senha.equalsIgnoreCase(validador)){
                System.out.println("\nSenha correta!!!");
                break;
            }
            else{
                System.out.println("\nSenha incorreta!");
            }
        }
        leitor.close();
    }
}

