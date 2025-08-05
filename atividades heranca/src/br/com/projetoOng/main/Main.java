package br.com.projetoOng.main;

import java.util.Scanner;
import br.com.projetoOng.service.CadastroService;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Voluntariado para ONG ===");
        
        CadastroService cadastro = new CadastroService();
        Scanner input = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Cadastrar Voluntário");
            System.out.println("2 - Cadastrar Coordenador");
            System.out.println("3 - Mostrar Todos os Cadastros");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            
            opcao = input.nextInt();
            input.nextLine(); // Consumir quebra de linha
            
            switch (opcao) {
                case 1:
                    cadastro.cadastrarVoluntario();
                    break;
                case 2:
                    cadastro.cadastrarCoordenador();
                    break;
                case 3:
                    cadastro.mostrarTodos();
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
        
        input.close();
    }
}
