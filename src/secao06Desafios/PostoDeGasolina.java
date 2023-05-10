package secao06Desafios;

import java.util.Scanner;

public class PostoDeGasolina {
    // Desafio
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do litro: ");
        double valorLitro = sc.nextDouble();
        double valorTotal = 0;

        for (int i = 1; i <= 50; i++) {
            valorTotal = valorLitro * i;
            System.out.println("Número de litros: " + i + " valor do litro: " + valorLitro + " valor total: " + valorTotal);

        }


        sc.close();
    }
}
