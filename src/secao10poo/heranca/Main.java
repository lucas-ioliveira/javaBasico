package secao10poo.heranca;

public class Main {
    public static void main(String[] args) {
        // Instanciando o aluno
        Aluno aluno = new Aluno("Lucas", "Oliveira", 26, "111.222.333.44", "3", "A");
        // Instanciando o professor
        Professor professor = new Professor("Kerollyn", "Lima", 24, "555.666.777.88", "Inglês", 40);

        System.out.println(aluno.saudacao());
        System.out.println(aluno.serie);
        System.out.println(aluno.turma);
        System.out.println();
        System.out.println(professor.saudacao());
        System.out.println(professor.disciplina);
        System.out.println(professor.horas);
    }
}
