public class Main {
    public static void main(String[] args) {
        ProdutoAtividade p1 = new ProdutoAtividade("Arroz");
        ProdutoAtividade p2 = new ProdutoAtividade("Feijão");
        ProdutoAtividade.mostrarTotal();
    }
}
// Sim, está correto. Será exibido:
// "Total: 2"