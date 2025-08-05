package br.com.projetoClinica.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import br.com.projetoClinica.model.*;

public class CadastroService {
    private List<Pessoa> cadastroPessoas;

    public CadastroService() {
        cadastroPessoas = new ArrayList<>();
    }

    public void cadastrarPaciente() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do paciente: ");
        String nome = input.nextLine();
        System.out.print("Telefone do paciente: ");
        String telefone = input.nextLine();
        System.out.print("Plano de saúde: ");
        String planoSaude = input.nextLine();
        
        Paciente paciente = new Paciente(nome, telefone, planoSaude);
        cadastroPessoas.add(paciente);
        System.out.println("Paciente cadastrado com sucesso!\n");
    }

    public void cadastrarMedico() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do médico: ");
        String nome = input.nextLine();
        System.out.print("Telefone do médico: ");
        String telefone = input.nextLine();
        System.out.print("Especialidade: ");
        String especialidade = input.nextLine();
        
        Medico medico = new Medico(nome, telefone, especialidade);
        cadastroPessoas.add(medico);
        System.out.println("Médico cadastrado com sucesso!\n");
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
