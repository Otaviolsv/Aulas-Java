package Teste;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Teste {



    public static void main(String[] args) {


        Usuario usuario1 = new Usuario("Otávio");
        Usuario usuario2 = new Usuario("Anderson");

        System.out.println("=========================");
        System.out.println("Trazendo os usuarios com lista.of");
        List<String> nomes = List.of(usuario1.nome, usuario2.nome);
        nomes.forEach(nome -> System.out.println("Nome: " + nome));

        
        System.out.println("=========================");
        System.out.println("Trazendo os usuarios com lista");
        List<String> lista = new ArrayList<>();
        lista.add(usuario1.nome);
        lista.add(usuario2.nome);
        lista.forEach(nome -> System.out.println("Nome: " + nome));


        Consumer<Usuario> imprimeNome = usuario -> System.out.println("Nome: " + usuario.nome);
        System.out.println("=========================");
        System.out.println("Trazendo os usuarios com Consumer");
        imprimeNome.accept(usuario1);
        imprimeNome.accept(usuario2);






    }
}
