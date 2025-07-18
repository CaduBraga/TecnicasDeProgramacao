package br.com.lista_list.model;

public class TV {
	private static String marca;
	private static double tamanho;
	private static String resolucao;
	private static double preco;

	public TV() {
		TV.marca = "";
		TV.tamanho = 0.0;
		TV.resolucao = "";
		TV.preco = 0.0;
	}

	public TV(String marca, double tamanho, String resolucao, double preco) {
		TV.marca = marca;
		TV.tamanho = tamanho;
		TV.resolucao = resolucao;
		TV.preco = preco;
	}

	public void setMarca(String marca) {
		TV.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setTamanho(double tamanho) {
		TV.tamanho = tamanho;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setResolucao(String resolucao) {
		TV.resolucao = resolucao;
	}

	public String getResolucao() {
		return resolucao;
	}

	public void setPreco(double preco) {
		TV.preco = preco;
	}

	public double getPreco() {
		return preco;
	}
}