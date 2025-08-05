package br.com.projetoClinica.main;

import java.util.Scanner;
import br.com.projetoClinica.service.CadastroService;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Cadastro da Clínica ===");
        
        CadastroService cadastro = new CadastroService();
        Scanner input = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Cadastrar Paciente");
            System.out.println("2 - Cadastrar Médico");
            System.out.println("3 - Mostrar Todos os Cadastros");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            
            opcao = input.nextInt();
            input.nextLine(); // Consumir quebra de linha
            
            switch (opcao) {
                case 1:
                    cadastro.cadastrarPaciente();
                    break;
                case 2:
                    cadastro.cadastrarMedico();
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
