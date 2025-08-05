package br.com.projetoLoja.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import br.com.projetoLoja.model.*;

public class CadastroService {
    private List<Pessoa> cadastroPessoas;

    public CadastroService() {
        cadastroPessoas = new ArrayList<>();
    }

    public void cadastrarCliente() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do cliente: ");
        String nome = input.nextLine();
        System.out.print("Telefone do cliente: ");
        String telefone = input.nextLine();
        System.out.print("Preferência de pagamento: ");
        String preferenciaPagamento = input.nextLine();
        
        Cliente cliente = new Cliente(nome, telefone, preferenciaPagamento);
        cadastroPessoas.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!\n");
    }

    public void cadastrarVendedor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do vendedor: ");
        String nome = input.nextLine();
        System.out.print("Telefone do vendedor: ");
        String telefone = input.nextLine();
        System.out.print("Meta mensal: ");
        double metaMensal = input.nextDouble();
        input.nextLine(); // Consumir quebra de linha
        
        Vendedor vendedor = new Vendedor(nome, telefone, metaMensal);
        cadastroPessoas.add(vendedor);
        System.out.println("Vendedor cadastrado com sucesso!\n");
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
