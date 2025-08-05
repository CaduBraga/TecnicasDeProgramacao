package br.com.projetoAcademia.model;

public class Aluno extends Pessoa {
    private String objetivo;

    public Aluno(String nome, int idade, String objetivo) {
        super(nome, idade);
        this.objetivo = objetivo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Objetivo: " + objetivo);
    }
}
