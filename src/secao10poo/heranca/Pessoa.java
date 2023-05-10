package secao10poo.heranca;

public class Pessoa {
    // Atributos da classe
    public String nome;
    public String sobrenome;
    public int idade;
    private String cpf;

    // Construtor
    Pessoa(String nome, String sobrenome, int idade, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
    }

    // método
    public String saudacao() {
        return String.format("Olá, seja bem vindo(a) aluno(a) %s %s", this.nome, this.sobrenome);
    }
}
