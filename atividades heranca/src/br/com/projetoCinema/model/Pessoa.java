package br.com.projetoCinema.model;

public class Pessoa {
    protected String nome;
    protected String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }
}
