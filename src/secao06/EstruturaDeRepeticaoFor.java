package secao06;

public class EstruturaDeRepeticaoFor {
    public static void main(String[] args) {
        // conta de 1 à 10 (Incremento).
        int cont = 10;
        for (int i = 1; i <= cont; i++) {
            System.out.println(i);
        }

        System.out.println();

        // (decremento)
        cont = 0;
        for (int i = 10; i >= cont; i--) {
            System.out.println(i);
        }
    }
}
