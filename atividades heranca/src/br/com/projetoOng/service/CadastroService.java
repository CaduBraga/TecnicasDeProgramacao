package br.com.projetoOng.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import br.com.projetoOng.model.*;

public class CadastroService {
    private List<Pessoa> cadastroPessoas;

    public CadastroService() {
        cadastroPessoas = new ArrayList<>();
    }

    public void cadastrarVoluntario() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do voluntário: ");
        String nome = input.nextLine();
        System.out.print("Cidade do voluntário: ");
        String cidade = input.nextLine();
        System.out.print("Área de atuação: ");
        String areaAtuacao = input.nextLine();
        
        Voluntario voluntario = new Voluntario(nome, cidade, areaAtuacao);
        cadastroPessoas.add(voluntario);
        System.out.println("Voluntário cadastrado com sucesso!\n");
    }

    public void cadastrarCoordenador() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do coordenador: ");
        String nome = input.nextLine();
        System.out.print("Cidade do coordenador: ");
        String cidade = input.nextLine();
        System.out.print("Responsabilidade: ");
        String responsabilidade = input.nextLine();
        
        Coordenador coordenador = new Coordenador(nome, cidade, responsabilidade);
        cadastroPessoas.add(coordenador);
        System.out.println("Coordenador cadastrado com sucesso!\n");
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
