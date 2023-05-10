package secao04Desafios;

public class CalculoNotasEscolares {
    public static void main(String[] args) {
        System.out.println("-- Cálculo média anual --");

        double mediaPrimeiroBimestre = 7;
        double mediaSegundoBimestre = 8;
        double mediaTerceiroBimestre = 9;
        double mediaquartoBimestre = 8;
        double mediaGeral = (mediaPrimeiroBimestre + mediaSegundoBimestre + mediaTerceiroBimestre + mediaquartoBimestre) / 4;

        System.out.println("A média geral do aluno é: " + mediaGeral);

    }
}
