package secao04Desafios;

public class PostoDeGasolina {
    public static void main(String[] args) {
        System.out.println("-- Sistema Posto de gasolina --");
        System.out.println();

        System.out.println("1 - cliente");

        double valorDoLitro = 5;
        double quantidadeDeLitros = 5;
        double valorTotal = valorDoLitro * quantidadeDeLitros;

        System.out.println("O valor do litro: R$" + valorDoLitro);
        System.out.println("A quantidade abastecida foi: " + quantidadeDeLitros + " Litros");
        System.out.println("O valor total a ser pago: R$" + valorTotal);
        System.out.println();

        System.out.println("2 - cliente");

        valorDoLitro = 5;
        quantidadeDeLitros = 10;
        valorTotal = valorDoLitro * quantidadeDeLitros;

        System.out.println("O valor do litro: R$" + valorDoLitro);
        System.out.println("A quantidade abastecida foi: " + quantidadeDeLitros + " Litros");
        System.out.println("O valor total a ser pago: R$" + valorTotal);
        System.out.println();

        System.out.println("3 - cliente");

        valorDoLitro = 5;
        quantidadeDeLitros = 25;
        valorTotal = valorDoLitro * quantidadeDeLitros;

        System.out.println("O valor do litro: R$" + valorDoLitro);
        System.out.println("A quantidade abastecida foi: " + quantidadeDeLitros + " Litros");
        System.out.println("O valor total a ser pago: R$" + valorTotal);


    }
}
