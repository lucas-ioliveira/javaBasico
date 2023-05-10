package secao10poo.encapsulamento;


import secao10poo.abstracao2.Aluno;

public class MainAlunoEncapsulamento {
    public static void main(String[] args) {
        System.out.println("Informações do aluno");

        AlunoEncapsulamento aluno = new AlunoEncapsulamento("Lucas", "Oliveira", 26, "111.222.333.44");
        System.out.println(aluno.saudacao());
        System.out.println(aluno.getCpf());
        aluno.setCpf("555.666.777.88");
        System.out.println(aluno.getCpf());
    }
}
