package secao07;

public class EscopoDeMetodos {
    public static void main(String[] args) {
        // Exemplo de escopo (onde a variável pode ser acessada ou não)
        /*
        A variável dentro do metodo main não pode ser acessada na função, por esse motivo passamos um
        parametro na função para que no metodo main consigamos acessar.
         */

        String nome = "Lucas";
        saudar(nome);
    }

    public static void saudar(String nome) {
        String saudacao = "Olá, seja bem vindo " + nome;
        System.out.println(saudacao);
    }
}
