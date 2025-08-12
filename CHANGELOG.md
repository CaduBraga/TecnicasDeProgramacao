# Changelog

Todas as mudanças notáveis neste projeto serão documentadas neste arquivo.

O formato é baseado em [Keep a Changelog](https://keepachangelog.com/pt-BR/1.0.0/),
e este projeto adere ao [Versionamento Semântico](https://semver.org/lang/pt-BR/).

## [1.0.0] - 2024-12-19

### Adicionado
- **Prova – Sistema de Controle WEG 2.0**
  - Módulo `prova/` com aplicação console para gestão de estoque
  - Entidades: `Equipamento`, `MotorEletrico`, `PainelControle`
  - Serviço: `EstoqueService` com cadastro, listagens, filtros e relatórios
  - Exceção checada: `QuantidadeInsuficiente` para operações de retirada
  - Interface de usuário em console: `InterfaceUsuario` com menu completo
  - Ponto de entrada: `br.com.prova.main.Main`

- **Atividades de Herança**: 10 projetos completos demonstrando conceitos de herança
  - ProjetoEscola - Sistema de cadastro de alunos e professores
  - ProjetoClinica - Sistema de cadastro de pacientes e médicos
  - ProjetoEstacionamento - Sistema de cadastro de veículos
  - ProjetoBiblioteca - Sistema de cadastro de leitores e bibliotecários
  - ProjetoHotel - Sistema de gestão hoteleira
  - ProjetoAcademia - Sistema de cadastro de alunos e instrutores
  - ProjetoCinema - Sistema de cadastro de clientes e funcionários
  - ProjetoOng - Sistema de voluntariado
  - ProjetoLoja - Sistema de cadastro de clientes e vendedores
  - ProjetoPetshop - Sistema de cadastro de donos de pets e veterinários

- **Tratamento de Exceções**: 4 exercícios práticos
  - Exercicio1.java - Tratamento de NumberFormatException
  - Exercicio2.java - Tratamento de ArrayIndexOutOfBoundsException
  - Exercicio3.java - Tratamento de ArithmeticException
  - Exercicio4.java - Tratamento de múltiplas exceções

- **Simulado de Classes**: 3 versões de simulados
  - Simulado 10 - Classes básicas com construtores e métodos
  - Simulado 11 - Classes com herança e polimorfismo
  - Simulado 12 v1 e v2 - Versões melhoradas com funcionalidades avançadas

- **Desafio Jean**: Projeto especial seguindo padrão MVC
  - Estrutura organizada em model, view, service e main
  - Implementação do padrão Model-View-Controller

- **Atividades Static**: Exercícios teóricos e práticos
  - 20 questões sobre membros estáticos
  - Respostas organizadas por grupos de questões

- **Atividades Polimorfismo**: Exercícios práticos
  - Classes com polimorfismo de sobreposição e sobrecarga
  - Implementação de classes abstratas e interfaces

- **Atividades CRUD e MVC**: Exercícios sobre operações CRUD
  - Operações Create, Read, Update, Delete
  - Padrão MVC implementado

- **Projetos CRUD e MVC**: 5 projetos completos
  - appBiblioteca - Sistema de biblioteca
  - appFilmes - Sistema de filmes
  - appFrutaria - Sistema de frutaria com tratamento de exceções
  - appSuplementos - Sistema de suplementos
  - appCursos - Sistema de cursos

### Características
- Implementação completa de Programação Orientada a Objetos
- Padrões de projeto (MVC, CRUD)
- Tratamento robusto de exceções
- Organização em pacotes (model, service, view, main)
- Código limpo e bem documentado
- Scripts de automação para compilação

### Tecnologias
- Java JDK 17
- IntelliJ IDEA / Eclipse
- Git para versionamento
- Windows/Linux

## [0.9.0] - 2024-12-18

### Adicionado
- Estrutura inicial do repositório
- Primeiros exercícios de herança
- Configuração básica do projeto

### Corrigido
- Configurações do IntelliJ IDEA
- Estrutura de diretórios
- Arquivos de configuração

## [0.8.0] - 2024-12-17

### Adicionado
- Exercícios de tratamento de exceções
- Simulados de classes
- Atividades de polimorfismo

## [0.7.0] - 2024-12-16

### Adicionado
- Projetos CRUD e MVC
- Sistema de tratamento de exceções no appFrutaria
- Scripts de compilação automática

## [0.6.0] - 2024-12-15

### Adicionado
- Atividades static
- Desafio Jean com padrão MVC
- Melhorias na documentação

## [0.5.0] - 2024-12-14

### Adicionado
- Atividades de herança completas
- Estrutura organizada em pacotes
- Implementação de SRP (Single Responsibility Principle)

## [0.4.0] - 2024-12-13

### Adicionado
- Primeiros projetos de herança
- Estrutura básica MVC
- Classes base com encapsulamento

## [0.3.0] - 2024-12-12

### Adicionado
- Exercícios básicos de POO
- Classes simples com construtores
- Métodos getters e setters

## [0.2.0] - 2024-12-11

### Adicionado
- Estrutura inicial do projeto
- Configuração do ambiente de desenvolvimento
- Primeiros exercícios práticos

## [0.1.0] - 2024-12-10

### Adicionado
- Criação do repositório
- Configuração inicial do Git
- Estrutura básica de diretórios

---

## Tipos de Mudanças

- **Adicionado** para novas funcionalidades
- **Alterado** para mudanças em funcionalidades existentes
- **Descontinuado** para funcionalidades que serão removidas em breve
- **Removido** para funcionalidades removidas
- **Corrigido** para correções de bugs
- **Segurança** para vulnerabilidades corrigidas