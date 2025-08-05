package br.com.projetoLoja.model;

public class Cliente extends Pessoa {
    private String preferenciaPagamento;

    public Cliente(String nome, String telefone, String preferenciaPagamento) {
        super(nome, telefone);
        this.preferenciaPagamento = preferenciaPagamento;
    }

    public String getPreferenciaPagamento() {
        return preferenciaPagamento;
    }

    public void setPreferenciaPagamento(String preferenciaPagamento) {
        this.preferenciaPagamento = preferenciaPagamento;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Preferência de Pagamento: " + preferenciaPagamento);
    }
}
