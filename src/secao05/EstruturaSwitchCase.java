package secao05;

public class EstruturaSwitchCase {
    public static void main(String[] args) {
        // Exemplo

        String cargo = "Professor de ensino médio";

        switch (cargo) {
            case "Professor de ensino infatil 1":
                System.out.println("R$ 4.000");
                break;
            case "Professor de ensino infatil 2":
                System.out.println("R$ 5.000");
                break;
            case "Professor de ensino fundamental 1":
                System.out.println("R$ 6.000");
                break;
            case "Professor de ensino fundamental 2":
                System.out.println("R$ 5.000");
                break;
            case "Professor de ensino médio":
                System.out.println("R$ 8.000");
                break;
            default:
                break;
        }
    }
}
