import java.util.Scanner;

public class Aluno {

	private String nome;
	private int idade;
	private double nota;

	public Aluno(String nome, int idade, double nota) {
		this.nome = nome;
		this.idade = idade;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public void preencherDados(Scanner scanner) {
		System.out.print("Digite o nome do aluno: ");
		setNome(scanner.nextLine());

		System.out.print("Digite a idade do aluno: ");
		setIdade(scanner.nextInt());

		System.out.print("Digite a nota do aluno: ");
		setNota(scanner.nextDouble());

		scanner.nextLine();
	}

	public void atualizarNota(double novaNota) {
		this.nota = novaNota;
	}

	public void exibirDetalhes(String separador) {
		System.out.println("Nome" + separador + getNome());
		System.out.println("Idade" + separador + getIdade());
		System.out.println("Nota" + separador + getNota());
	}
}
