import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[] numeros = {5, 7, 2, 54, 4, 25, 65, 102};

        Arrays.sort(numeros);

        System.out.println("\nNumeros ordenados do menor para o maior:");
        for(int i = 0; i < numeros.length; i++){

            System.out.print(numeros[i] + " ");
        }
        System.out.println("\n");

        System.out.println("O maior numero do array é " + numeros[numeros.length - 1]);
        System.out.println("O menor numero do array é " + numeros[0]);
    }
}
