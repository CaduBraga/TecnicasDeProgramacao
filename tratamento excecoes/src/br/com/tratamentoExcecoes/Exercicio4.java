import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = -1;
        boolean continuar = true;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("0 - Sair");

            try {
                System.out.print("Escolha: ");
                opcao = Integer.parseInt(input.nextLine());

                switch (opcao) {
                    case 1:
                        System.out.println("Cadastrando...");
                        break;
                    case 2:
                        System.out.println("Listando...");
                        break;
                    case 0:
                        System.out.println("Encerrando...");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }

        } while (continuar);
        input.close();
    }
}