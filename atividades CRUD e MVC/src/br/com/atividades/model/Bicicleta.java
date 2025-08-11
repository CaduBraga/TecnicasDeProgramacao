package br.com.atividades.model;

public class Bicicleta {
	private String marca;
	private String modelo;
	private double tamanho;
	private double preco;

	public Bicicleta() {
		this.marca = "";
		this.modelo = "";
		this.tamanho = 0.0;
		this.preco = 0.0;
	}

	public Bicicleta(String marca, String modelo, double tamanho, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.preco = preco;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}
}