package secao08;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntroducaoArrayList {
    public static void main(String[] args) {
        // Criando o array com itens
        List<String> nomesPessoas = new ArrayList<>(Arrays.asList("Lucas", "Isaias", "Oliveira"));

        // Exibindo o array
        System.out.println(Arrays.toString(nomesPessoas.toArray()));

        // Add elemento ao final da lista.
        ArrayList<String> animais = new ArrayList<>(Arrays.asList("Cachorro", "Gato"));
        System.out.println(Arrays.toString(animais.toArray()));
        animais.add("cavalo");
        System.out.println(Arrays.toString(animais.toArray()));

        // Add elemento e escolhendo o índice.
        animais.add(1, "Tigre");
        System.out.println(Arrays.toString(animais.toArray()));

        // Acessando um elemento
        String elemento0 = animais.get(0);
        System.out.println("Índice 0: " + elemento0);

        // Editando um elemento. (informa o índice e o elemento)
        animais.set(2, "Tartaruga");
        System.out.println(Arrays.toString(animais.toArray()));

        // Removendo um, elemento do array.
        // removendo pelo indice
        animais.remove(0);
        System.out.println(Arrays.toString(animais.toArray()));
        // Removendo pelo tamanho do array
        animais.remove(animais.size() - 1);
        System.out.println(Arrays.toString(animais.toArray()));

        // Tamanho do array
        int tamanho = animais.size();
        System.out.println("Tamanho da lista: " + tamanho);

        // Coletando o índece onde o elemento está posicionado.
        int index = animais.indexOf("Tigre");
        System.out.println("O tigre está localizado no índice: " + index);

        // Ordenando o array
        List<String> animais1 = new ArrayList<>(Arrays.asList("Gato", "Elefante", "macaco"));
//        animais1.sort();
        System.out.println(Arrays.toString(animais.toArray()));
    }
}
