package br.com.projetoPetshop.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import br.com.projetoPetshop.model.*;

public class CadastroService {
    private List<Pessoa> cadastroPessoas;

    public CadastroService() {
        cadastroPessoas = new ArrayList<>();
    }

    public void cadastrarDono() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do dono: ");
        String nome = input.nextLine();
        System.out.print("Telefone do dono: ");
        String telefone = input.nextLine();
        System.out.print("Nome do pet: ");
        String nomePet = input.nextLine();
        
        Dono dono = new Dono(nome, telefone, nomePet);
        cadastroPessoas.add(dono);
        System.out.println("Dono cadastrado com sucesso!\n");
    }

    public void cadastrarVeterinario() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do veterinário: ");
        String nome = input.nextLine();
        System.out.print("Telefone do veterinário: ");
        String telefone = input.nextLine();
        System.out.print("Registro profissional: ");
        String registroProfissional = input.nextLine();
        
        Veterinario veterinario = new Veterinario(nome, telefone, registroProfissional);
        cadastroPessoas.add(veterinario);
        System.out.println("Veterinário cadastrado com sucesso!\n");
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
