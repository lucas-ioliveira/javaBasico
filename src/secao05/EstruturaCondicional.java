package secao05;

public class EstruturaCondicional {
    public static void main(String[] args) {
        // Exemplo
        int idade = 15;
        boolean temAutorizacao = true;

        if (idade > 16 & temAutorizacao) {
            System.out.println("O aluno pode sair.");
        } else {
            System.out.println("O aluno não pode sair.");
        }
    }
}
