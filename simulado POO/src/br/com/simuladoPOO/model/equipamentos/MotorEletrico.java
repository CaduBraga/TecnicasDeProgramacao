package br.com.simuladoPOO.model.equipamentos;

import br.com.simuladoPOO.model.Equipamento;

public class MotorEletrico extends Equipamento {
    private double potencia;

    public MotorEletrico() {
        super();
    }

    public MotorEletrico(String codigo, String nome, int quantidade, double preco, double potencia) {
        super(codigo, nome, quantidade, preco);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        if (potencia < 0) {
            throw new IllegalArgumentException("A potência não pode ser negativa.");
        }
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motor Elétrico | " + super.toString() + String.format(" | Potência: %.2f", potencia);
    }
}