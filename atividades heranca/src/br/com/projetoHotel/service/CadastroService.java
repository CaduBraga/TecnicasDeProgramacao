package br.com.projetoHotel.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import br.com.projetoHotel.model.*;

public class CadastroService {
    private List<Pessoa> cadastroPessoas;

    public CadastroService() {
        cadastroPessoas = new ArrayList<>();
    }

    public void cadastrarHospede() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do hóspede: ");
        String nome = input.nextLine();
        System.out.print("Documento do hóspede: ");
        String documento = input.nextLine();
        System.out.print("Número do quarto: ");
        int numeroQuarto = input.nextInt();
        input.nextLine(); // Consumir quebra de linha
        
        Hospede hospede = new Hospede(nome, documento, numeroQuarto);
        cadastroPessoas.add(hospede);
        System.out.println("Hóspede cadastrado com sucesso!\n");
    }

    public void cadastrarFuncionario() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do funcionário: ");
        String nome = input.nextLine();
        System.out.print("Documento do funcionário: ");
        String documento = input.nextLine();
        System.out.print("Função: ");
        String funcao = input.nextLine();
        
        Funcionario funcionario = new Funcionario(nome, documento, funcao);
        cadastroPessoas.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!\n");
    }

    public void mostrarTodos() {
        if (cadastroPessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.\n");
            return;
        }
        
        System.out.println("=== PESSOAS CADASTRADAS ===");
        for (Pessoa pessoa : cadastroPessoas) {
            pessoa.mostrarDados();
            System.out.println("------------------------");
        }
        System.out.println();
    }

    public List<Pessoa> getCadastroPessoas() {
        return cadastroPessoas;
    }
}
