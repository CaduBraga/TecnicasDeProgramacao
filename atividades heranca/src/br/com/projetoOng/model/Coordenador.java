package br.com.projetoOng.model;

public class Coordenador extends Pessoa {
    private String responsabilidade;

    public Coordenador(String nome, String cidade, String responsabilidade) {
        super(nome, cidade);
        this.responsabilidade = responsabilidade;
    }

    public String getResponsabilidade() {
        return responsabilidade;
    }

    public void setResponsabilidade(String responsabilidade) {
        this.responsabilidade = responsabilidade;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Responsabilidade: " + responsabilidade);
    }
}
