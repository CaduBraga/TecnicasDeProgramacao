package br.com.AtividadesPolimorfismo.view;

import br.com.AtividadesPolimorfismo.service.Criacao;

public class View {

    private Criacao criacao;

    public View(Criacao criacao) {
        this.criacao = criacao;
    }

    public void mostrarDados() {
        System.out.println("Pessoa:");
        System.out.println(criacao.getPessoa1());

        System.out.println("\nLivro:");
        System.out.println(criacao.getLivro1());

        System.out.println("\nProduto:");
        System.out.println(criacao.getProduto1());

        System.out.println("\nAnimal:");
        criacao.getAnimal().fazerSom();

        System.out.println("\nCachorro:");
        criacao.getCachorro().fazerSom();
        criacao.getCachorro().abanarRabo();

        System.out.println("\nGato:");
        criacao.getGato().fazerSom();
        criacao.getGato().arranharMoveis();

        System.out.println("\nCoelho:");
        criacao.getCoelho().fazerSom();
        criacao.getCoelho().pular();
    }
}