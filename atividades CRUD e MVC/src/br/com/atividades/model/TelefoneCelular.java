package br.com.atividades.model;

public class TelefoneCelular {
	private String marca;
	private String modelo;
	private double preco;
	private int memoria;

	public TelefoneCelular() {
		this.marca = "";
		this.modelo = "";
		this.preco = 0.0;
		this.memoria = 0;
	}

	public TelefoneCelular(String marca, String modelo, double preco, int memoria) {
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
		this.memoria = memoria;
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

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public int getMemoria() {
		return memoria;
	}
}