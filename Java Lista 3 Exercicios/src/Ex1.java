import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("esreva uma letra: ");
        String letra = leitor.nextLine();

        System.out.println("Escreva uma frase: ");
        String frase = leitor.nextLine();


        int contador = 0;

        for(int i = 0; i < frase.length(); i++){

            if(frase.charAt(i) == letra.toLowerCase().charAt(0) || frase.charAt(i) == letra.toUpperCase().charAt(0)){
                contador++;
            }
        }
        System.out.println("\nA letra '" + letra + "' aparece " + contador + " vezes");
    }
}