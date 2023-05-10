package secao06;

public class ContinuandoNoLacoComContinue {
    public static void main(String[] args) {
        // Exemplo iterando números ímpares.
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
