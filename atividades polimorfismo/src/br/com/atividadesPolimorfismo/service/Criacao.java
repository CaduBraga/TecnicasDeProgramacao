package br.com.AtividadesPolimorfismo.service;

import br.com.AtividadesPolimorfismo.model.*;
import br.com.AtividadesPolimorfismo.model.animais.*;

public class Criacao {

    private Pessoa pessoa1 = new Pessoa("Carlos Eduardo Braga", "140.806.669-69");
    private Livro livro1 = new Livro(1, "Livro", 49.99, "1984", "George Orwell", "Secker & Warburg", 1949);
    private Produto produto1 = new Produto(2, "Camiseta", 69.90);
    private Animal animal1 = new Animal("Bicho");
    private Cachorro cachorro1 = new Cachorro("Nala");
    private Gato gato1 = new Gato("Pua");
    private Coelho coelho = new Coelho("Robson");

    public Pessoa getPessoa1() {
        return pessoa1;
    }

    public Livro getLivro1() {
        return livro1;
    }

    public Produto getProduto1() {
        return produto1;
    }

    public Animal getAnimal() {
        return animal1;
    }

    public Cachorro getCachorro() {
        return cachorro1;
    }

    public Gato getGato() {
        return gato1;
    }

    public Coelho getCoelho() {
        return coelho;
    }
}