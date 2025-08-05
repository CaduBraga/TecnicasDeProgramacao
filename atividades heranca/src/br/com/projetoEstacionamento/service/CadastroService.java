package br.com.projetoEstacionamento.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import br.com.projetoEstacionamento.model.*;

public class CadastroService {
    private List<Veiculo> cadastroVeiculos;

    public CadastroService() {
        cadastroVeiculos = new ArrayList<>();
    }

    public void cadastrarCarro() {
        Scanner input = new Scanner(System.in);
        System.out.print("Placa do carro: ");
        String placa = input.nextLine();
        System.out.print("Marca do carro: ");
        String marca = input.nextLine();
        System.out.print("Número de portas: ");
        int numeroPortas = input.nextInt();
        input.nextLine(); // Consumir quebra de linha
        
        Carro carro = new Carro(placa, marca, numeroPortas);
        cadastroVeiculos.add(carro);
        System.out.println("Carro cadastrado com sucesso!\n");
    }

    public void cadastrarMoto() {
        Scanner input = new Scanner(System.in);
        System.out.print("Placa da moto: ");
        String placa = input.nextLine();
        System.out.print("Marca da moto: ");
        String marca = input.nextLine();
        System.out.print("Cilindrada: ");
        int cilindrada = input.nextInt();
        input.nextLine(); // Consumir quebra de linha
        
        Moto moto = new Moto(placa, marca, cilindrada);
        cadastroVeiculos.add(moto);
        System.out.println("Moto cadastrada com sucesso!\n");
    }

    public void mostrarTodos() {
        if (cadastroVeiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.\n");
            return;
        }
        
        System.out.println("=== VEÍCULOS CADASTRADOS ===");
        for (Veiculo veiculo : cadastroVeiculos) {
            veiculo.mostrarDados();
            System.out.println("------------------------");
        }
        System.out.println();
    }

    public List<Veiculo> getCadastroVeiculos() {
        return cadastroVeiculos;
    }
}
