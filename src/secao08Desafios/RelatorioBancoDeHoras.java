package secao08Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RelatorioBancoDeHoras {
    public static void main(String[] args) {
        // Criação do array
        List<Integer> bancoDeHoras = new ArrayList<>(Arrays.asList(4, 9, 7, 8, 9, 2, 6, 7, 5, 4, 10, 11, 7, 8, 9, 6, 5, 3, 8, 9));

        // Chamada das funções
        int somaHoras = somatorioHoras(bancoDeHoras);
        informaRelatório(somaHoras);
    }

    // Função para calcular horas
    public static int somatorioHoras(List<Integer> bancoDeHoras) {
        int somaHoras = 0;
        for (int i = 0; i < bancoDeHoras.size(); i++) {
            somaHoras += bancoDeHoras.get(i);
        }
        return somaHoras;
    }

    // Informação relatório.
    public static void informaRelatório(int somahoras) {
        if (somahoras > 160) {
            System.out.println("Deve receber o valor de " + (somahoras - 160) + " horas extras");
        } else if (somahoras == 160) {
            System.out.println("Deve receber o salário normal.");
        } else {
            System.out.println("Deve repor " + (160 - somahoras) + " horas.");
        }
    }
}
