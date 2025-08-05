package br.com.projetoCinema.model;

public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, String email, String cargo) {
        super(nome, email);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cargo: " + cargo);
    }
}
