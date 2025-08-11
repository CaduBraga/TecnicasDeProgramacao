package br.com.atividades.view;

import br.com.atividades.model.Bicicleta;

import java.util.Scanner;

public class ViewBicicleta {
    private Bicicleta bicicleta;

    public ViewBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public void preencherDados(Scanner scanner) {
        System.out.print("Marca: ");
        bicicleta.setMarca(scanner.nextLine());
        System.out.print("Modelo: ");
        bicicleta.setModelo(scanner.nextLine());
        System.out.print("Tamanho do quadro: ");
        bicicleta.setTamanho(scanner.nextDouble());
        System.out.print("Preço: ");
        bicicleta.setPreco(scanner.nextDouble());
        scanner.nextLine();
    }

    public void imprimirDados() {
        System.out.println("Informações da Bicicleta:");
        System.out.println("Marca: " + bicicleta.getMarca());
        System.out.println("Modelo: " + bicicleta.getModelo());
        System.out.println("Tamanho do quadro: " + bicicleta.getTamanho());
        System.out.printf("Preço: R$%.2f\n", bicicleta.getPreco());
    }
}