package secao03.sistemaEscola;

import java.util.*;

public class MyClass {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // Atribuindo dados a variáveis
        System.out.println("Informações do aluno");

        Aluno aluno = new Aluno("Lucas", "Oliveira", 26);
        System.out.println(aluno.saudacao());


//        String nome = "Lucas";
//        String sobrenome = "Oliveira";
//        int idade = 26;
//        final String matricula = "123456789";
//        String nomeDaMae = "Cristina";
//        String nomeDoPai = "Não consta";
//        boolean temAutorizacao = true;

//        System.out.println(nome);
////        System.out.println(sobrenome);
////        System.out.println(idade);
////        System.out.println(matricula);
////        System.out.println(nomeDaMae);
////        System.out.println(nomeDoPai);
////        System.out.println(temAutorizacao);
////        System.out.println();

        // Array List
//        List<String> responsavelAlunos = new ArrayList<>(Arrays.asList(nomeDaMae));
//        System.out.println(Arrays.toString(responsavelAlunos.toArray()));
//
//        // Chamando a função adcionando responsável
//        responsavelAlunos = adicionaResponsavel(responsavelAlunos, "Daniel");
//        responsavelAlunos = adicionaResponsavel(responsavelAlunos, "Afonso");
//        // Editando responsável
//        responsavelAlunos = editaResponsavel(responsavelAlunos, "Jaqueline", 1);
//        // Removendo o ultimo da lista
//        responsavelAlunos = removeResponsavel(responsavelAlunos);
//        // Ordena responsável
//        responsavelAlunos = ordenaResponsavel(responsavelAlunos);
//        System.out.println(Arrays.toString(responsavelAlunos.toArray()));
//        // Chamando função exibe responsável
//        exibeResponsaveis(responsavelAlunos);

        // chamada da funçã0 referente a saudação
//        saudar(nome);

        //  Chamada das funcões referente a média.
//        entradaUsuario();


    }

    // Função para adcionar responsáveis
    public static List<String> editaResponsavel(List<String> responsavelAlunos, String nomeResponsavel, int index) {
        responsavelAlunos.set(index, nomeResponsavel);
        return responsavelAlunos;
    }

    // Função para editar responsáveis
    public static List<String> adicionaResponsavel(List<String> responsavelAlunos, String nomeResponsavel) {
        responsavelAlunos.add(nomeResponsavel);
        return responsavelAlunos;
    }

    // Função para remover responsáveis (ultimo da lista)
    public static List<String> removeResponsavel(List<String> responsavelAlunos) {
        responsavelAlunos.remove(responsavelAlunos.size() - 1);
        return responsavelAlunos;
    }

    // Função para ordenar responsáveis (ultimo da lista)
    public static List<String> ordenaResponsavel(List<String> responsavelAlunos) {
        responsavelAlunos.sort(null);
        return responsavelAlunos;
    }

    // Função exibe responsável
    public static void exibeResponsaveis(List<String> responsavelAlunos) {
        for (int i = 0; i < responsavelAlunos.size(); i++) {
            System.out.println((i + 1) + ") " + responsavelAlunos.get(i));
        }
    }

    // Função referente a saudação
    // obs: exemplo de escopo
//    public static void saudar(String nomeAluno) {
//        String saudacao = "Olá querido aluno(a) " + nomeAluno;
//        System.out.println(saudacao);
//    }

    // Funcão referente a média
    public static String informarResultado(double media) {
        return (media >= 7 ? "O aluno está aprovado na disciplina de Matemática com média " + media :
                "O aluno está reprovado na disciplina de Matemática com média " + media);
    }

    public static double calculaMedia(double somatorioNotas, double numeroNotas) {
        double media = somatorioNotas / numeroNotas;
        return media;
    }

    public static void entradaUsuario() {
        Scanner sc = new Scanner(System.in);

        double somaDasNotas = 0;
        double somadorNumeroNotas = 0;

        while (true) {
            System.out.println("Insira uma nota: ");
            double nota = sc.nextDouble();
            if (nota == 0) {
                break;
            }
            somaDasNotas += nota;
            somadorNumeroNotas += 1;
        }
        double media = calculaMedia(somaDasNotas, somadorNumeroNotas);
        System.out.println(informarResultado(media));

    }
}
