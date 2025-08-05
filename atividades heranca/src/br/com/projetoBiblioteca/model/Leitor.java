package br.com.projetoBiblioteca.model;

public class Leitor extends Pessoa {
    private String matricula;

    public Leitor(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Matrícula: " + matricula);
    }
}
