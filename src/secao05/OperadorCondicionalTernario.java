package secao05;

public class OperadorCondicionalTernario {
    public static void main(String[] args) {
        // Exemplo
        int idade = 19;
        boolean permissaoParaDirigir = idade >= 18 ? true : false;
        System.out.println(permissaoParaDirigir);

        // Exemplo 2
        boolean emailValido = true;
        boolean senhaValida = true;

        String credenciaisValidas = emailValido ? (senhaValida ? "Credenciais Válidas." : "Senha inválida") : "E-mail inválido.";
        System.out.println(credenciaisValidas);

    }
}
