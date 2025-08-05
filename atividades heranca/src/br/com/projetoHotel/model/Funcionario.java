package br.com.projetoHotel.model;

public class Funcionario extends Pessoa {
    private String funcao;

    public Funcionario(String nome, String documento, String funcao) {
        super(nome, documento);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Função: " + funcao);
    }
}
