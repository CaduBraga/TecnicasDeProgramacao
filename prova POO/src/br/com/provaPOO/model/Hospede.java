package br.com.provaPOO.model;

/**
 * Hóspede herda de Pessoa (Desafio de herança).
 */
public class Hospede extends Pessoa {

    // Ex.: poderia ter um campo de fidelidade, aqui mantemos simples
    public Hospede() { super(); }

    public Hospede(String nome, String documento, String telefone) {
        super(nome, documento, telefone);
    }

    @Override
    public String toString() {
        return "Hóspede\n" + super.toString();
    }
}
