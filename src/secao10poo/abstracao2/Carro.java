package secao10poo.abstracao2;

public class Carro {

    // Atributos da classe
    String nome;
    int velocidadeMax;
    int velocidadeAtual;
    String cor;

    // construtor
    Carro(String nome, int velocidadeMax, int velocidadeAtual, String cor) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
        this.velocidadeAtual = velocidadeAtual;
        this.cor = cor;
    }

    // função(método)
    public void acelerar() {
        this.velocidadeAtual += 10;
    }
}
