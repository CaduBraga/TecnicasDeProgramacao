package br.com.desafioJean.service;

public class Calculo {
    public static int resultado(int totalPalmeiras, int qtdeNormal, int qtdeExcecao) {
        return (totalPalmeiras - 1) * qtdeNormal + qtdeExcecao;
    }
}