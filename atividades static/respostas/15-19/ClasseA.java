public class ClasseA {
    int valor = 100;

    public  void mostrarValor() {
        System.out.println(valor);
    }
}

/* 
 O código não compila. O erro ocorre porque o método estático mostrarValor()
 está tentando acessar a variável de instância 'valor'. Para corrigir, temos duas opções:
 Tornar o método não estático (isso que foi feito) ou tornar a variável valor estática.
 */ 