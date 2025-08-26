# Sistema de Hotel - Prova POO

## Descrição
Sistema de gerenciamento de hotel desenvolvido em Java seguindo o padrão MVC (Model-View-Controller) simples.

## Estrutura do Projeto
```
src/
├── model/          # Classes de modelo (entidades)
│   ├── Pessoa.java
│   ├── Hospede.java
│   ├── Quarto.java
│   ├── Servico.java
│   └── Reserva.java
├── service/        # Camada de serviço (lógica de negócio)
│   └── HotelService.java
└── view/          # Interface do usuário
    ├── Interface.java
    └── Main.java
```

## Requisitos Cobertos
- ✅ **Encapsulamento**: Atributos privados com getters/setters
- ✅ **Construtores**: Construtores vazios e completos
- ✅ **List**: Uso de ArrayList para gerenciar coleções
- ✅ **toString**: Sobrescrita do método toString em todas as classes
- ✅ **try/catch**: Tratamento de exceções para entradas inválidas
- ✅ **Submenus**: Sistema de menus hierárquicos
- ✅ **instanceof**: Demonstração de verificação de tipos
- ✅ **Herança**: Pessoa → Hospede
- ✅ **Agregação**: Reserva → Serviços (List<Servico>)

## Funcionalidades
- Cadastro de hóspedes, quartos e reservas
- Listagem e pesquisa de entidades
- Edição de dados de hóspedes
- Cancelamento de reservas
- Adição de serviços a reservas
- Cálculo automático de valores (diárias + serviços)

## Como Executar
1. Compile todos os arquivos Java:
   ```bash
   javac -d bin src/**/*.java
   ```

2. Execute a aplicação:
   ```bash
   java -cp bin view.Main
   ```

## Tecnologias Utilizadas
- Java 8+ (compatível com versões mais antigas)
- Padrão MVC
- Collections Framework (ArrayList, List)
- Streams API para operações de filtro e busca
- LocalDate para manipulação de datas

## Autor
Desenvolvido por Carlos Eduardo Braga para a disciplina de Técnicas de Programação - Prova POO