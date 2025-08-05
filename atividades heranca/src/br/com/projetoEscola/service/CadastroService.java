package br.com.projetoEscola.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import br.com.projetoEscola.model.*;
import br.com.projetoEscola.view.Interface;

public class CadastroService {
    List<Pessoa> cadastroPessoas;

    public CadastroService() {
        cadastroPessoas = new ArrayList<>();
    }

    public CadastroService(List<Pessoa> cadastroPessoas) {
        this.cadastroPessoas = cadastroPessoas;
    }

    public void setPessoas(List<Pessoa> cadastroPessoas) {
        this.cadastroPessoas = cadastroPessoas;
    }

    public List<Pessoa> getCadastroPessoas() {
        return cadastroPessoas;
    }

    public void escolherCadastro() {
        int escolha = 0;
        while (escolha != 3) {
            escolha = Interface.escolha();
            switch (escolha) {
                case 1:
                    cadastrarProfessor();
                    break;
                case 2:
                    cadastrarAluno();
                    break;
                case 3:
                    Interface.mensagemFinal();
                    break;
                default:
                    System.out.println("Opção inválida. Escolha um número entre 1 e 3.");
            }
        }
    }

    private void cadastrarProfessor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do professor: ");
        String nome = input.nextLine();
        System.out.print("Email do professor: ");
        String email = input.nextLine();
        System.out.print("CPF do professor: ");
        String cpf = input.nextLine();
        System.out.print("Disciplina do professor: ");
        String disciplina = input.nextLine();
        Professor professor = new Professor(nome, email, cpf, disciplina);
        cadastroPessoas.add(professor);
        System.out.println("Professor cadastrado com sucesso!\n");
    }

    private void cadastrarAluno() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do aluno: ");
        String nome = input.nextLine();
        System.out.print("Email do aluno: ");
        String email = input.nextLine();
        System.out.print("CPF do aluno: ");
        String cpf = input.nextLine();
        System.out.print("Série do aluno: ");
        int serie = input.nextInt();
        input.nextLine();
        Aluno aluno = new Aluno(nome, email, cpf, serie);
        cadastroPessoas.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!\n");
    }
}