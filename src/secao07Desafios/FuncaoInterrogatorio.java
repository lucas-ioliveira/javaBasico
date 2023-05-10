package secao07Desafios;

import java.util.Scanner;

public class FuncaoInterrogatorio {
    public static void main(String[] args) {
        // chamada da função
        int numSim = interrogatorio();
        classicaInterrogado(numSim);

    }

    // Função para classicar o interrogado
    public static void classicaInterrogado(int numSim) {
        if (numSim == 0 || numSim == 1) {
            System.out.println("Inocente.");
        } else if (numSim == 2) {
            System.out.println("Suspeito.");
        } else if (numSim == 3) {
            System.out.println("Cumplice.");
        } else if (numSim == 5) {
            System.out.println("Assasíno.");
        }
    }

    // Função para perguntas
    public static int interrogatorio() {
        Scanner scanner = new Scanner(System.in);

        // cont
        int numSim = 0;

        // Perguntas
        System.out.println("Telefonou para a vítima? (0-Não 1-Sim) ");
        int pergunta1 = scanner.nextInt();
        if (pergunta1 == 1) {
            numSim += 1;
        }

        System.out.println("Esteve no local do crime? (0-Não 1-Sim) ");
        int pergunta2 = scanner.nextInt();
        if (pergunta2 == 1) {
            numSim += 1;
        }

        System.out.println("Mora perto da vítima? (0-Não 1-Sim) ");
        int pergunta3 = scanner.nextInt();
        if (pergunta3 == 1) {
            numSim += 1;
        }

        System.out.println("Devia para a vítima? (0-Não 1-Sim) ");
        int pergunta4 = scanner.nextInt();
        if (pergunta4 == 1) {
            numSim += 1;
        }

        System.out.println("Já trabalhou com a vítima? (0-Não 1-Sim) ");
        int pergunta5 = scanner.nextInt();
        if (pergunta5 == 1) {
            numSim += 1;
        }

        return numSim;
    }
}
