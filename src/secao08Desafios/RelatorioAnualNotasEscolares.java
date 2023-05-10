package secao08Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RelatorioAnualNotasEscolares {
    public static void main(String[] args) {
        // Percorrendo Array de notas e informando a nota e se foi aprovado.
        List<Double> notasEscolares = new ArrayList<>(Arrays.asList(8.8, 6.7, 5.8, 9.6, 10.0));

        // Função exibe notas
        exibeNotas(notasEscolares);


        // Função exibe resultados
        exibeResultado(notasEscolares);

    }

    // Função para Exibir notas.
    public static void exibeNotas(List<Double> listaNotas) {
        for (int i = 0; i < listaNotas.size(); i++) {
            if (listaNotas.get(i) < 7) {

                System.out.println("Nota: " + listaNotas.get(i) + " Reprovado");

            } else {
                System.out.println("Nota: " + listaNotas.get(i) + " Aprovado");

            }
        }
    }

    // Função para exibir resultados.
    public static void exibeResultado(List<Double> listaNotasResult) {
        int numAprovados = 0;
        int numReprovados = 0;
        for (int i = 0; i < listaNotasResult.size(); i++) {
            if (listaNotasResult.get(i) < 7) {
                numReprovados += 1;
            } else {
                numAprovados += 1;
            }
        }
        System.out.println("Aprovados: " + numAprovados);
        System.out.println("Reprovados: " + numReprovados);
    }
}

