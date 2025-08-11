import java.util.Scanner;

public class PrincipalAluno {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Aluno aluno1 = new Aluno("", 0, 0.0);
		aluno1.preencherDados(input);

		System.out.println();

		Aluno aluno2 = new Aluno("", 0, 0.0);
		aluno2.preencherDados(input);

		Aluno aluno3 = new Aluno("Cadu", 17, 7.4);
		Aluno aluno4 = new Aluno("Lucas", 16, 9.8);

		aluno1.atualizarNota(9.5);
		aluno3.atualizarNota(9.3);

		System.out.println("Informações do Aluno 1:");
		aluno1.exibirDetalhes(" -> ");

		System.out.println("\nInformações do Aluno 2:");
		aluno2.exibirDetalhes(" = ");

		System.out.println("\nInformações do Aluno 3:");
		aluno3.exibirDetalhes(": ");

		System.out.println("\nInformações do Aluno 4:");
		aluno4.exibirDetalhes(" + ");
		input.close();
	}
}