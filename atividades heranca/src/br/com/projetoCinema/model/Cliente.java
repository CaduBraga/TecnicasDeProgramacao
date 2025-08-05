package br.com.projetoCinema.model;

public class Cliente extends Pessoa {
    private String tipoIngresso;

    public Cliente(String nome, String email, String tipoIngresso) {
        super(nome, email);
        this.tipoIngresso = tipoIngresso;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Tipo de Ingresso: " + tipoIngresso);
    }
}
