package br.com.appBiblioteca.view;

import br.com.appBiblioteca.model.Livro;
import br.com.appBiblioteca.service.*;
import java.util.List;
import java.util.Scanner;

public class Interface {
    Scanner input;

    public Interface() {
        input = new Scanner(System.in);
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public static void mensagemInicial() {
        System.out.println("=== BEM-VINDO AO SISTEMA DE GESTÃO DA BIBLIOTECA ===");
        System.out.println();
    }

    public Livro cadastrar() {
        try {
            String nome = ValidacaoService.validarString(input, "Digite o nome do livro: ");
            String autor = ValidacaoService.validarString(input, "Digite o autor do livro: ");
            String genero = ValidacaoService.validarString(input, "Digite o gênero do livro: ");
            String editora = ValidacaoService.validarString(input, "Digite a editora do livro: ");
            int paginas = ValidacaoService.validarPaginas(input, "Digite a quantidade de páginas: ");
            int quantidade = ValidacaoService.validarInteiro(input, "Digite a quantidade em estoque: ");
            double preco = ValidacaoService.validarPreco(input, "Digite o preço do livro: ");
            
            if (quantidade < 0) {
                System.out.println("Quantidade não pode ser negativa!");
                return null;
            }
            
            Livro.adicionarLivros(quantidade);
            Livro livro = new Livro(nome, autor, genero, editora, paginas, quantidade, preco);
            System.out.println("Livro '" + nome + "' cadastrado com sucesso!");
            System.out.println("Total de livros na biblioteca: " + Livro.getTotalLivros());
            return livro;
        } catch (EntradaInvalidaException e) {
            System.out.println("Erro na entrada: " + e.getMessage());
            return null;
        }
    }

    public void detalhar(List<Livro> estoqueLivro) {
        if (estoqueLivro.isEmpty()) {
            System.out.println("O estoque de livros está vazio.");
            return;
        } else {
            System.out.println("Livros disponíveis:");
            for (int i = 0; i < estoqueLivro.size(); i++) {
                System.out.println((i + 1) + " - " + estoqueLivro.get(i).getNome() + " (Quantidade: "
                        + estoqueLivro.get(i).getQuantidade() + ")");
            }

            System.out.println("Digite o número do livro para ver os detalhes:");
            System.out.print("> ");
            int escolhaLivro = input.nextInt();
            input.nextLine();

            if (escolhaLivro > 0 && escolhaLivro <= estoqueLivro.size()) {
                Livro livroEscolhido = estoqueLivro.get(escolhaLivro - 1);
                System.out.println("--------------------------");
                System.out.println("Detalhes do livro escolhido:");
                System.out.println("Nome: " + livroEscolhido.getNome());
                System.out.println("Autor: " + livroEscolhido.getAutor());
                System.out.println("Gênero: " + livroEscolhido.getGenero());
                System.out.println("Editora: " + livroEscolhido.getEditora());
                System.out.println("Quantidade de páginas: " + livroEscolhido.getPaginas());
                System.out.println("Quantidade em estoque: " + livroEscolhido.getQuantidade());
                System.out.println("Total de livros na biblioteca: " + livroEscolhido.getTotalLivros());
            } else {
                System.out.println("Opção inválida. Escolha um número entre 1 e " + estoqueLivro.size() + ".");
            }
        }
    }

    public void remover(List<Livro> estoqueLivro) {
        if (estoqueLivro.isEmpty()) {
            System.out.println("O estoque de livros está vazio.");
            return;
        }
        System.out.println("Livros disponíveis:");
        for (int i = 0; i < estoqueLivro.size(); i++) {
            System.out.println((i + 1) + " - " + estoqueLivro.get(i).getNome() + " (Quantidade: "
                    + estoqueLivro.get(i).getQuantidade() + ")");
        }
        System.out.println("Digite o número do livro que deseja remover: ");
        System.out.print("> ");
        int escolha = input.nextInt();
        input.nextLine();
        System.out.println("--------------------------");

        if (escolha > 0 && escolha <= estoqueLivro.size()) {
            Livro selecionado = estoqueLivro.get(escolha - 1);
            System.out.println("Estão disponíveis " + selecionado.getQuantidade() + " unidades do livro '"
                    + selecionado.getNome() + "'. Quantas você deseja remover?");
            System.out.print("> ");
            int quantidadeRemovida = input.nextInt();
            input.nextLine();

            if (quantidadeRemovida > 0 && quantidadeRemovida <= selecionado.getQuantidade()) {
                selecionado.setQuantidade(selecionado.getQuantidade() - quantidadeRemovida);
                Livro.removerLivros(quantidadeRemovida);

                System.out.println("Foram removidas " + quantidadeRemovida + " unidades do livro '"
                        + selecionado.getNome() + "'.");
                System.out.println("Quantidade restante deste livro: " + selecionado.getQuantidade());
                System.out.println("Total de livros na biblioteca: " + Livro.getTotalLivros());

                if (selecionado.getQuantidade() == 0) {
                    estoqueLivro.remove(escolha - 1);
                    System.out.println("Todos os exemplares deste livro foram removidos. Livro retirado do estoque.");
                }
            } else {
                System.out.println("Quantidade inválida para remoção.");
            }
        } else {
            System.out.println("Opção inválida. Escolha um número entre 1 e " + estoqueLivro.size() + ".");
        }
    }

    public void editar(List<Livro> estoqueLivro) {
        if (estoqueLivro.isEmpty()) {
            System.out.println("O estoque de livros está vazio.");
            return;
        }
        System.out.println("Livros disponíveis:");
        for (int i = 0; i < estoqueLivro.size(); i++) {
            System.out.println((i + 1) + " - " + estoqueLivro.get(i).getNome());
        }

        System.out.println("Digite o número do livro que deseja editar: ");
        System.out.print("> ");
        int escolha = input.nextInt();
        input.nextLine();
        System.out.println("--------------------------");
        if (escolha > 0 && escolha <= estoqueLivro.size()) {
            Livro livro = estoqueLivro.get(escolha - 1);
            System.out.println("O que deseja editar?");
            System.out.println("1 - Nome");
            System.out.println("2 - Autor");
            System.out.println("3 - Gênero");
            System.out.println("4 - Editora");
            System.out.println("5 - Quantidade de páginas");
            System.out.println("6 - Quantidade em estoque");
            System.out.print("> ");
            int opcaoEdicao = input.nextInt();
            input.nextLine();
            System.out.println("--------------------------");
            switch (opcaoEdicao) {
                case 1:
                    Editar.editarNome(livro);
                    break;
                case 2:
                    Editar.editarAutor(livro);
                    break;
                case 3:
                    Editar.editarGenero(livro);
                    break;
                case 4:
                    Editar.editarEditora(livro);
                    break;
                case 5:
                    Editar.editarPaginas(livro);
                    break;
                case 6:
                    Editar.editarQuantidade(livro);
                    break;
                default:
                    System.out.println("Opção inválida. Escolha um número entre 1 e 6.");
            }

        } else {
            System.out.println("Número inválido.");
        }
    }

    public void encerrar() {
        System.out.println("Encerrando o programa...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Programa encerrado com sucesso!");
        System.out.println("--------------------------");
        System.exit(0);
    }

    public int menuCarrinho() {
        System.out.println("=== Carrinho de Compras ===");
        System.out.println("1 - Adicionar livro ao carrinho");
        System.out.println("2 - Remover livro do carrinho");
        System.out.println("3 - Ver carrinho");
        System.out.println("4 - Finalizar compra");
        System.out.println("5 - Voltar");
        System.out.print("> ");
        int escolha = input.nextInt();
        input.nextLine();
        return escolha;
    }

    public void adicionarAoCarrinho(List<Livro> estoque, br.com.appBiblioteca.service.CarrinhoCompras carrinho) {
        if (estoque.isEmpty()) {
            System.out.println("Estoque vazio.");
            return;
        }
        System.out.println("Livros disponíveis:");
        for (int i = 0; i < estoque.size(); i++) {
            Livro l = estoque.get(i);
            System.out.println(
                    (i + 1) + " - " + l.getNome() + " (R$ " + l.getPreco() + ", Qtd: " + l.getQuantidade() + ")");
        }
        System.out.print("Escolha o livro: ");
        int idx = input.nextInt() - 1;
        input.nextLine();
        if (idx < 0 || idx >= estoque.size()) {
            System.out.println("Opção inválida.");
            return;
        }
        Livro livro = estoque.get(idx);
        System.out.print("Quantidade: ");
        int qtd = input.nextInt();
        input.nextLine();
        if (qtd <= 0 || qtd > livro.getQuantidade()) {
            System.out.println("Quantidade inválida.");
            return;
        }
        livro.setQuantidade(livro.getQuantidade() - qtd);
        carrinho.adicionarLivro(livro, qtd);
        System.out.println("Livro adicionado ao carrinho.");
    }

    public void removerDoCarrinho(br.com.appBiblioteca.service.CarrinhoCompras carrinho) {
        if (carrinho.estaVazio()) {
            System.out.println("Carrinho vazio.");
            return;
        }
        for (int i = 0; i < carrinho.getTamanho(); i++) {
            Livro l = carrinho.getLivro(i);
            System.out.println((i + 1) + " - " + l.getNome() + " (Qtd: " + carrinho.getQuantidade(i) + ")");
        }
        System.out.print("Escolha o livro para remover: ");
        int idx = input.nextInt() - 1;
        input.nextLine();
        if (idx < 0 || idx >= carrinho.getTamanho()) {
            System.out.println("Opção inválida.");
            return;
        }
        System.out.print("Quantidade a remover: ");
        int qtd = input.nextInt();
        input.nextLine();
        carrinho.removerLivro(idx, qtd);
        System.out.println("Livro removido do carrinho.");
    }

    public void mostrarCarrinho(br.com.appBiblioteca.service.CarrinhoCompras carrinho) {
        if (carrinho.estaVazio()) {
            System.out.println("Carrinho vazio.");
            return;
        }
        System.out.println("=== Itens no Carrinho ===");
        for (int i = 0; i < carrinho.getTamanho(); i++) {
            Livro l = carrinho.getLivro(i);
            System.out.println((i + 1) + " - " + l.getNome() + " (Qtd: " + carrinho.getQuantidade(i) + ", R$ "
                    + l.getPreco() + ")");
        }
        System.out.println("Total: R$ " + carrinho.getTotalCarrinho());
    }

    public void finalizarCompra(br.com.appBiblioteca.service.CarrinhoCompras carrinho) {
        if (carrinho.estaVazio()) {
            System.out.println("Carrinho vazio.");
            return;
        }
        mostrarCarrinho(carrinho);
        System.out.println("Compra finalizada! Obrigado.");
        carrinho.limparCarrinho();
    }
}