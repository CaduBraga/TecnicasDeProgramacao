package br.com.projetoAcademia.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import br.com.projetoAcademia.model.*;

public class CadastroService {
    private List<Pessoa> cadastroPessoas;

    public CadastroService() {
        cadastroPessoas = new ArrayList<>();
    }

    public void cadastrarAluno() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do aluno: ");
        String nome = input.nextLine();
        System.out.print("Idade do aluno: ");
        int idade = input.nextInt();
        input.nextLine(); // Consumir quebra de linha
        System.out.print("Objetivo: ");
        String objetivo = input.nextLine();
        
        Aluno aluno = new Aluno(nome, idade, objetivo);
        cadastroPessoas.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!\n");
    }

    public void cadastrarInstrutor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do instrutor: ");
        String nome = input.nextLine();
        System.out.print("Idade do instrutor: ");
        int idade = input.nextInt();
        input.nextLine(); // Consumir quebra de linha
        System.out.print("Especialidade: ");
        String especialidade = input.nextLine();
        
        Instrutor instrutor = new Instrutor(nome, idade, especialidade);
        cadastroPessoas.add(instrutor);
        System.out.println("Instrutor cadastrado com sucesso!\n");
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
