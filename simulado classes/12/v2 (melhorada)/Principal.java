import java.util.Scanner;

public class Principal {

	/*
	 * Comecei com o objetivo de fazer o código rodar até que o usuário desejasse
	 * parar, comecei tentando usar o while, mas tive alguns problemas, e para
	 * aplicar todos os métodos de forma eficiente decidi usar o switch e o array.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("==== BEM VINDO AO CADASTRO DE PRODUTOS ====");

		int tamanhoArray = 0;

		while (tamanhoArray <= 0) {
			System.out.print("Digite o número de produtos que você deseja cadastrar: ");
			tamanhoArray = input.nextInt();
			input.nextLine();

			if (tamanhoArray <= 0) {
				System.out.println("O número de produtos deve ser maior que zero. Tente novamente.");
			}
		}

		Produto[] produtos = new Produto[tamanhoArray];
		int contadorProdutos = 0;

		for (int i = 0; i < tamanhoArray; i++) {
			System.out.println("\nInsira os dados do " + (i + 1) + "º produto:");
			Produto produto = new Produto();
			produto.preencherDados(input);
			produtos[i] = produto;
			contadorProdutos++;

			System.out.println("Produto inserido com sucesso!");

			while (true) {
				System.out.println("\nEscolha uma das opções abaixo:");
				System.out.println("1. Atualizar nome");
				System.out.println("2. Atualizar preço");
				System.out.println("3. Atualizar estoque");
				System.out.println("4. Prosseguir");
				System.out.print("Digite a sua escolha: ");
				int opcao = input.nextInt();
				input.nextLine();

				switch (opcao) {
				case 1:
					System.out.print("Digite o novo nome: ");
					String novoNome = input.nextLine();
					produto.atualizarNome(novoNome);
					System.out.println("Nome atualizado com sucesso!");
					break;

				case 2:
					System.out.print("Digite o novo preço: R$");
					double novoPreco = input.nextDouble();
					produto.atualizarPreco(novoPreco);
					System.out.println("Preço atualizado com sucesso!");
					break;

				case 3:
					System.out.print("Digite a nova quantidade em estoque: ");
					int novaQuantidade = input.nextInt();
					produto.atualizarQuantidade(novaQuantidade);
					System.out.println("Estoque atualizado com sucesso!");
					break;

				case 4:
					break;

				default:
					System.out.println("Opção inválida! Por favor, digite um número entre 1 e 4.");
				}

				if (opcao == 4) {
					break;
				}
			}
		}

		System.out.println("\nProdutos cadastrados:\n");
		for (int a = 0; a < contadorProdutos; a++) {
			System.out.printf("Produto %d:", (a + 1));
			System.out.println();
			produtos[a].exibirProduto(": ");
			System.out.println();
		}

		System.out.print("==== PROGRAMA FINALIZADO! ====");

		input.close();
	}
}