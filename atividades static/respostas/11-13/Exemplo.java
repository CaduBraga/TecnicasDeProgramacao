public class Exemplo {
    public static int contador = 0;

    public Exemplo() {
        contador++;
    }

    public static void main(String[] args) {
        new Exemplo();
        new Exemplo();
        System.out.println(Exemplo.contador);
    }
}

/* Será impresso 2. Pois o static faz a variável ser 
compartilhada entre todas as instâncias */