package br.com.lista_list.model;

public class Casa {
	private String endereco;
	private double area;
	private int quartos;
	private double preco;

	public Casa() {
		this.endereco = "";
		this.area = 0.0;
		this.quartos = 0;
		this.preco = 0.0;
	}

	public Casa(String endereco, double area, int quartos, double preco) {
		this.endereco = endereco;
		this.area = area;
		this.quartos = quartos;
		this.preco = preco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getArea() {
		return area;
	}

	public void setQuartos(int quartos) {
		this.quartos = quartos;
	}

	public int getQuartos() {
		return quartos;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}
}