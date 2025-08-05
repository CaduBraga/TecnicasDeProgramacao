package br.com.projetoCinema.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import br.com.projetoCinema.model.*;

public class CadastroService {
    private List<Pessoa> cadastroPessoas;

    public CadastroService() {
        cadastroPessoas = new ArrayList<>();
    }

    public void cadastrarCliente() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do cliente: ");
        String nome = input.nextLine();
        System.out.print("Email do cliente: ");
        String email = input.nextLine();
        System.out.print("Tipo de ingresso: ");
        String tipoIngresso = input.nextLine();
        
        Cliente cliente = new Cliente(nome, email, tipoIngresso);
        cadastroPessoas.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!\n");
    }

    public void cadastrarFuncionario() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do funcionário: ");
        String nome = input.nextLine();
        System.out.print("Email do funcionário: ");
        String email = input.nextLine();
        System.out.print("Cargo: ");
        String cargo = input.nextLine();
        
        Funcionario funcionario = new Funcionario(nome, email, cargo);
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
