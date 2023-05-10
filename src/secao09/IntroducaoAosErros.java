package secao09;

public class IntroducaoAosErros {
    public static void main(String[] args) {
        // Exemplos
        try {
            informacaoResultado("Lucas", 8.7);
        } catch (NullPointerException e) {
            System.out.println("Ocorreu um NullPointerException ao executar o método informado " + e.getMessage());
        } finally { // finally sempre será exibido.
            System.out.println("Fim da instrução try/catch/finally");
        }
    }

    public static void informacaoResultado(String nomeAluno, Double mediaFinal) {
        if (mediaFinal >= 7) {
            System.out.println("O aluno " + nomeAluno + " foi aprovado");
        } else {
            System.out.println("O aluno " + nomeAluno + " foi reprovado");
        }
    }
}
