package secao05Desafios;

public class SistemaEcommerce {
    public static void main(String[] args) {
        // Cadastro de clientes

        String nome = "Lucas";
        String sobrenome = "Oliveira";
        String email = "lucas@email.com";
        String senha = "123";
        String confirmacaoSenha = "123";

        if (senha == confirmacaoSenha) {
            System.out.println("Cadstro realizado com sucesso.");
        } else {
            System.out.println("Erro no cadastro, as senhas não conferem.");
        }
        System.out.println("Dados do usuário.");
        System.out.println("Nome: " + nome + " sobrenome: " + sobrenome + " email: " + email);

    }
}
