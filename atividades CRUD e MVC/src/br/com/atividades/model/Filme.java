package br.com.atividades.model;

public class Filme {
	private String titulo;
	private String diretor;
	private int duracao;
	private double preco;

	public Filme() {
		this.titulo = "";
		this.diretor = "";
		this.duracao = 0;
		this.preco = 0.0;
	}

	public Filme(String titulo, String diretor, int duracao, double preco) {
		this.titulo = titulo;
		this.diretor = diretor;
		this.duracao = duracao;
		this.preco = preco;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}
}