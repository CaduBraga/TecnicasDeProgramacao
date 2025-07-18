# ✅ Parte 1 – Questões Teóricas (Certo, Errado ou Explique)

## Questão 1
### [Certo ou Errado]

```java
roduto.totalGeralItens();

```

O método `totalGeralItens()` é `static`. É correto chamá-lo diretamente pela classe?

## Questão 2
### [Certo ou Errado]

```java
produto1.totalGeralItens();

```

O método `totalGeralItens()` é `static`, mas está sendo chamado por uma instância (`produto1`). Isso está correto e recomendado?

## Questão 3
### [Certo ou Errado]

```java
Produto.mostrar();
```

Sabendo que o método `mostrar()` **não é estático**, essa chamada está correta?

## Questão 4
### [Certo ou Errado]

```java
produto2.mostrar();
```

Essa chamada de método não estático (`mostrar()`) a partir de um objeto está correta?

## Questão 5
### [Certo ou Errado]

```java
System.out.println(Produto.totalItens);
```

Atributo estático sendo acessado diretamente pela classe. Isso está correto?

## Questão 6
### [Certo ou Errado]

```java
System.out.println(produto1.totalItens);
```

O atributo estático `totalItens` está sendo acessado por uma instância. Isso é boa prática?

## Questão 7
### [O que acontece?]

```java
Produto produto = new Produto();
```

Sabendo que o construtor incrementa `totalItens`, o que acontece com esse valor após a criação do objeto?

## Questão 8
### [Explique]

```java
Produto.totalItens = 0;
```

Explique o impacto dessa linha. O que ocorre com o valor de `totalItens` nas demais instâncias?

## Questão 9
### [Certo ou Errado]

```java

public void mostrarTotal() {
    System.out.println(totalItens);
}
```

Método não estático acessando um atributo estático. Isso é permitido?

## Questão 10
### [Explique o erro]

```java
public static void mostrarPreco() {
    System.out.println(preco);
}
```

Sabendo que `preco` **não é estático**, explique o problema deste código.

# 💻 Parte 2 – Questões Práticas com Código

Leia cada trecho de código com atenção e **explique o que ele faz ou corrige o erro**, quando houver.

## Questão 11

```java

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

```

**Pergunta:** O que será impresso? O que o uso de `static` faz nesse exemplo?

## Questão 12

```java
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

```

```java

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz");
        Produto p2 = new Produto("Feijão");
        Produto.mostrarTotal();
    }
}

```

**Pergunta:** O método `mostrarTotal()` está correto? O que será exibido?

## Questão 13

```java
public class Teste {
    int numero = 5;

    public static void imprimirNumero() {
        System.out.println(numero);
    }
}

```

**Pergunta:** Esse código compila? Justifique.

## Questão 14

```java

public class Util {
    public static void saudacao() {
        System.out.println("Bem-vindo!");
    }
}

```

```java
ublic class Main {
    public static void main(String[] args) {
        Util.saudacao();
    }
}

```

**Pergunta:** O código está correto? O que será exibido?

## Questão 15

```java

public class Contador {
    static int valor = 10;

    public static void main(String[] args) {
        Contador a = new Contador();
        Contador b = new Contador();
        a.valor = 20;
        System.out.println(b.valor);
    }
}

```

**Pergunta:** O que será impresso? Por quê?

## Questão 16

```java
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

```

**Pergunta:** Qual será a saída? Explique o comportamento da variável `x`.

## Questão 17

```java
ic class Produto {
    String nome;
    double preco;

    public static void mostrarPreco() {
        System.out.println(preco);
    }
}

```

**Pergunta:** O código está correto? O que precisa ser ajustado?

## Questão 19

```java
public class ClasseA {
    int valor = 100;

    public static void mostrarValor() {
        System.out.println(valor);
    }
}

```

**Pergunta:** Esse código compila? Explique o erro, se houver.

## Questão 20

```java

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

```

**Pergunta:** O que será impresso? Justifique com base no uso de `static`.