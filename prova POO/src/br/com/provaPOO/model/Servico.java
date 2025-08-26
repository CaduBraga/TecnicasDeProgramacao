package br.com.provaPOO.model;

public class Servico {
    private String nome;
    private double preco;

    public Servico() {}

    public Servico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("Serviço: %s | Preço: R$ %.2f", nome, preco);
    }
}
