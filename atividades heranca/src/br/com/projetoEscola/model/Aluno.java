package br.com.projetoEscola.model;

public class Aluno extends Pessoa {
    private int serie;

    public Aluno(String nome, String email, String cpf, int serie) {
        super(nome, email, cpf);
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Série: " + serie);
    }
}