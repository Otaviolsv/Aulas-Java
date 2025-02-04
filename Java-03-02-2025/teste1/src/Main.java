import java.util.Scanner;

//System.out.println("\n\"teste\"");
// || = ou
// && = e (logico)

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

//        System.out.println("informe a sua idade:");
//        int idade = entrada.nextInt();
//
//        System.out.print("Informe o número para testar se ele é maior que 10 e menor que 12:\n");
//        int numeroteste1 = entrada.nextInt();
//
//        System.out.print("Informe o número para testar se ele é maior que 10 ou igual a 5:\n");
//        int numeroteste2 = entrada.nextInt();
//
//
//        System.out.printf("\nnome:%s  sobrenome:%s\n", "Otávio", "Vasconcelos");
//        System.out.println("idade: " + idade);
//
//        if (idade >= 18) {
//            System.out.println("(usuario é maior de idade)\n");
//        } else {
//            System.out.println("usuario é menor de idade\n");
//        }
//
//        System.out.println("Número escolhido1: " + numeroteste1);
//
//        if (numeroteste1 > 10 && numeroteste1 < 12) {
//            System.out.println("o número escolhido é maior que 10 e menor que 12");
//
//        } else {
//            System.out.println("o número escolhido não é maior que 10 e menor que 12");
//
//        }
//
//        System.out.println("Número escolhido2: " + numeroteste2);
//
//        if (numeroteste2 > 10 || numeroteste2 == 5) {
//            System.out.println("O número escolhido é maior que 10 ou igual a 5");
//        } else {
//            System.out.println("O número escolhido não é maior que 10 ou igual a 5");
//        }
//    }
//}
                System.out.println("informe a sua nota");
                float nota = entrada.nextFloat();
                if(nota >10 || nota <0){
                    System.out.println("invalido");
                } else if(nota >= 9){
                    System.out.println("Aprovado com louvor!");
                } else if(nota >= 5){
                    System.out.println("Aprovado!");
                } else {
                    System.out.println("Reprovado!");
                }
                System.out.println("Fim da execução.");
            }
        }
