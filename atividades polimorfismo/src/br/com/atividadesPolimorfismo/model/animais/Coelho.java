package br.com.AtividadesPolimorfismo.model.animais;

public class Coelho extends Animal {

    public Coelho(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " faz som de coelho: Squeak!");
    }

    public void pular() {
        System.out.println(nome + " está pulando.");
    }
}