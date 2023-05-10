package secao06;

import java.util.Scanner;

public class SaindoDoLacoComBreak {
    public static void main(String[] args) {
        // Exemplo
        Scanner sc = new Scanner(System.in);

        int somadorNota = 0;
        int somadorNumeroNota = 0;

        while (true) {
            System.out.println("Digite uma nota: ");
            double nota = sc.nextDouble();
            if (nota == 0) {
                break;
            }
            somadorNota += nota;
            somadorNumeroNota += 1;
        }

        double media = somadorNota / somadorNumeroNota;
        System.out.println("Média: " + media);

        sc.close();
    }
}
