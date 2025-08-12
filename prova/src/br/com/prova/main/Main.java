package br.com.prova.main;

import br.com.prova.service.EstoqueService;
import br.com.prova.view.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {
        EstoqueService estoqueService = new EstoqueService();
        InterfaceUsuario tela = new InterfaceUsuario(estoqueService);
        tela.executar();
    }
}
