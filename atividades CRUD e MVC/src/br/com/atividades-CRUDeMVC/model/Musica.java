package br.com.lista_list.model;

public class Musica {
	private String titulo;
	private String artista;
	private double duracao;
	private double preco;

	public Musica() {
		this.titulo = "";
		this.artista = "";
		this.duracao = 0.0;
		this.preco = 0.0;
	}

	public Musica(String titulo, String artista, double duracao, double preco) {
		this.titulo = titulo;
		this.artista = artista;
		this.duracao = duracao;
		this.preco = preco;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getArtista() {
		return artista;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void tocarMusica() {
		System.out.println("Tocando música: " + titulo + " - " + artista);
	}

	public void desligarMusica() {
		System.out.println("Música desligada.");
	}
}