package br.com.atividades.view;

import br.com.atividades.model.Casa;

import java.util.Scanner;

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
