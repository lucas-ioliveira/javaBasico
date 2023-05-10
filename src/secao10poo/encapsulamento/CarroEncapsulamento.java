package secao10poo.encapsulamento;

public class CarroEncapsulamento {
    // Atributos da classe
    public String nome;
    public int velocidadeMax;
    private int velocidadeAtual;
    public String cor;

    // Construtor
    CarroEncapsulamento(String nome, int velocidadeMax, int velocidadeAtual, String cor) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
        this.velocidadeAtual = velocidadeAtual;
        this.cor = cor;
    }

    // get (Coletar o valor)
    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    // Set (Atualizar o valor)
    public void setVelocidadeAtual(int novaVelocidadeAtual) {
        this.velocidadeAtual = novaVelocidadeAtual;
    }
}
