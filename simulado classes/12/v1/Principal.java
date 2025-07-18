public class Principal {
	public static void main(String[] args) {

		Produto produto1 = new Produto();
		produto1.preencherDados();

		System.out.println();

		Produto produto2 = new Produto();
		produto2.preencherDados();

		Produto produto3 = new Produto("Notebook Dell", 2499.90, 8);
		Produto produto4 = new Produto("Mouse gamer bluetooth", 150.99, 18);

		produto3.atualizarNome("Notebook Gamer");

		produto4.atualizarPreco(149.90);
		produto4.atualizarQuantidade(10);

		System.out.println("\nInformações dos produtos:");

		System.out.println("\nProduto 1:");
		produto1.exibirProduto(" -> ");

		System.out.println("\nProduto 2:");
		produto2.exibirProduto(" = ");

		System.out.println("\nProduto 3:");
		produto3.exibirProduto(": ");

		System.out.println("\nProduto 4:");
		produto4.exibirProduto(" + ");
	}
}