package br.com.appBiblioteca.service;

import br.com.appBiblioteca.service.exceptions.*;
import java.util.Scanner;

public class ValidacaoService {
    
    public static int validarInteiro(Scanner input, String mensagem) throws EntradaInvalidaException {
        try {
            System.out.print(mensagem);
            String entrada = input.nextLine();
            return Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            throw new EntradaInvalidaException("Valor inválido! Digite um número inteiro válido.");
        }
    }
    
    public static double validarDouble(Scanner input, String mensagem) throws EntradaInvalidaException {
        try {
            System.out.print(mensagem);
            String entrada = input.nextLine();
            return Double.parseDouble(entrada);
        } catch (NumberFormatException e) {
            throw new EntradaInvalidaException("Valor inválido! Digite um número decimal válido.");
        }
    }
    
    public static String validarString(Scanner input, String mensagem) throws EntradaInvalidaException {
        System.out.print(mensagem);
        String entrada = input.nextLine().trim();
        if (entrada.isEmpty()) {
            throw new EntradaInvalidaException("Nome não pode estar vazio!");
        }
        return entrada;
    }
    
    public static int validarOpcaoMenu(Scanner input, String mensagem, int min, int max) throws EntradaInvalidaException {
        int opcao = validarInteiro(input, mensagem);
        if (opcao < min || opcao > max) {
            throw new EntradaInvalidaException("Opção inválida! Escolha um número entre " + min + " e " + max + ".");
        }
        return opcao;
    }
    
    public static int validarQuantidade(Scanner input, String mensagem, int quantidadeDisponivel) throws EntradaInvalidaException, EstoqueInsuficienteException {
        int quantidade = validarInteiro(input, mensagem);
        if (quantidade <= 0) {
            throw new EntradaInvalidaException("Quantidade deve ser maior que zero!");
        }
        if (quantidade > quantidadeDisponivel) {
            throw new EstoqueInsuficienteException("Quantidade solicitada (" + quantidade + ") é maior que a disponível (" + quantidadeDisponivel + ").");
        }
        return quantidade;
    }
    
    public static double validarPreco(Scanner input, String mensagem) throws EntradaInvalidaException {
        double preco = validarDouble(input, mensagem);
        if (preco < 0) {
            throw new EntradaInvalidaException("Preço não pode ser negativo!");
        }
        return preco;
    }
    
    public static int validarPaginas(Scanner input, String mensagem) throws EntradaInvalidaException {
        int paginas = validarInteiro(input, mensagem);
        if (paginas <= 0) {
            throw new EntradaInvalidaException("Número de páginas deve ser maior que zero!");
        }
        return paginas;
    }
}
