package secao05Desafios;

public class ProvaDeAtletismo {
    public static void main(String[] args) {
        int atleta1 = 60;
        int atleta2 = 70;
        int atleta3 = 80;

        if (atleta1 < atleta2 && atleta1 < atleta3) {
            System.out.println("Vencedor atleta 1");
        } else if (atleta2 < atleta1 && atleta2 < atleta3) {
            System.out.println("Vencedor atleta 2");
        } else {
            System.out.println("Vencedor atleta 3");
        }
    }
}
