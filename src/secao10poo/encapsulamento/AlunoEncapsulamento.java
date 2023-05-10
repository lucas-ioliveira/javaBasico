package secao10poo.encapsulamento;

public class AlunoEncapsulamento {
    public String nome;
    public String sobrenome;
    public int idade;
    private String cpf;

    AlunoEncapsulamento(String nome, String sobrenome, int idade, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
    }

//    public void saudacao(String nomeAluno, String sobrenomeAluno) {
//        String saudar = "Olá, seja bem vindo aluno(a) " + nomeAluno + " " + sobrenomeAluno;
//        System.out.println(saudar);
//    }

    // get
    public String getCpf() {
        return this.cpf;
    }

    // set
    public void setCpf(String novoCpf) {
        this.cpf = novoCpf;
    }

    // Solução melhorada.
    public String saudacao() {
        return String.format("Olá, seja bem vindo(a) aluno(a) %s %s", this.nome, this.sobrenome);
    }



}
