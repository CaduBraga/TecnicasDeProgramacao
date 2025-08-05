package br.com.projetoHotel.model;

public class Hospede extends Pessoa {
    private int numeroQuarto;

    public Hospede(String nome, String documento, int numeroQuarto) {
        super(nome, documento);
        this.numeroQuarto = numeroQuarto;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Número do Quarto: " + numeroQuarto);
    }
}
