package br.com.atividades.view;

import br.com.atividades.model.JogoVideogame;

import java.util.Scanner;

public class ViewJogo {
    private JogoVideogame jogo;

    public ViewJogo(JogoVideogame jogo) {
        this.jogo = jogo;
    }

    public void preencherDados(Scanner scanner) {
        System.out.print("Título: ");
        jogo.setTitulo(scanner.nextLine());
        System.out.print("Plataforma: ");
        jogo.setPlataforma(scanner.nextLine());
        System.out.print("Classificação etária (anos): ");
        jogo.setClassificacao(scanner.nextLine());
        System.out.print("Preço: R$");
        jogo.setPreco(scanner.nextDouble());
        scanner.nextLine();
    }

    public void imprimirDados() {
        System.out.println("Informações do Jogo:");
        System.out.println("Título: " + jogo.getTitulo());
        System.out.println("Plataforma: " + jogo.getPlataforma());
        System.out.println("Classificação Etária: " + jogo.getClassificacao() + " anos");
        System.out.printf("Preço: R$%.2f\n", jogo.getPreco());
    }
}
