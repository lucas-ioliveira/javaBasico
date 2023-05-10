package secao06Desafios;

import java.util.Scanner;

public class SistemaTemperatura {
    public static void main(String[] args) {
        // Desafio temperatura
        Scanner sc = new Scanner(System.in);

        double somadorTemperaturas = 0;
        double numeroTemperaturas = 0;

        while (true) {
            System.out.println("Informe a temperatura: ");
            double temp = sc.nextDouble();

            if (temp == 0) {
                break;
            }
            somadorTemperaturas += temp;
            numeroTemperaturas += 1;
        }

        double media = somadorTemperaturas / numeroTemperaturas;
        System.out.println("Média das temperaturas: " + media);


    }
}
