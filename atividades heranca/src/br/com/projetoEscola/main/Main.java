package br.com.projetoEscola.main;

import br.com.projetoEscola.view.Interface;
import br.com.projetoEscola.service.CadastroService;

public class Main {
    public static void main(String[] args) {
        Interface.mensagemInicial();
        CadastroService cadastro = new CadastroService();
        cadastro.escolherCadastro();
    }
}