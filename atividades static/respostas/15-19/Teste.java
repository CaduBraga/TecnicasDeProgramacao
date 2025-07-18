public class Teste {
    static int x = 5;

    public static void alterar() {
        x += 10;
    }

    public static void main(String[] args) {
        alterar();
        System.out.println(x);
    }
}

/* 
 O programa imprime 15. A variável 'x' é estática e começa com valor 5.
 O método alterar() adiciona 10 ao valor atual de 'x'.
 Portanto, após chamar alterar(), 'x' terá o valor 15 (5 + 10).
 */