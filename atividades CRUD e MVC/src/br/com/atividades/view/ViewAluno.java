package br.com.atividades.view;

import br.com.atividades.model.Aluno;

import java.util.Scanner;

public class ViewAluno {
    private Aluno aluno;
    public ViewAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public void preencherDados(Scanner scanner) {
        System.out.print("Nome: ");
        aluno.setNome(scanner.nextLine());
        System.out.print("Idade (anos): ");
        aluno.setIdade(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Matrícula: ");
        aluno.setMatricula(scanner.nextLine());
        System.out.print("Ano de ingresso: ");
        aluno.setAnoIngresso(scanner.nextInt());
        scanner.nextLine();
    }
    public void imprimirDados() {
        System.out.println("Informações do Aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade() + " anos");
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Ano de Ingresso: " + aluno.getAnoIngresso());
    }
}