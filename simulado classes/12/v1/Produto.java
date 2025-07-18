import java.util.Scanner;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Produto() {
		this.nome = "";
		this.preco = 0.0;
		this.quantidade = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void preencherDados() {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o nome do produto: ");
		setNome(input.nextLine());

		System.out.print("Digite o preço do produto: R$");
		setPreco(input.nextDouble());

		System.out.print("Digite a quantidade disponível no estoque: ");
		setQuantidade(input.nextInt());
		input.nextLine();
	}

	public void atualizarNome(String novoNome) {
		setNome(novoNome);
	}

	public void atualizarPreco(double novoPreco) {
		setPreco(novoPreco);
	}

	public void atualizarQuantidade(int novaQuantidade) {
		setQuantidade(novaQuantidade);
	}

	public void exibirProduto(String formato) {
		System.out.println("Nome " + formato + getNome());
		System.out.println("Preço" + formato + "R$" + String.format("%.2f", getPreco()));
		System.out.println("Qtde " + formato + getQuantidade());
	}
}