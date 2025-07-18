package br.com.lista_list.service;

import java.util.List;
import java.util.Scanner;

import br.com.lista_list.model.*;
import br.com.lista_list.views.*;

public class Inserir {
    public static void inserirItem(Scanner scanner, List<TelefoneCelular> telefoneCelular, List<TV> televisao,
            List<Casa> casa, List<Aluno> aluno, List<Livro> livro, List<AnimalDeEstimacao> animal,
            List<Bicicleta> bicicleta,
            List<Filme> filme, List<Musica> musica, List<JogoVideogame> jogo, List<BolsaDeValores> bolsa) {

        Escolhas.escolherLista();
        int listaOpcao = scanner.nextInt();
        scanner.nextLine();

        switch (listaOpcao) {
            case 1:
                TelefoneCelular novoTelefone = new TelefoneCelular();
                ViewTelefone viewTelefone = new ViewTelefone(novoTelefone);
                viewTelefone.preencherDados(scanner);
                telefoneCelular.add(novoTelefone);
                System.out.println("Telefone inserido com sucesso!");
                break;
            case 2:
                TV novaTelevisao = new TV();
                ViewTV viewTV = new ViewTV(novaTelevisao);
                viewTV.preencherDados(scanner);
                televisao.add(novaTelevisao);
                System.out.println("Item adicionado com sucesso!");
                break;
            case 3:
                Casa novaCasa = new Casa();
                ViewCasa viewCasa = new ViewCasa(novaCasa);
                viewCasa.preencherDados(scanner);
                casa.add(novaCasa);
                System.out.println("Item adicionado com sucesso!");
                break;
            case 4:
                Aluno novoAluno = new Aluno();
                ViewAluno viewAluno = new ViewAluno(novoAluno);
                viewAluno.preencherDados(scanner);
                aluno.add(novoAluno);
                System.out.println("Item adicionado com sucesso!");
                break;
            case 5:
                Livro novoLivro = new Livro();
                ViewLivro viewLivro = new ViewLivro(novoLivro);
                viewLivro.preencherDados(scanner);
                livro.add(novoLivro);
                System.out.println("Item adicionado com sucesso!");
                break;
            case 6:
                AnimalDeEstimacao novoAnimal = new AnimalDeEstimacao();
                ViewAnimal viewAnimal = new ViewAnimal(novoAnimal);
                viewAnimal.preencherDados(scanner);
                animal.add(novoAnimal);
                System.out.println("Item adicionado com sucesso!");
                break;
            case 7:
                Bicicleta novaBicicleta = new Bicicleta();
                ViewBicicleta viewBicicleta = new ViewBicicleta(novaBicicleta);
                viewBicicleta.preencherDados(scanner);
                bicicleta.add(novaBicicleta);
                System.out.println("Item adicionado com sucesso!");
                break;
            case 8:
                Filme novoFilme = new Filme();
                ViewFilme viewFilme = new ViewFilme(novoFilme);
                viewFilme.preencherDados(scanner);
                filme.add(novoFilme);
                System.out.println("Item adicionado com sucesso!");
                break;
            case 9:
                Musica novaMusica = new Musica();
                ViewMusica viewMusica = new ViewMusica(novaMusica);
                viewMusica.preencherDados(scanner);
                musica.add(novaMusica);
                System.out.println("Item adicionado com sucesso!");
                break;
            case 10:
                JogoVideogame novoJogo = new JogoVideogame();
                ViewJogo viewJogo = new ViewJogo(novoJogo);
                viewJogo.preencherDados(scanner);
                jogo.add(novoJogo);
                System.out.println("Item adicionado com sucesso!");
                break;
            case 11:
                BolsaDeValores novaBolsa = new BolsaDeValores();
                ViewBolsa viewBolsa = new ViewBolsa(novaBolsa);
                viewBolsa.preencherDados(scanner);
                bolsa.add(novaBolsa);
                System.out.println("Item adicionado com sucesso!");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}