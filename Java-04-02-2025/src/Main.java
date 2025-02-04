import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        System.out.println("Informe o seu nome: ");
//
//        String nome = entrada.nextLine();
//
//        System.out.println("\nOlá, " + nome + "!\n");
//        System.out.println("O seu nome inicia com a letra " + nome.charAt(0));
//
//        System.out.println("informe a sua nota:");
//
//        float nota = entrada.nextFloat();
//
//        if(nota >10 || nota <0){
//            System.out.println("invalido");
//        } else if(nota >= 9){
//            System.out.println("Aprovado com louvor!");
//        } else if(nota >= 5){
//            System.out.println("Aprovado!");
//        } else if(nota >= 0 ) {
//            System.out.println("Reprovado!");
//        }
//        System.out.println("Fim da execução.");



//---------------------Calculadora-----------------------------

//        System.out.println("\nBem vindo a calculadora!\n");
//        System.out.println("Informe o primeiro número:\n");
//
//        int numero1 = entrada.nextInt();
//
//        System.out.println("\nInforme o segundo número:\n");
//
//        int numero2 = entrada.nextInt();
//
//        System.out.println("Informe o operador matematico: \n");
//
//        String operador = entrada.next();
//
//        char operacao = operador.charAt(0);
//
//
//        if(operacao == '+'){
//            int resultado = numero1 + numero2;
//            System.out.println("Resultado: " + resultado );
//        }
//        else if(operacao == '-'){
//            int resultado = numero1 - numero2;
//            System.out.println("Resultado: " + resultado );
//        }
//        else if(operacao == 'x' || operacao == '*'){
//            int resultado = numero1 * numero2;
//            System.out.println("Resultado: " + resultado );
//        }
//        else if(operacao == '/'){
//            int resultado = numero1 / numero2;
//            System.out.println("Resultado: " + resultado );
//        }


//---------------------- outra forma de se fazer Calculadora-------------------

//        System.out.println("\nBem vindo a calculadora!\n");
//        System.out.println("Informe o primeiro número:\n");
//        if(operador.equals("+")){
//            int resultado = numero1 + numero2;
//            System.out.println("Resultado: " + resultado );
//        }
//        else if(operador.equals("-")){
//            int resultado = numero1 - numero2;
//            System.out.println("Resultado: " + resultado );
//        }
//        else if(operador.equals("x") || operador.equals("*")){
//            int resultado = numero1 * numero2;
//            System.out.println("Resultado: " + resultado );
//        }
//        else if(operador.equals("/")){
//            int resultado = numero1 / numero2;
//            System.out.println("Resultado: " + resultado );
//        }
//
//

//-----------------Media notas ---------------------------

        System.out.println("informe a sua nota1:");
        float nota1 = entrada.nextFloat();
        System.out.println("informe a sua nota2:");
        float nota2 = entrada.nextFloat();
        System.out.println("informe a sua nota3:\n");
        float nota3 = entrada.nextFloat();

        float notafinal = ((nota1 * 50)/100) + ((nota2 * 30)/100 ) + ((nota3 * 20) /100);

        //--------------outra opção--------------
//      float notafinal = ((nota1 * 0.5) + ((nota2 * 0.3 ) + ((nota3 * 0.2);


        System.out.println("sua nota final é: " + notafinal);

        if(notafinal > 10 || notafinal <0){
            System.out.println("Nota invalida!");
        }
        else if(notafinal >= 9){
            System.out.println("Sua nota é A");
            System.out.println("Parabens!");
        }
        else if(notafinal > 7){
            System.out.println("Sua nota é B");
        }
        else if(notafinal >= 5){
            System.out.println("Sua nota é C");
        }
        else if(notafinal < 5){
            System.out.println("Sua nota é F");
        }



        //---------------------dúvida -----------------------------

//        System.out.println("\nBem vindo a calculadora!\n");
//        System.out.println("Informe o primeiro número:\n");
//
//        int numero1 = entrada.nextInt();
//
//        System.out.println("\nInforme o segundo número:\n");
//
//        int numero2 = entrada.nextInt();
//
//        System.out.println("Informe o operador matematico: \n");
//
//        String operador = entrada.next();
//
//
//        if(operador == "+"){
//            int resultado = numero1 + numero2;
//            System.out.println("Resultado: " + resultado );
//        }


    }
}