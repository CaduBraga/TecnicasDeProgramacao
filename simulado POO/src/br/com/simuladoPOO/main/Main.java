package br.com.simuladoPOO.main;

import br.com.simuladoPOO.service.EstoqueService;
import br.com.simuladoPOO.view.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {
        EstoqueService estoqueService = new EstoqueService();
        InterfaceUsuario tela = new InterfaceUsuario(estoqueService);
        tela.executar();
    }
}
