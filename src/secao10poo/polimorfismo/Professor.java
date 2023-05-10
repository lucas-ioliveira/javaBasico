package secao10poo.polimorfismo;

public class Professor extends Pessoa implements IPessoa {
    public String disciplina;
    public int horas;

    Professor(String nome, String sobrenome, int idade, String cpf, String disciplina, int horas) {
        super(nome, sobrenome, idade, cpf); // Atributos que herdam de pessoa.
        this.disciplina = disciplina;
        this.horas = horas;
    }

    // método
    public String saudacao() {
        return String.format("Olá, seja bem vindo(a) professor(a) %s %s da disciplina de %s", this.nome, this.sobrenome, this.disciplina);
    }
}