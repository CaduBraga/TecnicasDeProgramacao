package br.com.atividades.main;

import java.util.Scanner;

import br.com.atividades.model.Listas;
import br.com.atividades.service.*;
import br.com.atividades.view.Escolhas;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("=== Seja bem vindo ao programa de listas ===");

		boolean continuar = true;
		while (continuar) {

			Escolhas.escolherAcao();
			int opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
				case 1:
					Inserir.inserirItem(scanner,
							Listas.telefoneCelular,
							Listas.televisao,
							Listas.casa,
							Listas.aluno,
							Listas.livro,
							Listas.animal,
							Listas.bicicleta,
							Listas.filme,
							Listas.musica,
							Listas.jogo,
							Listas.bolsa);
					break;

				case 2:
					Acessar.acessarLista(scanner,
							Listas.telefoneCelular,
							Listas.televisao,
							Listas.casa,
							Listas.aluno,
							Listas.livro,
							Listas.animal,
							Listas.bicicleta,
							Listas.filme,
							Listas.musica,
							Listas.jogo,
							Listas.bolsa);
					break;

				case 3:
					Remover.removerItem(scanner,
							Listas.telefoneCelular,
							Listas.televisao,
							Listas.casa,
							Listas.aluno,
							Listas.livro,
							Listas.animal,
							Listas.bicicleta,
							Listas.filme,
							Listas.musica,
							Listas.jogo,
							Listas.bolsa);
					break;

				case 4:
					Encerrar.encerrarPrograma(continuar);
					break;

				default:
					System.out.println("ERRO! Digite um número válido.");
			}
		}
		scanner.close();
	}
}