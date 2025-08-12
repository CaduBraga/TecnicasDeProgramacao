package br.com.provaTecnicas.main;
import br.com.provaTecnicas.service.EstoqueService;
import br.com.provaTecnicas.view.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {
        EstoqueService estoqueService = new EstoqueService();
        InterfaceUsuario tela = new InterfaceUsuario(estoqueService);
        tela.executar();
    }
}
