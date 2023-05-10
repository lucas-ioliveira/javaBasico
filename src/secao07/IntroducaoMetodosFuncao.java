package secao07;

public class IntroducaoMetodosFuncao {
    public static void main(String[] args) {
        // Exemplo declaração de função.
        System.out.println(calcularMedia(10, 9, 8));
        System.out.println(calcularMedia(7, 6, 5));

    }
    // Criando a função
    public static int calcularMedia(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }
}
