import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0;
        boolean entradaInvalida = true;

        while (entradaInvalida) {
            System.out.print("Digite um número inteiro: ");
            String texto = input.nextLine();

            try {
                numero = Integer.parseInt(texto);
                entradaInvalida = false;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Tente novamente.");
            }
        }
        System.out.println("Número digitado: " + numero);
        
        input.close();
    }
}