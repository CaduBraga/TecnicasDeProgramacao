package br.com.provaPOO.model;

public class Hospede extends Pessoa {

    public Hospede() {
        super();
    }

    public Hospede(String nome, String documento, String telefone) {
        super(nome, documento, telefone);
    }

    @Override
    public String toString() {
        return "Hóspede\n" + super.toString();
    }
}
