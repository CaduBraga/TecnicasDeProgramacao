package br.com.projetoAcademia.model;

public class Instrutor extends Pessoa {
    private String especialidade;

    public Instrutor(String nome, int idade, String especialidade) {
        super(nome, idade);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Especialidade: " + especialidade);
    }
}
