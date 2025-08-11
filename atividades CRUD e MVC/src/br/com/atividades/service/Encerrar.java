package br.com.atividades.service;

public class Encerrar {
    public static void encerrarPrograma(boolean continuar) {
        System.out.println("Encerrando o programa...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("=== Programa encerrado ===");
        continuar = false;
    }
}