package br.com.lista_list.views;

import java.util.Scanner;
import br.com.lista_list.model.AnimalDeEstimacao;

public class ViewAnimal {
    private AnimalDeEstimacao animal;

    public ViewAnimal(AnimalDeEstimacao animal) {
        this.animal = animal;
    }

    public void preencherDados(Scanner scanner) {
        System.out.print("Espécie: ");
        animal.setEspecie(scanner.nextLine());
        System.out.print("Raça: ");
        animal.setRaca(scanner.nextLine());
        System.out.print("Idade (anos): ");
        animal.setIdade(scanner.nextInt());
        System.out.print("Peso (kg): ");
        animal.setPeso(scanner.nextDouble());
        scanner.nextLine();
    }

    public void imprimirDados() {
        System.out.println("Informações do Animal de Estimação:");
        System.out.println("Espécie: " + animal.getEspecie());
        System.out.println("Raça: " + animal.getRaca());
        System.out.println("Idade: " + animal.getIdade() + " anos");
        System.out.printf("Peso: %.2fkg\n", animal.getPeso());
    }
}