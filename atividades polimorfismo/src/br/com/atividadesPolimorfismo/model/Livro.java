package br.com.AtividadesPolimorfismo.model;

public class Livro extends Produto {
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;

    public Livro(int codigo, String descricao, double preco, String titulo, String autor, String editora, int anoPublicacao) {
        super(codigo, descricao, preco);
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }


    @Override
    public String toString() {
        return "Título: " + getTitulo() + "\nAutor: " + getAutor() + "\nEditora: " + getEditora();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}