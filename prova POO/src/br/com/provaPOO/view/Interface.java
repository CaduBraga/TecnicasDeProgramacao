package br.com.provaPOO.view;

import br.com.provaPOO.model.Hospede;
import br.com.provaPOO.model.Quarto;
import br.com.provaPOO.model.Reserva;
import br.com.provaPOO.model.Servico;
import br.com.provaPOO.service.HotelService;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class Interface {

    private final Scanner scanner = new Scanner(System.in);
    private final HotelService service;

    public Interface(HotelService service) {
        this.service = service;
    }

    public void iniciar() {
        int opcao;
        do {
            try {
                exibirMenuPrincipal();
                System.out.print("Escolha: ");
                opcao = Integer.parseInt(scanner.nextLine());
                processarOpcaoMenu(opcao);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite números quando solicitado.\n");
                opcao = -1;
            }
        } while (opcao != 0);
    }

    private void exibirMenuPrincipal() {
        System.out.println("\n==== SISTEMA DE HOTEL ====");
        System.out.println("1) Cadastros");
        System.out.println("2) Listagens");
        System.out.println("3) Pesquisas");
        System.out.println("4) Editar dados de um hóspede");
        System.out.println("5) Cancelar uma reserva");
        System.out.println("0) Sair");
    }

    private void processarOpcaoMenu(int opcao) {
        switch (opcao) {
            case 1:
                exibirSubmenuCadastro();
                break;
            case 2:
                exibirSubmenuListagem();
                break;
            case 3:
                exibirSubmenuPesquisa();
                break;
            case 4:
                editarHospede();
                break;
            case 5:
                cancelarReserva();
                break;
            case 0:
                System.out.println("Saindo... Até logo!\n");
                break;
            default:
                System.out.println("Opção inválida!\n");
                break;
        }
    }

    private void exibirSubmenuCadastro() {
        System.out.println("\n-- Cadastro --");
        System.out.println("1) Cadastrar hóspede");
        System.out.println("2) Cadastrar quarto");
        System.out.println("3) Cadastrar reserva");
        System.out.println("4) Adicionar serviço a uma reserva");
        System.out.println("0) Voltar");
        System.out.print("Escolha: ");
        String opcao = scanner.nextLine();
        processarOpcaoCadastro(opcao);
    }

    private void processarOpcaoCadastro(String opcao) {
        switch (opcao) {
            case "1":
                cadastrarHospede();
                break;
            case "2":
                cadastrarQuarto();
                break;
            case "3":
                cadastrarReserva();
                break;
            case "4":
                adicionarServicoReserva();
                break;
            case "0":
                break;
            default:
                System.out.println("Opção inválida!\n");
                break;
        }
    }

    private void exibirSubmenuListagem() {
        System.out.println("\n-- Listagem --");
        System.out.println("1) Listar hóspedes");
        System.out.println("2) Listar quartos");
        System.out.println("3) Listar reservas");
        System.out.println("4) Listar tudo (demonstração instanceof)");
        System.out.println("0) Voltar");
        System.out.print("Escolha: ");
        String opcao = scanner.nextLine();
        processarOpcaoListagem(opcao);
    }

    private void processarOpcaoListagem(String opcao) {
        switch (opcao) {
            case "1":
                listarHospedes();
                break;
            case "2":
                listarQuartos();
                break;
            case "3":
                listarReservas();
                break;
            case "4":
                listarGenerico();
                break;
            case "0":
                break;
            default:
                System.out.println("Opção inválida!\n");
                break;
        }
    }

    private void exibirSubmenuPesquisa() {
        System.out.println("\n-- Pesquisa --");
        System.out.println("1) Pesquisar hóspede por nome");
        System.out.println("2) Pesquisar quarto por tipo");
        System.out.println("3) Pesquisar reserva por nome do hóspede");
        System.out.println("0) Voltar");
        System.out.print("Escolha: ");
        String opcao = scanner.nextLine();
        processarOpcaoPesquisa(opcao);
    }

    private void processarOpcaoPesquisa(String opcao) {
        switch (opcao) {
            case "1":
                pesquisarHospedePorNome();
                break;
            case "2":
                pesquisarQuartoPorTipo();
                break;
            case "3":
                pesquisarReservaPorNomeHospede();
                break;
            case "0":
                break;
            default:
                System.out.println("Opção inválida!\n");
                break;
        }
    }

    private void cadastrarHospede() {
        try {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Documento: ");
            String documento = scanner.nextLine();
            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();

            Hospede hospede = new Hospede(nome, documento, telefone);
            service.cadastrarHospede(hospede);
            System.out.println("Hóspede cadastrado!\n");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar hóspede: " + e.getMessage());
        }
    }

    private void cadastrarQuarto() {
        try {
            System.out.print("Número do quarto (int): ");
            int numero = Integer.parseInt(scanner.nextLine());
            System.out.print("Tipo (ex.: Standard/Luxo/Suíte): ");
            String tipo = scanner.nextLine();
            System.out.print("Preço da diária (double): ");
            double preco = Double.parseDouble(scanner.nextLine());

            Quarto quarto = new Quarto(numero, tipo, preco);
            service.cadastrarQuarto(quarto);
            System.out.println("Quarto cadastrado!\n");
        } catch (NumberFormatException e) {
            System.out.println("Valores numéricos inválidos.\n");
        }
    }

    private void cadastrarReserva() {
        try {
            System.out.print("Documento do hóspede: ");
            String documento = scanner.nextLine();
            System.out.print("Número do quarto: ");
            int numero = Integer.parseInt(scanner.nextLine());
            System.out.print("Data de entrada (AAAA-MM-DD): ");
            LocalDate dataEntrada = LocalDate.parse(scanner.nextLine());
            System.out.print("Data de saída (AAAA-MM-DD): ");
            LocalDate dataSaida = LocalDate.parse(scanner.nextLine());

            Reserva reserva = service.criarReserva(documento, numero, dataEntrada, dataSaida);
            if (reserva == null) {
                System.out.println("Hóspede ou quarto não encontrado. Cadastre-os antes.\n");
                return;
            }
            service.cadastrarReserva(reserva);
            System.out.println("Reserva cadastrada!\n");
        } catch (NumberFormatException e) {
            System.out.println("Número de quarto inválido.\n");
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida. Use o formato AAAA-MM-DD.\n");
        }
    }

    private void adicionarServicoReserva() {
        try {
            listarReservas();
            System.out.print("Índice da reserva (conforme listagem): ");
            int indice = Integer.parseInt(scanner.nextLine());

            System.out.print("Nome do serviço: ");
            String nome = scanner.nextLine();
            System.out.print("Preço do serviço: ");
            double preco = Double.parseDouble(scanner.nextLine());

            service.adicionarServicoEmReserva(indice, new Servico(nome, preco));
            System.out.println("Serviço adicionado!\n");
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida.\n");
        }
    }

    private void listarHospedes() {
        List<Hospede> lista = service.listarHospedes();
        if (lista.isEmpty()) {
            System.out.println("Nenhum hóspede cadastrado.");
        } else {
            int indice = 0;
            for (Hospede hospede : lista) {
                System.out.println("[" + (indice++) + "] " + hospede);
            }
        }
        System.out.println();
    }

    private void listarQuartos() {
        List<Quarto> lista = service.listarQuartos();
        if (lista.isEmpty()) {
            System.out.println("Nenhum quarto cadastrado.");
        } else {
            int indice = 0;
            for (Quarto quarto : lista) {
                System.out.println("[" + (indice++) + "] " + quarto);
            }
        }
        System.out.println();
    }

    private void listarReservas() {
        List<Reserva> lista = service.listarReservas();
        if (lista.isEmpty()) {
            System.out.println("Nenhuma reserva cadastrada.");
        } else {
            int indice = 0;
            for (Reserva reserva : lista) {
                System.out.println("[" + (indice++) + "] \n" + reserva + "\n");
            }
        }
    }

    private void listarGenerico() {
        List<Object> todasEntidades = service.listarEntidadesGenericas();
        if (todasEntidades.isEmpty()) {
            System.out.println("Nada para listar.\n");
            return;
        }
        for (Object entidade : todasEntidades) {
            if (entidade instanceof Hospede) {
                Hospede hospede = (Hospede) entidade;
                System.out.println("(Hóspede) " + hospede);
            } else if (entidade instanceof Quarto) {
                Quarto quarto = (Quarto) entidade;
                System.out.println("(Quarto) " + quarto);
            } else if (entidade instanceof Reserva) {
                Reserva reserva = (Reserva) entidade;
                System.out.println("(Reserva) \n" + reserva + "\n");
            } else {
                System.out.println(entidade);
            }
        }
        System.out.println();
    }

    private void pesquisarHospedePorNome() {
        System.out.print("Termo do nome: ");
        String termo = scanner.nextLine();
        List<Hospede> resultados = service.pesquisarHospedePorNome(termo);
        if (resultados.isEmpty()) {
            System.out.println("Nenhum hóspede encontrado.\n");
        } else {
            resultados.forEach(hospede -> System.out.println(hospede));
        }
        System.out.println();
    }

    private void pesquisarQuartoPorTipo() {
        System.out.print("Tipo (parte do texto): ");
        String tipo = scanner.nextLine();
        List<Quarto> resultados = service.pesquisarQuartoPorTipo(tipo);
        if (resultados.isEmpty()) {
            System.out.println("Nenhum quarto encontrado.\n");
        } else {
            resultados.forEach(quarto -> System.out.println(quarto));
        }
        System.out.println();
    }

    private void pesquisarReservaPorNomeHospede() {
        System.out.print("Nome do hóspede (parte): ");
        String nome = scanner.nextLine();
        List<Reserva> resultados = service.pesquisarReservaPorNomeHospede(nome);
        if (resultados.isEmpty()) {
            System.out.println("Nenhuma reserva encontrada.\n");
        } else {
            resultados.forEach(reserva -> System.out.println("\n" + reserva + "\n"));
        }
    }

    private void editarHospede() {
        System.out.print("Documento do hóspede a editar: ");
        String documento = scanner.nextLine();
        System.out.print("Novo nome (deixe vazio para manter): ");
        String nome = scanner.nextLine();
        System.out.print("Novo telefone (deixe vazio para manter): ");
        String telefone = scanner.nextLine();
        boolean sucesso = service.editarHospede(documento, nome, telefone);
        System.out.println(sucesso ? "Dados atualizados!\n" : "Hóspede não encontrado.\n");
    }

    private void cancelarReserva() {
        listarReservas();
        System.out.print("Informe o índice da reserva para cancelar: ");
        try {
            int indice = Integer.parseInt(scanner.nextLine());
            boolean sucesso = service.cancelarReserva(indice);
            System.out.println(sucesso ? "Reserva cancelada!\n" : "Índice inválido.\n");
        } catch (NumberFormatException e) {
            System.out.println("Índice inválido.\n");
        }
    }
}
