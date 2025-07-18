package br.com.lista_list.views;

import java.util.Scanner;

import br.com.lista_list.model.TV;

public class ViewTV {
    private TV tv;

    public ViewTV(TV tv) {
        this.tv = tv;
    }

    public void preencherDados(Scanner scanner) {
        System.out.print("Marca: ");
        tv.setMarca(scanner.nextLine());
        System.out.print("Tamanho (polegadas): ");
        tv.setTamanho(scanner.nextDouble());
        scanner.nextLine(); // Limpa o buffer após nextDouble
        System.out.print("Resolução (pixels): ");
        tv.setResolucao(scanner.nextLine());
        System.out.print("Preço: R$");
        tv.setPreco(scanner.nextDouble());
        scanner.nextLine(); // Limpa o buffer após nextDouble
    }

    public void imprimirDados() {
        System.out.println("Informações da TV:");
        System.out.println("Marca: " + tv.getMarca());
        System.out.println("Tamanho: " + tv.getTamanho() + " polegadas");
        System.out.println("Resolução: " + tv.getResolucao() + " pixels");
        System.out.printf("Preço: R$%.2f\n", tv.getPreco());
    }
}
