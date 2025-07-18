import java.util.Scanner;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;

	public Produto() {
		this.nome = "";
		this.preco = 0.0;
		this.quantidade = 0;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void preencherDados(Scanner scanner) {
		System.out.print("Nome: ");
		this.nome = scanner.nextLine();

		System.out.print("Preço: R$");
		this.preco = scanner.nextDouble();

		while (this.preco < 0) {
			System.out.println("O preço não pode ser negativo. Tente novamente.");
			System.out.print("Preço: R$");
			this.preco = scanner.nextDouble();
		}

		System.out.print("Quantidade disponível em estoque: ");
		this.quantidade = scanner.nextInt();

		while (this.quantidade < 0) {
			System.out.println("A quantidade não pode ser negativa. Tente novamente.");
			System.out.print("Quantidade disponível em estoque: ");
			this.quantidade = scanner.nextInt();
		}

		scanner.nextLine();
	}

	public void atualizarNome(String novoNome) {
		this.nome = novoNome;
	}

	public void atualizarPreco(double novoPreco) {
		this.preco = novoPreco;
	}

	public void atualizarQuantidade(int novaQuantidade) {
		this.quantidade = novaQuantidade;
	}

	public void exibirProduto(String formato) {
		System.out.println("Nome " + formato + getNome());
		System.out.println("Preço" + formato + "R$" + String.format("%.2f", getPreco()));
		System.out.println("Qtde " + formato + getQuantidade());
	}
}