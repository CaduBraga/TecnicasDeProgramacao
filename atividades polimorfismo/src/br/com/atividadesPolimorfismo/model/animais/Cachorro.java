package br.com.AtividadesPolimorfismo.model.animais;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " late: Au Au!");
    }

    public void abanarRabo() {
        System.out.println(nome + " está abanando o rabo.");
    }
}