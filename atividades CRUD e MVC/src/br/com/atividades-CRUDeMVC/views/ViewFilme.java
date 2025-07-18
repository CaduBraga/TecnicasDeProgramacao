package br.com.lista_list.views;

import java.util.Scanner;

import br.com.lista_list.model.Filme;

public class ViewFilme {
    private Filme filme;

    public ViewFilme(Filme filme) {
        this.filme = filme;
    }

    public void preencherDados(Scanner scanner) {
        System.out.print("Título: ");
        filme.setTitulo(scanner.nextLine());
        System.out.print("Diretor: ");
        filme.setDiretor(scanner.nextLine());
        System.out.print("Duração (minutos): ");
        filme.setDuracao(scanner.nextInt());
        System.out.print("Preço: R$");
        filme.setPreco(scanner.nextDouble());
        scanner.nextLine();
    }

    public void imprimirDados() {
        System.out.println("Informações do Filme:");
        System.out.println("Título: " + filme.getTitulo());
        System.out.println("Diretor: " + filme.getDiretor());
        System.out.println("Duração: " + filme.getDuracao() + " minutos");
        System.out.printf("Preço: R$%.2f\n", filme.getPreco());
    }
}
