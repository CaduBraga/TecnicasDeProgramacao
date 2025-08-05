import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1 = 0, numero2 = 0;
        boolean entradaInvalida = true;

        while (entradaInvalida) {
            try {
                System.out.print("Digite o primeiro número: ");
                numero1 = Integer.parseInt(input.nextLine());

                System.out.print("Digite o segundo número: ");
                numero2 = Integer.parseInt(input.nextLine());

                entradaInvalida = false;
            } catch (NumberFormatException e) {
                System.out.println("Um dos valores está inválido. Tente novamente.");
            }
        }

        System.out.println("Soma: " + (numero1 + numero2));

        input.close();
    }
}
