public class Teste {
    static int total = 0;

    public void incrementar() {
        total++;
    }

    public static void main(String[] args) {
        Teste t1 = new Teste();
        Teste t2 = new Teste();
        t1.incrementar();
        t2.incrementar();
        System.out.println(Teste.total);
    }
}

/* 
 O programa imprime 2. Isso acontece porque a variável 'total' é estática e 
 compartilhada entre todas as instâncias, ela começa com valor 0. Cada vez que o método incrementar() 
 é chamado, ele adiciona 1 ao total. Como criamos duas instâncias (t1 e t2) e chamamos o método 
 incrementar() em cada uma o valor final será 2 (0 + 1 + 1)
 */