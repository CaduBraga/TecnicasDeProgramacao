package br.com.projetoEstacionamento.model;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String placa, String marca, int cilindrada) {
        super(placa, marca);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}
