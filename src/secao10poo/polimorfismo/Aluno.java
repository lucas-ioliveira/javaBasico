package secao10poo.polimorfismo;

public class Aluno extends Pessoa implements IPessoa {
    public String serie;
    public String turma;

    Aluno(String nome, String sobrenome, int idade, String cpf, String serie, String turma ) {
        super(nome, sobrenome, idade, cpf);
        this.serie = serie;
        this.turma = turma;
    }

    // método
    public String saudacao() {
        return String.format("Olá, seja bem vindo(a) aluno(a) %s %s matriculado na série %s turma %s", this.nome, this.sobrenome, this.serie, this.turma);
    }
}
