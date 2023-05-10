package secao08;

import java.util.ArrayList;
import java.util.Arrays;

public class PercorrendoArrayList {
    public static void main(String[] args) {
        // Exemplo

        ArrayList<String> animais = new ArrayList<>(Arrays.asList("Cachorro", "Gato"));

        for (int i = 0; i < animais.size(); i++) {
            System.out.println(animais.get(i));
        }
    }
}
