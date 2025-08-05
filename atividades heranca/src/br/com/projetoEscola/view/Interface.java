package br.com.projetoEscola.view;

import java.util.Scanner;

public class Interface {

    public static void mensagemInicial() {
        System.out.println("=== Bem vindo ao sistema de cadastro da escola ===");
    }

    public static int escolha() {
        Scanner input = new Scanner(System.in);
        System.out.println("O que você deseja fazer?\n");
        System.out.println("1 - cadastrar professor");
        System.out.println("2 - Cadastrar aluno");
        System.out.println("3 - Encerrar programa");
        System.out.print("  Digite sua escolha: ");
        int escolha = input.nextInt();
        input.nextLine();
        if (escolha < 1 || escolha > 3) {
            System.out.println("\nOpção inválida, escolha um número de 1 a 3.");
            return escolha();
        }
        System.out.println();
        return escolha;
    }

    public static void mensagemFinal() {
        System.out.println("Encerrando o sistema...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sistema encerrado com sucesso!");
        System.exit(0);
    }
}