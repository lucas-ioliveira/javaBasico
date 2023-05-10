package secao06;

import java.util.Scanner;

public class EstruturaDeRepeticaoWhile {
    public static void main(String[] args) {
        // Exemplo 1
        int cont = 0;
        while (cont <= 10) {
            System.out.println(cont);
            cont++;
        }

        // Exemplo 2
        Scanner sc = new Scanner(System.in);
        int somaValor = 0;
        while (somaValor < 100) {
            System.out.println("Informe um valor: ");
            int valor = sc.nextInt();
            somaValor += valor;
            System.out.println(somaValor);
        }

        sc.close();

    }
}
