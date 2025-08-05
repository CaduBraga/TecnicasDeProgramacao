import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeProduto;
        double preco = 0;
        boolean precoInvalido = true;

        System.out.print("Digite o nome do produto: ");
        nomeProduto = input.nextLine();

        while (precoInvalido) {
            System.out.print("Digite o preço do produto: ");
            String texto = input.nextLine();

            try {
                preco = Double.parseDouble(texto);
                precoInvalido = false;
            } catch (NumberFormatException e) {
                System.out.println("Preço inválido. Use apenas números. Ex: 9.99");
            }
        }

        System.out.println("Produto cadastrado:");
        System.out.println("Nome: " + nomeProduto);
        System.out.println("Preço: R$ " + preco);

        input.close();
    }
}