package br.com.provaTecnicas.view;

import br.com.provaTecnicas.model.*;
import br.com.provaTecnicas.model.equipamentos.MotorEletrico;
import br.com.provaTecnicas.model.equipamentos.PainelControle;
import br.com.provaTecnicas.service.EstoqueService;
import br.com.provaTecnicas.service.exceptions.QuantidadeInsuficiente;

import java.util.List;
import java.util.Scanner;

public class InterfaceUsuario {
    private EstoqueService service;
    private Scanner scanner;

    public void InterfaceUsuario(EstoqueService service) {
        this.service = service;
        this.scanner = new Scanner(System.in);
    }

    public InterfaceUsuario(EstoqueService estoqueService) {
    }

    public void executar() {
        int opcao = -1;
        while (opcao != 0) {
            try {
                exibirMenu();
                opcao = Integer.parseInt(lerEntrada("Digite a opção desejada: "));
                switch (opcao) {
                    case 1 -> cadastrarEquipamento();
                    case 2 -> listarTodos();
                    case 3 -> listarPorTipo();
                    case 4 -> pesquisarPorCodigo();
                    case 5 -> removerPorCodigo();
                    case 6 -> movimentarEstoque();
                    case 7 -> relatoriosEstoque();
                    case 8 -> buscaPorNome();
                    case 9 -> buscaPorPreco();
                    case 0 -> System.out.println("Saindo... até logo!");
                    default -> System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Entrada inválida: informe um número.");
            } catch (IllegalArgumentException iae) {
                System.out.println("Erro: " + iae.getMessage());
            } catch (QuantidadeInsuficiente qie) {
                System.out.println("Erro: " + qie.getMessage());
            } catch (Exception ex) {
                System.out.println("Erro inesperado: " + ex.getMessage());
            }
            System.out.println();
        }
    }

    private void exibirMenu() {
        System.out.println("===============================");
        System.out.println("  Sistema de Controle WEG 2.0");
        System.out.println("===============================\n");
        System.out.println("1 - Cadastrar Equipamento");
        System.out.println("2 - Listar Todos os Equipamentos");
        System.out.println("3 - Listar Equipamentos por Tipo");
        System.out.println("4 - Pesquisar Equipamento por Código");
        System.out.println("5 - Remover Equipamento por Código");
        System.out.println("6 - Movimentar Estoque (Adicionar/Retirar Quantidade)\n");
        System.out.println("7 - Relatórios de Estoque");
        System.out.println("8 - Busca Avançada por Nome");
        System.out.println("9 - Busca Avançada por Preço\n");
        System.out.println("0 - Sair\n");
    }

    private String lerEntrada(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private void cadastrarEquipamento() {
        System.out.println("Tipo de equipamento:");
        System.out.println("1 - MotorEletrico");
        System.out.println("2 - PainelControle");
        System.out.println("3 - Outro (Equipamento genérico)");
        int tipo = Integer.parseInt(lerEntrada("Escolha o tipo (1-3): "));
        String codigo = lerEntrada("Código: ");
        String nome = lerEntrada("Nome: ");
        int quantidade = Integer.parseInt(lerEntrada("Quantidade (inteiro >=0): "));
        double preco = Double.parseDouble(lerEntrada("Preço (ex: 1250.50): "));
        Equipamento e;
        switch (tipo) {
            case 1 -> {
                double potencia = Double.parseDouble(lerEntrada("Potência (ex: 5.5): "));
                e = new MotorEletrico(codigo, nome, quantidade, preco, potencia);
            }
            case 2 -> {
                String tensao = lerEntrada("Tensão (ex: 220V): ");
                e = new PainelControle(codigo, nome, quantidade, preco, tensao);
            }
            case 3 -> e = new Equipamento(codigo, nome, quantidade, preco);
            default -> throw new IllegalArgumentException("Tipo inválido.");
        }
        service.cadastrar(e);
        System.out.println("Equipamento cadastrado com sucesso!");
    }

    private void listarTodos() {
        List<Equipamento> lista = service.listarTodos();
        if (lista.isEmpty()) {
            System.out.println("Nenhum equipamento cadastrado.");
        } else {
            lista.forEach(System.out::println);
        }
    }

    private void listarPorTipo() {
        System.out.println("1 - MotorEletrico");
        System.out.println("2 - PainelControle");
        int tipo = Integer.parseInt(lerEntrada("Escolha o tipo (1-2): "));
        List<Equipamento> lista;
        switch (tipo) {
            case 1 -> lista = service.listarPorTipo(MotorEletrico.class);
            case 2 -> lista = service.listarPorTipo(PainelControle.class);
            default -> throw new IllegalArgumentException("Tipo inválido.");
        }
        if (lista.isEmpty()) {
            System.out.println("Nenhum equipamento do tipo selecionado.");
        } else {
            lista.forEach(System.out::println);
        }
    }

    private void pesquisarPorCodigo() {
        String codigo = lerEntrada("Informe o código: ");
        Equipamento e = service.buscarPorCodigo(codigo);
        if (e != null) {
            System.out.println(e);
        } else {
            System.out.println("Equipamento não encontrado.");
        }
    }

    private void removerPorCodigo() {
        String codigo = lerEntrada("Informe o código a remover: ");
        boolean removido = service.removerPorCodigo(codigo);
        if (removido) {
            System.out.println("Removido com sucesso.");
        } else {
            System.out.println("Equipamento não encontrado.");
        }
    }

    private void movimentarEstoque() throws QuantidadeInsuficiente {
        System.out.println("1 - Adicionar unidades");
        System.out.println("2 - Retirar unidades");
        int opc = Integer.parseInt(lerEntrada("Escolha a operação (1-2): "));
        String codigo = lerEntrada("Código do equipamento: ");
        int qtd = Integer.parseInt(lerEntrada("Quantidade: "));
        switch (opc) {
            case 1 -> {
                service.adicionarQuantidade(codigo, qtd);
                System.out.println("Adição realizada com sucesso.");
            }
            case 2 -> {
                service.retirarQuantidade(codigo, qtd);
                System.out.println("Retirada realizada com sucesso.");
            }
            default -> throw new IllegalArgumentException("Operação inválida.");
        }
    }

    private void relatoriosEstoque() {
        System.out.println("----- Relatórios de Estoque -----");
        System.out.println("Quantidade total em estoque: " + service.quantidadeTotalEmEstoque());
        System.out.println("\nEquipamento com maior preço:");
        Equipamento maiorPreco = service.equipamentoMaiorPreco();
        System.out.println(maiorPreco != null ? maiorPreco : "Nenhum equipamento.");
        System.out.println("\nEquipamento com maior quantidade:");
        Equipamento maiorQtd = service.equipamentoMaiorQuantidade();
        System.out.println(maiorQtd != null ? maiorQtd : "Nenhum equipamento.");
        System.out.println("\nEquipamentos com estoque baixo (quantidade < 5):");
        List<Equipamento> baixos = service.equipamentosEstoqueBaixo(5);
        if (baixos.isEmpty()) {
            System.out.println("Nenhum equipamento com estoque baixo.");
        } else {
            baixos.forEach(System.out::println);
        }
    }

    private void buscaPorNome() {
        String termo = lerEntrada("Digite parte do nome: ");
        List<Equipamento> encontrados = service.buscarPorNomeContendo(termo);
        if (encontrados.isEmpty()) {
            System.out.println("Nenhum equipamento encontrado com esse nome.");
        } else {
            encontrados.forEach(System.out::println);
        }
    }

    private void buscaPorPreco() {
        double precoMin = Double.parseDouble(lerEntrada("Informe o preço mínimo: "));
        List<Equipamento> encontrados = service.buscarPorPrecoMaiorQue(precoMin);
        if (encontrados.isEmpty()) {
            System.out.println("Nenhum equipamento com preço acima de R$ " + precoMin);
        } else {
            encontrados.forEach(System.out::println);
        }
    }
}
