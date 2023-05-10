package secao10poo.abstracao2;

public class MainCarro {
    public static void main(String[] args) {

        // creindo uma variável e instanciando a classe

        Carro ferrari = new Carro("Ferrari", 320, 260, "Vermelha");
        Carro mclaren = new Carro("Mclaren", 340, 280, "Preto");

        // Apresentando no console uma informoção
        System.out.println(ferrari.nome);
        System.out.println(mclaren.nome);

        // Chamada da função(método).
        ferrari.acelerar();
        System.out.println(ferrari.velocidadeAtual);
    }
}
