package secao10poo.encapsulamento;

public class MainCarroEncapsulamento {
    public static void main(String[] args) {
        // Instacia da classe
        CarroEncapsulamento ferrari = new CarroEncapsulamento("Ferrari", 320, 250, "Vermelha");

        // Alterando a velocidade atual.
        ferrari.setVelocidadeAtual(280);

        // Coletando o valor da nova velocidade atual
        System.out.println(ferrari.getVelocidadeAtual());
    }
}
