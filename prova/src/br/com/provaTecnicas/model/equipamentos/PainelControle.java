package br.com.provaTecnicas.model.equipamentos;

import br.com.provaTecnicas.model.Equipamento;

public class PainelControle extends Equipamento {
    private String tensao;

    public PainelControle() {
        super();
    }

    public PainelControle(String codigo, String nome, int quantidade, double preco, String tensao) {
        super(codigo, nome, quantidade, preco);
        this.tensao = tensao;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    @Override
    public String toString() {
        return "PainelControle | " + super.toString() + String.format(" | Tensão: %s", tensao);
    }
}

