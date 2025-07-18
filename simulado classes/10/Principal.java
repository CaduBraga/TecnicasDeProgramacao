import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Produto produto1 = new Produto();
		System.out.println("Insira as informações do produto 1:");
		produto1.preencherDados(scanner);

		Produto produto2 = new Produto();
		System.out.println("\nInsira as informações do produto 2:");
		produto2.preencherDados(scanner);

		Produto produto3 = new Produto("Motor monofásico", 400.50, 7);

		// Produto padrão (default):
		Produto produto4 = new Produto();

		System.out.println("\nInformações dos produtos:");
		System.out.println("\nProduto 1:");
		produto1.imprimirDados();
		System.out.println("\nProduto 2:");
		produto2.imprimirDados();
		System.out.println("\nProduto 3:");
		produto3.imprimirDados();
		System.out.println("\nProduto 4:");
		produto4.imprimirDados();
		System.out.println();

		produto1.atualizarEstoque();

		scanner.close();
	}
}