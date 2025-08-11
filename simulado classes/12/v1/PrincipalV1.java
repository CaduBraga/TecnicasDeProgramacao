public class PrincipalV1 {
	public static void main(String[] args) {

		ProdutoV1 produtoV11 = new ProdutoV1();
		produtoV11.preencherDados();

		System.out.println();

		ProdutoV1 produtoV12 = new ProdutoV1();
		produtoV12.preencherDados();

		ProdutoV1 produtoV13 = new ProdutoV1("Notebook Dell", 2499.90, 8);
		ProdutoV1 produtoV14 = new ProdutoV1("Mouse gamer bluetooth", 150.99, 18);

		produtoV13.atualizarNome("Notebook Gamer");

		produtoV14.atualizarPreco(149.90);
		produtoV14.atualizarQuantidade(10);

		System.out.println("\nInformações dos produtos:");

		System.out.println("\nProduto 1:");
		produtoV11.exibirProduto(" -> ");

		System.out.println("\nProduto 2:");
		produtoV12.exibirProduto(" = ");

		System.out.println("\nProduto 3:");
		produtoV13.exibirProduto(": ");

		System.out.println("\nProduto 4:");
		produtoV14.exibirProduto(" + ");
	}
}