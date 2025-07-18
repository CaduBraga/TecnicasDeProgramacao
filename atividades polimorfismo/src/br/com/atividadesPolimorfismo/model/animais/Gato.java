package br.com.AtividadesPolimorfismo.model.animais;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " mia: Miau!");
    }

    public void arranharMoveis() {
        System.out.println(nome + " está arranhando os móveis.");
    }
}
