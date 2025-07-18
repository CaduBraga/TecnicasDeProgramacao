package br.com.lista_list.views;

import java.util.Scanner;

import br.com.lista_list.model.Musica;

public class ViewMusica {
    private Musica musica;

    public ViewMusica(Musica musica) {
        this.musica = musica;
    }

    public void preencherDados(Scanner scanner) {
        System.out.print("Título: ");
        musica.setTitulo(scanner.nextLine());
        System.out.print("Artista: ");
        musica.setArtista(scanner.nextLine());
        System.out.print("Duração (minutos): ");
        musica.setDuracao(scanner.nextDouble());
        System.out.print("Preço: R$");
        musica.setPreco(scanner.nextDouble());
        scanner.nextLine();
    }

    public void imprimirDados() {
        System.out.println("Informações da Música:");
        System.out.println("Título: " + musica.getTitulo());
        System.out.println("Artista: " + musica.getArtista());
        System.out.printf("Duração: %.2f minutos\n", musica.getDuracao());
        System.out.printf("Preço: R$%.2f\n", musica.getPreco());
    }
}
