package br.com.AtividadesPolimorfismo;

import br.com.AtividadesPolimorfismo.service.Criacao;
import br.com.AtividadesPolimorfismo.view.View;

public class Main {

    public static void main(String[] args) {
        Criacao criacao = new Criacao();
        View view = new View(criacao);

        view.mostrarDados();
    }
}