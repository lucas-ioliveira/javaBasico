package secao10poo.abstracao2;

public class Aluno {
    String nome;
    String sobrenome;
    int idade;

    Aluno(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

//    public void saudacao(String nomeAluno, String sobrenomeAluno) {
//        String saudar = "Olá, seja bem vindo aluno(a) " + nomeAluno + " " + sobrenomeAluno;
//        System.out.println(saudar);
//    }

    // Solução melhorada.
    public String saudacao() {
        return String.format("Olá, seja bem vindo(a) aluno(a) %s %s", this.nome, this.sobrenome);
    }
}
