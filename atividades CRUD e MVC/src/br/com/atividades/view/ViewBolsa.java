package br.com.atividades.view;

import br.com.atividades.model.BolsaDeValores;

import java.util.Scanner;

public class ViewBolsa {
    private BolsaDeValores bolsa;

    public ViewBolsa(BolsaDeValores bolsa) {
        this.bolsa = bolsa;
    }

    public void preencherDados(Scanner scanner) {
        System.out.print("Nome da Empresa: ");
        bolsa.setNome(scanner.nextLine());
        System.out.print("Preço da ação: R$");
        bolsa.setPreco(scanner.nextDouble());
        System.out.print("Volume de Negociações: ");
        bolsa.setVolume(scanner.nextDouble());
        System.out.print("Variação Diária (%): ");
        bolsa.setVariacao(scanner.nextDouble());
        scanner.nextLine(); // Limpar o buffer
    }

    public void imprimirDados() {
        System.out.println("Informações da Bolsa de Valores:");
        System.out.println("Nome da Empresa: " + bolsa.getNome());
        System.out.printf("Preço da ação: R$%.2f\n", bolsa.getPreco());
        System.out.println("Volume de Negociações: " + bolsa.getVolume());
        System.out.println("Variação Diária: " + bolsa.getVariacao() + "%");
    }
}