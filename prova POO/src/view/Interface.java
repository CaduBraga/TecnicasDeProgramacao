package view;

import model.*;
import service.HotelService;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Camada de visualização (prints, Scanner, menus e submenus),
 * conforme sua preferência de separar exibição da lógica.
 */
public class Interface {

    private final Scanner sc = new Scanner(System.in);
    private final HotelService service;

    public Interface(HotelService service) {
        this.service = service;
    }

    public void iniciar() {
        int opcao;
        do {
            try {
                menuPrincipal();
                System.out.print("Escolha: ");
                opcao = Integer.parseInt(sc.nextLine());
                switch (opcao) {
                    case 1:
                        submenuCadastro();
                        break;
                    case 2:
                        submenuListagem();
                        break;
                    case 3:
                        submenuPesquisa();
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
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite números quando solicitado.\n");
                opcao = -1;
            }
        } while (opcao != 0);
    }

    private void menuPrincipal() {
        System.out.println("\n==== SISTEMA DE HOTEL ====");
        System.out.println("1) Cadastros");
        System.out.println("2) Listagens");
        System.out.println("3) Pesquisas");
        System.out.println("4) Editar dados de um hóspede");
        System.out.println("5) Cancelar uma reserva");
        System.out.println("0) Sair");
    }

    // ─────────────────────────── SUBMENUS ───────────────────────────
    private void submenuCadastro() {
        System.out.println("\n-- Cadastro --");
        System.out.println("1) Cadastrar hóspede");
        System.out.println("2) Cadastrar quarto");
        System.out.println("3) Cadastrar reserva");
        System.out.println("4) Adicionar serviço a uma reserva");
        System.out.println("0) Voltar");
        System.out.print("Escolha: ");
        String op = sc.nextLine();
        switch (op) {
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

    private void submenuListagem() {
        System.out.println("\n-- Listagem --");
        System.out.println("1) Listar hóspedes");
        System.out.println("2) Listar quartos");
        System.out.println("3) Listar reservas");
        System.out.println("4) Listar tudo (demonstração instanceof)");
        System.out.println("0) Voltar");
        System.out.print("Escolha: ");
        String op = sc.nextLine();
        switch (op) {
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

    private void submenuPesquisa() {
        System.out.println("\n-- Pesquisa --");
        System.out.println("1) Pesquisar hóspede por nome");
        System.out.println("2) Pesquisar quarto por tipo");
        System.out.println("3) Pesquisar reserva por nome do hóspede");
        System.out.println("0) Voltar");
        System.out.print("Escolha: ");
        String op = sc.nextLine();
        switch (op) {
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

    // ─────────────────────────── AÇÕES ───────────────────────────
    private void cadastrarHospede() {
        try {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Documento: ");
            String doc = sc.nextLine();
            System.out.print("Telefone: ");
            String tel = sc.nextLine();

            Hospede h = new Hospede(nome, doc, tel);
            service.cadastrarHospede(h);
            System.out.println("Hóspede cadastrado!\n");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar hóspede: " + e.getMessage());
        }
    }

    private void cadastrarQuarto() {
        try {
            System.out.print("Número do quarto (int): ");
            int numero = Integer.parseInt(sc.nextLine());
            System.out.print("Tipo (ex.: Standard/Luxo/Suíte): ");
            String tipo = sc.nextLine();
            System.out.print("Preço da diária (double): ");
            double preco = Double.parseDouble(sc.nextLine());

            Quarto q = new Quarto(numero, tipo, preco);
            service.cadastrarQuarto(q);
            System.out.println("Quarto cadastrado!\n");
        } catch (NumberFormatException e) {
            System.out.println("Valores numéricos inválidos.\n");
        }
    }

    private void cadastrarReserva() {
        try {
            System.out.print("Documento do hóspede: ");
            String doc = sc.nextLine();
            System.out.print("Número do quarto: ");
            int numero = Integer.parseInt(sc.nextLine());
            System.out.print("Data de entrada (AAAA-MM-DD): ");
            LocalDate entrada = LocalDate.parse(sc.nextLine());
            System.out.print("Data de saída (AAAA-MM-DD): ");
            LocalDate saida = LocalDate.parse(sc.nextLine());

            Reserva r = service.criarReserva(doc, numero, entrada, saida);
            if (r == null) {
                System.out.println("Hóspede ou quarto não encontrado. Cadastre-os antes.\n");
                return;
            }
            service.cadastrarReserva(r);
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
            int idx = Integer.parseInt(sc.nextLine());

            System.out.print("Nome do serviço: ");
            String nome = sc.nextLine();
            System.out.print("Preço do serviço: ");
            double preco = Double.parseDouble(sc.nextLine());

            service.adicionarServicoEmReserva(idx, new Servico(nome, preco));
            System.out.println("Serviço adicionado!\n");
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida.\n");
        }
    }

    private void listarHospedes() {
        List<Hospede> lista = service.listarHospedes();
        if (lista.isEmpty()) System.out.println("Nenhum hóspede cadastrado.");
        else {
            int i = 0; for (Hospede h : lista) {
                System.out.println("["+ (i++) +"] " + h);
            }
        }
        System.out.println();
    }

    private void listarQuartos() {
        List<Quarto> lista = service.listarQuartos();
        if (lista.isEmpty()) System.out.println("Nenhum quarto cadastrado.");
        else {
            int i = 0; for (Quarto q : lista) {
                System.out.println("["+ (i++) +"] " + q);
            }
        }
        System.out.println();
    }

    private void listarReservas() {
        List<Reserva> lista = service.listarReservas();
        if (lista.isEmpty()) System.out.println("Nenhuma reserva cadastrada.");
        else {
            int i = 0; for (Reserva r : lista) {
                System.out.println("["+ (i++) +"] \n" + r + "\n");
            }
        }
    }

    // Demonstração do uso de instanceof conforme solicitado
    private void listarGenerico() {
        List<Object> all = service.listarEntidadesGenericas();
        if (all.isEmpty()) {
            System.out.println("Nada para listar.\n");
            return;
        }
        for (Object o : all) {
            if (o instanceof Hospede) {
                Hospede h = (Hospede) o;
                System.out.println("(Hóspede) " + h);
            } else if (o instanceof Quarto) {
                Quarto q = (Quarto) o;
                System.out.println("(Quarto) " + q);
            } else if (o instanceof Reserva) {
                Reserva r = (Reserva) o;
                System.out.println("(Reserva) \n" + r + "\n");
            } else {
                System.out.println(o);
            }
        }
        System.out.println();
    }

    private void pesquisarHospedePorNome() {
        System.out.print("Termo do nome: ");
        String termo = sc.nextLine();
        List<Hospede> res = service.pesquisarHospedePorNome(termo);
        if (res.isEmpty()) System.out.println("Nenhum hóspede encontrado.\n");
        else res.forEach(h -> System.out.println(h));
        System.out.println();
    }

    private void pesquisarQuartoPorTipo() {
        System.out.print("Tipo (parte do texto): ");
        String tipo = sc.nextLine();
        List<Quarto> res = service.pesquisarQuartoPorTipo(tipo);
        if (res.isEmpty()) System.out.println("Nenhum quarto encontrado.\n");
        else res.forEach(q -> System.out.println(q));
        System.out.println();
    }

    private void pesquisarReservaPorNomeHospede() {
        System.out.print("Nome do hóspede (parte): ");
        String nome = sc.nextLine();
        List<Reserva> res = service.pesquisarReservaPorNomeHospede(nome);
        if (res.isEmpty()) System.out.println("Nenhuma reserva encontrada.\n");
        else res.forEach(r -> System.out.println("\n" + r + "\n"));
    }

    private void editarHospede() {
        System.out.print("Documento do hóspede a editar: ");
        String doc = sc.nextLine();
        System.out.print("Novo nome (deixe vazio para manter): ");
        String nome = sc.nextLine();
        System.out.print("Novo telefone (deixe vazio para manter): ");
        String tel = sc.nextLine();
        boolean ok = service.editarHospede(doc, nome, tel);
        System.out.println(ok ? "Dados atualizados!\n" : "Hóspede não encontrado.\n");
    }

    private void cancelarReserva() {
        listarReservas();
        System.out.print("Informe o índice da reserva para cancelar: ");
        try {
            int idx = Integer.parseInt(sc.nextLine());
            boolean ok = service.cancelarReserva(idx);
            System.out.println(ok ? "Reserva cancelada!\n" : "Índice inválido.\n");
        } catch (NumberFormatException e) {
            System.out.println("Índice inválido.\n");
        }
    }
}
