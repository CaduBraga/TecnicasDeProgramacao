package br.com.projetoEscola.model;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String email, String cpf, String disciplina) {
        super(nome, email, cpf);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Disciplina: " + disciplina);
    }
}