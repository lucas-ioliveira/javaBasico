package secao10poo.abstracao2;


public class MainAluno {
    public static void main(String[] args) {
        System.out.println("Informações do aluno");

        Aluno aluno = new Aluno("Lucas", "Oliveira", 26);
        System.out.println(aluno.saudacao());
    }
}
