package br.com.atividades.view;

import br.com.atividades.model.TelefoneCelular;

import java.util.Scanner;

public class ViewTelefone {
    private TelefoneCelular telefone;

    public ViewTelefone(TelefoneCelular telefone) {
        this.telefone = telefone;
    }

    public void preencherDados(Scanner scanner) {
        System.out.print("Marca: ");
        telefone.setMarca(scanner.nextLine());
        System.out.print("Modelo: ");
        telefone.setModelo(scanner.nextLine());
        System.out.print("Preço: R$");
        telefone.setPreco(scanner.nextDouble());
        System.out.print("Memória (GB): ");
        telefone.setMemoria(scanner.nextInt());
        scanner.nextLine(); // Limpar o buffer
    }

    public void imprimirDados() {
        System.out.println("Marca: " + telefone.getMarca());
        System.out.println("Modelo: " + telefone.getModelo());
        System.out.printf("Preço: R$%.2f\n", telefone.getPreco());
        System.out.println("Memória: " + telefone.getMemoria() + "GB");
    }
}