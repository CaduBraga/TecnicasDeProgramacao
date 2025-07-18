package br.com.lista_list.model;

public class Livro {
	private String titulo;
	private String autor;
	private int paginas;
	private double preco;

	public Livro() {
		this.titulo = "";
		this.autor = "";
		this.paginas = 0;
		this.preco = 0.0;
	}

	public Livro(String titulo, String autor, int paginas, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.preco = preco;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}
}