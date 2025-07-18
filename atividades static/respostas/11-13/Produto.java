public class Produto {
    String nome;
    static int totalProdutos = 0;

    public Produto(String nome) {
        this.nome = nome;
        totalProdutos++;
    }

    public static void mostrarTotal() {
        System.out.println("Total: " + totalProdutos);
    }
}