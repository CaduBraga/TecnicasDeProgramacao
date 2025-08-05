package br.com.projetoOng.model;

public class Pessoa {
    protected String nome;
    protected String cidade;

    public Pessoa(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cidade: " + cidade);
    }
}
