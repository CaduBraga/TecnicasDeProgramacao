package br.com.lista_list.views;

import java.util.Scanner;

import br.com.lista_list.model.Casa;

public class ViewCasa {
    private Casa casa;

    public ViewCasa(Casa casa) {
        this.casa = casa;
    }

    public void preencherDados(Scanner scanner) {
        System.out.print("Endereço: ");
        casa.setEndereco(scanner.nextLine());
        System.out.print("Área (m²): ");
        casa.setArea(scanner.nextDouble());
        System.out.print("Número de quartos: ");
        casa.setQuartos(scanner.nextInt());
        System.out.print("Preço: R$");
        casa.setPreco(scanner.nextDouble());
        scanner.nextLine();
    }

    public void imprimirDados() {
        System.out.println("Informações da Casa:");
        System.out.println("Endereço: " + casa.getEndereco());
        System.out.println("Área: " + casa.getArea() + " m²");
        System.out.println("Número de quartos: " + casa.getQuartos());
        System.out.printf("Preço: R$%.2f\n", casa.getPreco());
    }
}
