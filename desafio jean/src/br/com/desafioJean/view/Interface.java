package br.com.desafioJean.view;

import br.com.desafioJean.model.Dados;
import br.com.desafioJean.service.Calculo;

public class Interface {

    public static void visualizacao() {
        Dados dados = new Dados();

        int resultado = Calculo.resultado(dados.getPalmeiras(), dados.getQtdeNormal(), dados.getQtdeExcecao());

        System.out.println("Total de côcos: " + resultado);
        System.out.println("Entretanto, palmeiras não dão côcos, e sim palmitos!");
    }
}