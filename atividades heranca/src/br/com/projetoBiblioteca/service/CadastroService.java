package br.com.projetoBiblioteca.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import br.com.projetoBiblioteca.model.*;

public class CadastroService {
    private List<Pessoa> cadastroPessoas;

    public CadastroService() {
        cadastroPessoas = new ArrayList<>();
    }

    public void cadastrarLeitor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do leitor: ");
        String nome = input.nextLine();
        System.out.print("CPF do leitor: ");
        String cpf = input.nextLine();
        System.out.print("Matrícula: ");
        String matricula = input.nextLine();
        
        Leitor leitor = new Leitor(nome, cpf, matricula);
        cadastroPessoas.add(leitor);
        System.out.println("Leitor cadastrado com sucesso!\n");
    }

    public void cadastrarBibliotecario() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do bibliotecário: ");
        String nome = input.nextLine();
        System.out.print("CPF do bibliotecário: ");
        String cpf = input.nextLine();
        System.out.print("Turno: ");
        String turno = input.nextLine();
        
        Bibliotecario bibliotecario = new Bibliotecario(nome, cpf, turno);
        cadastroPessoas.add(bibliotecario);
        System.out.println("Bibliotecário cadastrado com sucesso!\n");
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
