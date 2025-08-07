package br.com.appBiblioteca.view;

import br.com.appBiblioteca.service.ValidacaoService;
import br.com.appBiblioteca.service.exceptions.EntradaInvalidaException;
import java.util.Scanner;

public class Menus {
    static Scanner input = new Scanner(System.in);

    public static int menuPrincipal() {
        boolean entradaValida = false;
        int escolha = 0;
        
        while (!entradaValida) {
            try {
                System.out.println("+--------------------------------------------------------------+");
                System.out.println("|                    SISTEMA BIBLIOTECA                        |");
                System.out.println("+--------------------------------------------------------------+");
                System.out.println("|  O que você deseja fazer?                                    |");
                System.out.println("|                                                              |");
                System.out.println("|  1 - Cadastrar livros                                        |");
                System.out.println("|  2 - Ver livros                                              |");
                System.out.println("|  3 - Remover livros                                          |");
                System.out.println("|  4 - Editar livros                                           |");
                System.out.println("|  5 - Iniciar compras                                         |");
                System.out.println("|  6 - Relatório da biblioteca                                 |");
                System.out.println("|  7 - Sair do programa                                        |");
                System.out.println("+--------------------------------------------------------------+");
                
                escolha = ValidacaoService.validarOpcaoMenu(input, "  Digite sua escolha: ", 1, 7);
                entradaValida = true;
            } catch (EntradaInvalidaException e) {
                System.out.println("\n" + e.getMessage());
                System.out.println("Tente novamente.\n");
            }
        }
        
        System.out.println();
        return escolha;
    }
}