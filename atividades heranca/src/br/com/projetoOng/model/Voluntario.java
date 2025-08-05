package br.com.projetoOng.model;

public class Voluntario extends Pessoa {
    private String areaAtuacao;

    public Voluntario(String nome, String cidade, String areaAtuacao) {
        super(nome, cidade);
        this.areaAtuacao = areaAtuacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Área de Atuação: " + areaAtuacao);
    }
}
