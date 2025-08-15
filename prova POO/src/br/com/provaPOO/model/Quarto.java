package br.com.provaPOO.model;

/**
 * Representa um quarto do hotel.
 */
public class Quarto {
    private int numero;
    private String tipo; // Ex.: "Standard", "Luxo", "Suíte"
    private double preco; // preço da diária

    public Quarto() {}

    public Quarto(int numero, String tipo, double preco) {
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    @Override
    public String toString() {
        return String.format("Quarto %d | Tipo: %s | Diária: R$ %.2f", numero, tipo, preco);
    }
}
