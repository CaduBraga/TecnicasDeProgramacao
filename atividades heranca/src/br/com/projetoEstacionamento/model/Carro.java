package br.com.projetoEstacionamento.model;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String placa, String marca, int numeroPortas) {
        super(placa, marca);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Número de Portas: " + numeroPortas);
    }
}
