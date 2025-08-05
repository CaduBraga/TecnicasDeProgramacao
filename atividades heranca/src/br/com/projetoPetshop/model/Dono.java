package br.com.projetoPetshop.model;

public class Dono extends Pessoa {
    private String nomePet;

    public Dono(String nome, String telefone, String nomePet) {
        super(nome, telefone);
        this.nomePet = nomePet;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Nome do Pet: " + nomePet);
    }
}
