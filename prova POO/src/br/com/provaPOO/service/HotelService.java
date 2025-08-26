package br.com.provaPOO.service;

import br.com.provaPOO.model.Hospede;
import br.com.provaPOO.model.Quarto;
import br.com.provaPOO.model.Reserva;
import br.com.provaPOO.model.Servico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

public class HotelService {

    private final List<Hospede> hospedes = new ArrayList<>();
    private final List<Quarto> quartos = new ArrayList<>();
    private final List<Reserva> reservas = new ArrayList<>();

    public void cadastrarHospede(Hospede hospede) {
        if (hospede != null) {
            hospedes.add(hospede);
        }
    }

    public List<Hospede> listarHospedes() {
        return new ArrayList<>(hospedes);
    }

    public List<Hospede> pesquisarHospedePorNome(String termo) {
        String termoBusca = termo == null ? "" : termo.toLowerCase(Locale.ROOT);
        return hospedes.stream()
                .filter(hospede -> hospede.getNome() != null && 
                        hospede.getNome().toLowerCase(Locale.ROOT).contains(termoBusca))
                .collect(Collectors.toList());
    }

    public boolean editarHospede(String documento, String novoNome, String novoTelefone) {
        Optional<Hospede> hospedeEncontrado = hospedes.stream()
                .filter(hospede -> hospede.getDocumento().equalsIgnoreCase(documento))
                .findFirst();
        
        if (hospedeEncontrado.isPresent()) {
            Hospede hospede = hospedeEncontrado.get();
            if (novoNome != null && !novoNome.isBlank()) {
                hospede.setNome(novoNome);
            }
            if (novoTelefone != null && !novoTelefone.isBlank()) {
                hospede.setTelefone(novoTelefone);
            }
            return true;
        }
        return false;
    }

    public void cadastrarQuarto(Quarto quarto) {
        if (quarto != null) {
            quartos.add(quarto);
        }
    }

    public List<Quarto> listarQuartos() {
        return new ArrayList<>(quartos);
    }

    public List<Quarto> pesquisarQuartoPorTipo(String tipo) {
        String tipoBusca = tipo == null ? "" : tipo.toLowerCase(Locale.ROOT);
        return quartos.stream()
                .filter(quarto -> quarto.getTipo() != null && 
                        quarto.getTipo().toLowerCase(Locale.ROOT).contains(tipoBusca))
                .collect(Collectors.toList());
    }

    public Quarto buscarQuartoPorNumero(int numero) {
        return quartos.stream()
                .filter(quarto -> quarto.getNumero() == numero)
                .findFirst()
                .orElse(null);
    }

    public void cadastrarReserva(Reserva reserva) {
        if (reserva != null) {
            reservas.add(reserva);
        }
    }

    public List<Reserva> listarReservas() {
        return new ArrayList<>(reservas);
    }

    public List<Reserva> pesquisarReservaPorNomeHospede(String termo) {
        String termoBusca = termo == null ? "" : termo.toLowerCase(Locale.ROOT);
        return reservas.stream()
                .filter(reserva -> reserva.getHospede() != null
                        && reserva.getHospede().getNome() != null
                        && reserva.getHospede().getNome().toLowerCase(Locale.ROOT).contains(termoBusca))
                .collect(Collectors.toList());
    }

    public boolean cancelarReserva(int indiceReserva) {
        if (indiceReserva >= 0 && indiceReserva < reservas.size()) {
            Reserva reserva = reservas.get(indiceReserva);
            reserva.setCancelada(true);
            return true;
        }
        return false;
    }

    public void adicionarServicoEmReserva(int indiceReserva, Servico servico) {
        if (indiceReserva >= 0 && indiceReserva < reservas.size()) {
            reservas.get(indiceReserva).adicionarServico(servico);
        }
    }

    public List<Object> listarEntidadesGenericas() {
        List<Object> todasEntidades = new ArrayList<>();
        todasEntidades.addAll(hospedes);
        todasEntidades.addAll(quartos);
        todasEntidades.addAll(reservas);
        return todasEntidades;
    }

    public Reserva criarReserva(String documentoHospede, int numeroQuarto, LocalDate dataEntrada, LocalDate dataSaida) {
        Hospede hospede = hospedes.stream()
                .filter(h -> h.getDocumento().equalsIgnoreCase(documentoHospede))
                .findFirst()
                .orElse(null);
        
        Quarto quarto = buscarQuartoPorNumero(numeroQuarto);
        
        if (hospede == null || quarto == null) {
            return null;
        }
        
        return new Reserva(hospede, quarto, dataEntrada, dataSaida);
    }
}
