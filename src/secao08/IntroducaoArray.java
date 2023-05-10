package secao08;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IntroducaoArray {
    public static void main(String[] args) {
        // Exemplo 1 (Sem passar valores)
        int[] arrayInteiros = new int[4];
        System.out.println(Arrays.toString(arrayInteiros));
        System.out.println("----------------------------------");

        // Exemplo 2 (Com valores)
        int[] arrayInteiros2 = {12, 32, 54, 5};
        // Acessando todos os elementos
        System.out.println(Arrays.toString(arrayInteiros2));

        // Acessando elementos individualmente.
        System.out.println(arrayInteiros2[1]);

        System.out.println("----------------------------------");

        // Exemplo 3 (Adcionando elementos)

        String[] animais = new String[3];
        animais[0] = "Cachorro";
        animais[1] = "Gato";
        animais[2] = "Cavalo";
        System.out.println(Arrays.toString(animais));

    }
}
