package br.com.lista_list.views;

import java.util.Scanner;

import br.com.lista_list.model.Livro;

public class ViewLivro {
    private Livro livro;

    public ViewLivro(Livro livro) {
        this.livro = livro;
    }

    public void preencherDados(Scanner scanner) {
        System.out.print("Título: ");
        livro.setTitulo(scanner.nextLine());
        System.out.print("Autor: ");
        livro.setAutor(scanner.nextLine());
        System.out.print("Número de páginas: ");
        livro.setPaginas(scanner.nextInt());
        System.out.print("Preço: R$");
        livro.setPreco(scanner.nextDouble());
        scanner.nextLine();
    }

    public void imprimirDados() {
        System.out.println("Informações do Livro:");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Número de páginas: " + livro.getPaginas());
        System.out.printf("Preço: R$%.2f\n", livro.getPreco());
    }
}
