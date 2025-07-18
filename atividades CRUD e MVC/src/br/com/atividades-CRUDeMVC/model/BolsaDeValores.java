package br.com.lista_list.model;

public class BolsaDeValores {
	private String nome;
	private double preco;
	private double volume;
	private double variacao;

	public BolsaDeValores() {
		this.nome = "";
		this.preco = 0.0;
		this.volume = 0.0;
		this.variacao = 0.0;
	}

	public BolsaDeValores(String nome, double preco, double volume, double variacao) {
		this.nome = nome;
		this.preco = preco;
		this.volume = volume;
		this.variacao = variacao;
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

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getVolume() {
		return volume;
	}

	public void setVariacao(double variacao) {
		this.variacao = variacao;
	}

	public double getVariacao() {
		return variacao;
	}
}