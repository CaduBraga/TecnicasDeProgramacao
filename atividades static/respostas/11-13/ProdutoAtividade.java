public class ProdutoAtividade {
    String nome;
    static int totalProdutos = 0;

    public ProdutoAtividade(String nome) {
        this.nome = nome;
        totalProdutos++;
    }

    public static void mostrarTotal() {
        System.out.println("Total: " + totalProdutos);
    }
}