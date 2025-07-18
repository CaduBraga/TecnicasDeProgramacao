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

	// Produto com valores padrão (default):
	public Produto() {
		this.nome = "Motor trifásico";
		this.preco = 250.00;
		this.quantidade = 10;
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
		setNome(scanner.nextLine());
		System.out.print("Preço: R$");
		setPreco(scanner.nextDouble());
		scanner.nextLine();
		System.out.print("Quantidade disponível em estoque: ");
		setQuantidade(scanner.nextInt());
		scanner.nextLine();
	}

	public void imprimirDados() {
		System.out.println("Nome : " + getNome());
		System.out.println("Preço: R$" + String.format("%.2f", getPreco()));
		System.out.println("Qtde : " + getQuantidade());
	}

	public void atualizarEstoque() {
		System.out.println("Estoque de produtos da WEG atualizado com sucesso!");
	}
}