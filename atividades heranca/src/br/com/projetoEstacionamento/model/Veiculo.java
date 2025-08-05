package br.com.projetoEstacionamento.model;

public class Veiculo {
    protected String placa;
    protected String marca;

    public Veiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void mostrarDados() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
    }
}
