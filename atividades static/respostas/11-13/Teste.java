public class Teste {
    static int numero = 5;
    
    public static void imprimirNumero() {
        System.out.println(numero);
    }
}

/* 
 O código não compila. O erro ocorre porque o método estático imprimirNumero() 
 está tentando acessar a variável de instância 'numero'. Para corrigir, temos duas opções:
 Tornar a variável 'numero' estática (isso que foi feito) ou tornar o método imprimirNumero() não estático.
 */