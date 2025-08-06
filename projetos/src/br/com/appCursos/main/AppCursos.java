package br.com.appCursos.main;

import br.com.appCursos.service.Estoque;
import br.com.appCursos.view.Interface;

public class AppCursos {
    public static void main(String[] args) {

        Interface.mensagemInicial();

        Estoque estoqueCurso = new Estoque();

        estoqueCurso.gerenciarEstoque();
    }
}