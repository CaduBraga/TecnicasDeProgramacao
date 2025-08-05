package br.com.projetoLoja.model;

public class Vendedor extends Pessoa {
    private double metaMensal;

    public Vendedor(String nome, String telefone, double metaMensal) {
        super(nome, telefone);
        this.metaMensal = metaMensal;
    }

    public double getMetaMensal() {
        return metaMensal;
    }

    public void setMetaMensal(double metaMensal) {
        this.metaMensal = metaMensal;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Meta Mensal: R$ " + String.format("%.2f", metaMensal));
    }
}
