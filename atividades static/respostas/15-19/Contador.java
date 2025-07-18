public class Contador {
    static int valor = 10;

    public static void main(String[] args) {
        Contador a = new Contador();
        Contador b = new Contador();
        a.valor = 20;
        System.out.println(b.valor);
    }
}

/* 
 O programa imprime 20 porque a variável 'valor' é estática e compartilhada entre todas as instâncias.
 Quando alteramos seu valor através da instância 'a', a mudança afeta todas as instâncias, incluindo 'b'.
 Por isso, mesmo acessando através de b.valor, vemos o valor 20 que foi definido anteriormente.
 */ 