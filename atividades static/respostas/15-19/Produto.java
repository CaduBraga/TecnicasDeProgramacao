public class Produto {
    String nome;
    static double preco;

    public static void mostrarPreco() {
        System.out.println(preco);
    }
}

/* 
 O código não está correto. O problema está no método mostrarPreco() que é estático
 tentando acessar a variável de instância 'preco'. Para corrigir, temos duas opções:
 Tornar o método não estático ou tornar a variável preco estática (isso que foi feito)
 */ 