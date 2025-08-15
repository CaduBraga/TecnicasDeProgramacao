package service;

import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Camada de regras/controle (equivalente ao seu "Gerenciamento").
 * Mantém as listas e expõe operações de cadastro, listagem, pesquisa e edição.
 */
public class HotelService {

    private final List<Hospede> hospedes = new ArrayList<>();
    private final List<Quarto> quartos = new ArrayList<>();
    private final List<Reserva> reservas = new ArrayList<>();

    // ─────────────────────────── HÓSPEDE ───────────────────────────
    public void cadastrarHospede(Hospede h) {
        if (h != null) hospedes.add(h);
    }

    public List<Hospede> listarHospedes() { return new ArrayList<>(hospedes); }

    public List<Hospede> pesquisarHospedePorNome(String termo) {
        String t = termo == null ? "" : termo.toLowerCase(Locale.ROOT);
        return hospedes.stream()
                .filter(h -> h.getNome() != null && h.getNome().toLowerCase(Locale.ROOT).contains(t))
                .collect(Collectors.toList());
    }

    public boolean editarHospede(String documento, String novoNome, String novoTelefone) {
        Optional<Hospede> opt = hospedes.stream().filter(h -> h.getDocumento().equalsIgnoreCase(documento)).findFirst();
        if (opt.isPresent()) {
            Hospede h = opt.get();
            if (novoNome != null && !novoNome.isBlank()) h.setNome(novoNome);
            if (novoTelefone != null && !novoTelefone.isBlank()) h.setTelefone(novoTelefone);
            return true;
        }
        return false;
    }

    // ─────────────────────────── QUARTO ────────────────────────────
    public void cadastrarQuarto(Quarto q) {
        if (q != null) quartos.add(q);
    }

    public List<Quarto> listarQuartos() { return new ArrayList<>(quartos); }

    public List<Quarto> pesquisarQuartoPorTipo(String tipo) {
        String t = tipo == null ? "" : tipo.toLowerCase(Locale.ROOT);
        return quartos.stream()
                .filter(q -> q.getTipo() != null && q.getTipo().toLowerCase(Locale.ROOT).contains(t))
                .collect(Collectors.toList());
    }

    public Quarto buscarQuartoPorNumero(int numero) {
        return quartos.stream().filter(q -> q.getNumero() == numero).findFirst().orElse(null);
    }

    // ─────────────────────────── RESERVA ───────────────────────────
    public void cadastrarReserva(Reserva r) {
        if (r != null) reservas.add(r);
    }

    public List<Reserva> listarReservas() { return new ArrayList<>(reservas); }

    public List<Reserva> pesquisarReservaPorNomeHospede(String termo) {
        String t = termo == null ? "" : termo.toLowerCase(Locale.ROOT);
        return reservas.stream()
                .filter(r -> r.getHospede() != null
                        && r.getHospede().getNome() != null
                        && r.getHospede().getNome().toLowerCase(Locale.ROOT).contains(t))
                .collect(Collectors.toList());
    }

    public boolean cancelarReserva(int indexNaLista) {
        if (indexNaLista >= 0 && indexNaLista < reservas.size()) {
            Reserva r = reservas.get(indexNaLista);
            r.setCancelada(true);
            return true;
        }
        return false;
    }

    public void adicionarServicoEmReserva(int indexReserva, Servico s) {
        if (indexReserva >= 0 && indexReserva < reservas.size()) {
            reservas.get(indexReserva).adicionarServico(s);
        }
    }

    // Exemplo do uso de instanceof conforme pedido na prova
    // Retorna uma lista genérica para demonstrar tratamento polimórfico
    public List<Object> listarEntidadesGenericas() {
        List<Object> all = new ArrayList<>();
        all.addAll(hospedes);
        all.addAll(quartos);
        all.addAll(reservas);
        return all;
    }

    // Helper para criar reserva garantindo dados mínimos
    public Reserva criarReserva(String docHospede, int numeroQuarto, LocalDate entrada, LocalDate saida) {
        Hospede h = hospedes.stream().filter(x -> x.getDocumento().equalsIgnoreCase(docHospede)).findFirst().orElse(null);
        Quarto q = buscarQuartoPorNumero(numeroQuarto);
        if (h == null || q == null) return null;
        return new Reserva(h, q, entrada, saida);
    }
}
