package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 * Reserva agrega Serviços (lista de Servico) e relaciona Hospede + Quarto.
 */
public class Reserva {
    private Hospede hospede; // composição por referência
    private Quarto quarto;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private List<Servico> servicos = new ArrayList<>(); // agregação
    private boolean cancelada = false;

    public Reserva() {}

    public Reserva(Hospede hospede, Quarto quarto, LocalDate entrada, LocalDate saida) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.dataEntrada = entrada;
        this.dataSaida = saida;
    }

    public Hospede getHospede() { return hospede; }
    public void setHospede(Hospede hospede) { this.hospede = hospede; }

    public Quarto getQuarto() { return quarto; }
    public void setQuarto(Quarto quarto) { this.quarto = quarto; }

    public LocalDate getDataEntrada() { return dataEntrada; }
    public void setDataEntrada(LocalDate dataEntrada) { this.dataEntrada = dataEntrada; }

    public LocalDate getDataSaida() { return dataSaida; }
    public void setDataSaida(LocalDate dataSaida) { this.dataSaida = dataSaida; }

    public List<Servico> getServicos() { return servicos; }

    public boolean isCancelada() { return cancelada; }
    public void setCancelada(boolean cancelada) { this.cancelada = cancelada; }

    public void adicionarServico(Servico s) {
        if (s != null) servicos.add(s);
    }

    public long getQtdDiarias() {
        if (dataEntrada == null || dataSaida == null) return 0;
        long dias = ChronoUnit.DAYS.between(dataEntrada, dataSaida);
        return Math.max(dias, 0);
    }

    public double getTotalServicos() {
        return servicos.stream().mapToDouble(Servico::getPreco).sum();
    }

    public double getTotal() {
        double diarias = getQtdDiarias() * (quarto != null ? quarto.getPreco() : 0.0);
        return diarias + getTotalServicos();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reserva\n");
        if (hospede != null) sb.append(" - Hóspede: ").append(hospede.getNome()).append("\n");
        if (quarto != null) sb.append(" - Quarto: ").append(quarto.getNumero()).append(" ("+quarto.getTipo()+")\n");
        sb.append(" - Entrada: ").append(dataEntrada).append(" | Saída: ").append(dataSaida).append("\n");
        sb.append(" - Diárias: ").append(getQtdDiarias()).append("\n");
        sb.append(" - Serviços ("+servicos.size()+"): ");
        if (servicos.isEmpty()) sb.append("nenhum");
        else {
            for (int i = 0; i < servicos.size(); i++) {
                sb.append(servicos.get(i).getNome());
                if (i < servicos.size()-1) sb.append(", ");
            }
        }
        sb.append("\n - Total: R$ ").append(String.format("%.2f", getTotal()));
        sb.append("\n - Status: ").append(cancelada ? "CANCELADA" : "ATIVA");
        return sb.toString();
    }
}
