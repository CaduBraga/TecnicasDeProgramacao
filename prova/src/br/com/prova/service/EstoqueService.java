package br.com.prova.service;

import java.util.ArrayList;
import java.util.List;
import br.com.prova.model.*;
import br.com.prova.model.equipamentos.*;
import br.com.prova.service.exceptions.QuantidadeInsuficiente;

public class EstoqueService {
    private final List<Equipamento> lista = new ArrayList<>();

    public void cadastrar(Equipamento equipamento) {
        if (buscarPorCodigo(equipamento.getCodigo()) != null) {
            throw new IllegalArgumentException("Já existe equipamento com o código: " + equipamento.getCodigo());
        }
        lista.add(equipamento);
    }

    public List<Equipamento> listarTodos() {
        return new ArrayList<>(lista);
    }

    public List<Equipamento> listarPorTipo(Class<?> tipo) {
        List<Equipamento> filtrados = new ArrayList<>();
        for (Equipamento e : lista) {
            if (tipo == MotorEletrico.class && e instanceof MotorEletrico) {
                filtrados.add(e);
            } else if (tipo == PainelControle.class && e instanceof PainelControle) {
                filtrados.add(e);
            }
        }
        return filtrados;
    }

    public Equipamento buscarPorCodigo(String codigo) {
        for (Equipamento e : lista) {
            if (e.getCodigo().equalsIgnoreCase(codigo)) {
                return e;
            }
        }
        return null;
    }

    public boolean removerPorCodigo(String codigo) {
        Equipamento e = buscarPorCodigo(codigo);
        if (e != null) {
            lista.remove(e);
            return true;
        }
        return false;
    }

    public void adicionarQuantidade(String codigo, int qtd) {
        if (qtd <= 0) throw new IllegalArgumentException("A quantidade adicionada deve ser positiva.");
        Equipamento e = buscarPorCodigo(codigo);
        if (e == null) throw new IllegalArgumentException("O equipamento com o código: " + codigo + "não foi encontrado");
        e.setQuantidade(e.getQuantidade() + qtd);
    }

    public void retirarQuantidade(String codigo, int qtd) throws QuantidadeInsuficiente {
        if (qtd <= 0) throw new IllegalArgumentException("A quantidade retirada deve ser positiva.");
        Equipamento e = buscarPorCodigo(codigo);
        if (e == null) throw new IllegalArgumentException("O equipamento com o código: " + codigo + "não foi encontrado");
        if (e.getQuantidade() < qtd) {
            throw new QuantidadeInsuficiente("Operação negada: retirada maior que a quantidade disponível.");
        }
        e.setQuantidade(e.getQuantidade() - qtd);
    }

    public int quantidadeTotalEmEstoque() {
        int total = 0;
        for (Equipamento e : lista) {
            total += e.getQuantidade();
        }
        return total;
    }

    public Equipamento equipamentoMaiorPreco() {
        if (lista.isEmpty()) return null;
        Equipamento maior = lista.get(0);
        for (Equipamento e : lista) {
            if (e.getPreco() > maior.getPreco()) {
                maior = e;
            }
        }
        return maior;
    }

    public Equipamento equipamentoMaiorQuantidade() {
        if (lista.isEmpty()) return null;
        Equipamento maior = lista.get(0);
        for (Equipamento e : lista) {
            if (e.getQuantidade() > maior.getQuantidade()) {
                maior = e;
            }
        }
        return maior;
    }

    public List<Equipamento> equipamentosEstoqueBaixo(int limite) {
        List<Equipamento> baixos = new ArrayList<>();
        for (Equipamento e : lista) {
            if (e.getQuantidade() < limite) {
                baixos.add(e);
            }
        }
        return baixos;
    }

    public List<Equipamento> buscarPorNomeContendo(String termo) {
        List<Equipamento> encontrados = new ArrayList<>();
        String lower = termo.toLowerCase();
        for (Equipamento e : lista) {
            if (e.getNome().toLowerCase().contains(lower)) {
                encontrados.add(e);
            }
        }
        return encontrados;
    }

    public List<Equipamento> buscarPorPrecoMaiorQue(double precoMinimo) {
        List<Equipamento> encontrados = new ArrayList<>();
        for (Equipamento e : lista) {
            if (e.getPreco() > precoMinimo) {
                encontrados.add(e);
            }
        }
        return encontrados;
    }
}