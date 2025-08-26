# 📚 Técnicas de Programação - CentroWeg MIDS 77

> **Professor:** Bruno da Silva de Andrade  
> **Instituição:** CentroWeg  
> **Turma:** MIDS 77  
> **Disciplina:** Técnicas de Programação  
> **Autor:** Carlos Eduardo Braga  
> **Licença:** CentroWeg Educational License – No Commercial Use

Este repositório contém todos os exercícios práticos, atividades e projetos desenvolvidos durante o curso de Técnicas de Programação, focado em Java e conceitos fundamentais de programação orientada a objetos.

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)](https://www.jetbrains.com/idea/)
[![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)](https://git-scm.com/)
[![License: Educational](https://img.shields.io/badge/License-Educational-blue.svg?style=for-the-badge)](LICENSE)

---

## 📋 **Índice**

- [🎯 Competências Desenvolvidas](#-competências-desenvolvidas)  
- [📁 Estrutura do Repositório](#-estrutura-do-repositório)  
- [🛠️ Tecnologias Utilizadas](#-tecnologias-utilizadas)  
- [📋 Conceitos Fundamentais Abordados](#-conceitos-fundamentais-abordados)  
- [🎓 Aprendizados Desenvolvidos](#-aprendizados-desenvolvidos)  
- [🚀 Como Executar os Projetos](#-como-executar-os-projetos)  
- [📊 Estatísticas do Repositório](#-estatísticas-do-repositório)  
- [📝 Observações Finais](#-observações-finais)  
- [📄 Licença](#-licença)  
- [📝 Changelog](#-changelog)  
- [🤝 Contribuição](#-contribuição)  
- [📞 Contato](#-contato)

---

## 🎯 **Competências Desenvolvidas**

O repositório conta com atividades que tem como objetivo desenvolver competências em:

- **Programação Orientada a Objetos (POO)**
- **Estruturas de dados e algoritmos**
- **Tratamento de exceções**
- **Padrões de projeto (MVC, CRUD)**
- **Boas práticas de programação**
- **Desenvolvimento de aplicações Java**

---

## 📁 **Estrutura do Repositório**

### 🔄 **1. Atividades CRUD e MVC**
**Localização:** `atividades CRUD e MVC/`

**Conteúdo:** Exercícios sobre operações CRUD (Create, Read, Update, Delete) e padrão MVC.

**Estrutura:**
```
src/br/com/atividades/
├── model/     # Entidades
├── views/     # Interface
├── service/   # Operações CRUD
└── main/      # Execução
```

**Conceitos Aplicados:**
- ✅ Operações CRUD
- ✅ Padrão MVC
- ✅ Persistência de dados
- ✅ Interface com usuário

### 🏗️ **2. Atividades de Herança**
**Localização:** `atividades heranca/`

**Conteúdo:** 10 projetos completos demonstrando conceitos de herança, encapsulamento e organização de código.

**Projetos Implementados:**
- 🏫 **ProjetoAcademia** - Sistema de cadastro de alunos e instrutores
- 📚 **ProjetoBiblioteca** - Sistema de cadastro de leitores e bibliotecários
- 🏥 **ProjetoClinica** - Sistema de cadastro de pacientes e médicos
- 🎬 **ProjetoCinema** - Sistema de cadastro de clientes e funcionários
- 🚗 **ProjetoEstacionamento** - Sistema de cadastro de veículos (carros e motos)
- 🏨 **ProjetoHotel** - Sistema de gestão hoteleira
- 🛍 **ProjetoLoja** - Sistema de cadastro de clientes e vendedores
- 🤝 **ProjetoOng** - Sistema de voluntariado
- 🐶 **ProjetoPetshop** - Sistema de cadastro de donos de pets e veterinários
- 🏫 **ProjetoEscola** - Sistema de cadastro de alunos e professores

**Conceitos Aplicados:**
- ✅ Herança (`extends`)
- ✅ Encapsulamento (`protected`, `private`)
- ✅ Organização em pacotes (`model`, `service`, `main`)
- ✅ SRP (Single Responsibility Principle)
- ✅ Métodos `mostrarDados()` com `@Override`

### 🔄 **3. Atividades Polimorfismo**
**Localização:** `atividades polimorfismo/`

**Conteúdo:** Exercícios práticos sobre polimorfismo em Java.

**Estrutura:**
```
src/br/com/atividadesPolimorfismo/
├── model/     # Classes com polimorfismo
├── view/      # Interface
├── service/   # Serviços
└── main/      # Execução
```

**Conceitos Aplicados:**
- ✅ Polimorfismo de sobreposição
- ✅ Polimorfismo de sobrecarga
- ✅ Classes abstratas
- ✅ Interfaces

### 🔧 **4. Atividades Static**
**Localização:** `atividades static/`

**Conteúdo:** Exercícios teóricos e práticos sobre membros estáticos em Java.

**Arquivos:**
- **perguntas.md** - 20 questões sobre membros estáticos
- **respostas/** - Respostas organizadas por grupos de questões
  - **1-10/** - Questões 1 a 10
  - **11-13/** - Questões 11 a 13
  - **14/** - Questão 14
  - **15-19/** - Questões 15 a 19
  - **20/** - Questão 20

**Conceitos Aplicados:**
- ✅ Métodos estáticos vs de instância
- ✅ Atributos estáticos
- ✅ Acesso a membros estáticos
- ✅ Boas práticas com `static`

### 🏆 **5. Desafio Jean**
**Localização:** `desafio jean/`

**Conteúdo:** Projeto especial seguindo padrão MVC (Model-View-Controller).

**Estrutura:**
```
src/br/com/desafioJean/
├── model/     # Classes de dados
├── view/      # Interface com usuário
├── service/   # Lógica de negócio
└── main/      # Ponto de entrada
```

**Conceitos Aplicados:**
- ✅ Padrão MVC
- ✅ Separação de responsabilidades
- ✅ Organização de código
- ✅ Interface com usuário

### 🚀 **6. Projetos**
**Localização:** `projetos/`

**Conteúdo:** Projetos completos implementando CRUD e MVC.

**Projetos:**
- 📚 **appBiblioteca** - Sistema de biblioteca
- 📖 **appCursos** - Sistema de cursos
- 🎬 **appFilmes** - Sistema de filmes
- 🍎 **appFrutaria** - Sistema de frutaria (com tratamento de exceções)
- 💊 **appSuplementos** - Sistema de suplementos

**Conceitos Aplicados:**
- ✅ CRUD completo
- ✅ Padrão MVC
- ✅ Interface gráfica
- ✅ Persistência de dados
- ✅ Validação de entrada
- ✅ Tratamento de exceções (appFrutaria)

### 🏭 **7. Prova POO - Sistema de Hotel**
**Localização:** `prova POO/`

**Conteúdo:** Projeto de prova implementando sistema de gerenciamento de hotel seguindo padrão MVC.

**Estrutura:**
```
src/br/com/provaPOO/
├── model/           # Classes de dados e herança
│   ├── Pessoa.java               # Classe base
│   ├── Hospede.java              # Herda de Pessoa
│   ├── Quarto.java               # Gerenciamento de quartos
│   ├── Servico.java              # Serviços do hotel
│   └── Reserva.java              # Reservas com serviços
├── service/         # Lógica de negócio
│   └── HotelService.java         # Serviços do hotel
├── view/            # Interface com usuário
│   ├── Interface.java            # Interface principal
│   └── Main.java                 # Ponto de entrada
└── main/            # Execução principal
```

**Funcionalidades Implementadas:**
- ✅ **Cadastro de Hóspedes** - Sistema de cadastro com herança (Pessoa → Hospede)
- ✅ **Gestão de Quartos** - Cadastro e gerenciamento de quartos
- ✅ **Sistema de Reservas** - Criação, edição e cancelamento de reservas
- ✅ **Serviços do Hotel** - Adição de serviços às reservas
- ✅ **Cálculo Automático** - Valores de diárias + serviços
- ✅ **Tratamento de Exceções** - Validação de entradas com try/catch

**Conceitos Aplicados:**
- ✅ **Herança** - Hospede herda de Pessoa
- ✅ **Encapsulamento** - Atributos privados com getters/setters
- ✅ **Agregação** - Reserva contém List<Servico>
- ✅ **Tratamento de Exceções** - Try/catch para entradas inválidas
- ✅ **Padrão MVC** - Separação clara entre Model, View e Service
- ✅ **Collections** - Uso de ArrayList para gerenciar dados
- ✅ **instanceof** - Verificação de tipos em tempo de execução

**Características Técnicas:**
- **Sistema de Menus Hierárquicos** - Submenus organizados
- **Validação de Dados** - Verificação de entradas com try/catch
- **Cálculos Automáticos** - Valores calculados dinamicamente
- **Interface Intuitiva** - Sistema de menus numerados
- **Persistência em Memória** - Listas dinâmicas para dados

### 🎓 **8. Simulado Classes**
**Localização:** `simulado classes/`

**Conteúdo:** Simulados práticos sobre classes e objetos em Java.

**Versões:**
- **Simulado 10** - Classes básicas com construtores e métodos
  - `Produto.java` - Classe de produto
  - `Principal.java` - Classe principal
- **Simulado 11** - Classes com herança e polimorfismo
  - `Aluno.java` - Classe de aluno
  - `PrincipalAluno.java` - Classe principal
- **Simulado 12** - Versão com classes simples

**Conceitos Aplicados:**
- ✅ Construtores (padrão e parametrizados)
- ✅ Getters e setters
- ✅ Métodos de instância
- ✅ Encapsulamento de dados

### 🎓 **9. Simulado POO**
**Localização:** `simulado POO/`

**Conteúdo:** Projeto de simulado completo implementando conceitos avançados de POO.

**Estrutura:**
```
src/br/com/simuladoPOO/
├── model/     # Classes de dados e herança
├── service/   # Lógica de negócio
├── view/      # Interface com usuário
└── main/      # Ponto de entrada
```

**Conceitos Aplicados:**
- ✅ Herança e Polimorfismo
- ✅ Padrão MVC
- ✅ Tratamento de exceções
- ✅ Interface com usuário
- ✅ Organização em pacotes

### ⚠️ **10. Tratamento de Exceções**
**Localização:** `tratamento excecoes/`

**Conteúdo:** Exercícios práticos sobre tratamento de exceções em Java.

**Exercícios:**
- **Exercicio1.java** - Tratamento de `NumberFormatException`
- **Exercicio2.java** - Tratamento de `ArrayIndexOutOfBoundsException`
- **Exercicio3.java** - Tratamento de `ArithmeticException`
- **Exercicio4.java** - Tratamento de múltiplas exceções

**Conceitos Aplicados:**
- ✅ Blocos `try-catch`
- ✅ Exceções específicas vs genéricas
- ✅ Tratamento de entrada de dados
- ✅ Validação de dados

---

## 🛠️ **Tecnologias Utilizadas**

- **Linguagem:** Java 22
- **IDE:** IntelliJ IDEA / Eclipse
- **Versionamento:** Git
- **Sistema Operacional:** Windows/Linux
- **Build Tool:** Scripts batch para compilação

---

## 📋 **Conceitos Fundamentais Abordados**

### **Programação Orientada a Objetos**
- ✅ **Encapsulamento** - Proteção de dados
- ✅ **Herança** - Reutilização de código
- ✅ **Polimorfismo** - Flexibilidade de comportamento
- ✅ **Abstração** - Simplificação de complexidade

### **Estruturas de Dados**
- ✅ **Arrays** - Coleções indexadas
- ✅ **Listas** - Coleções dinâmicas
- ✅ **Objetos** - Estruturas complexas

### **Tratamento de Erros**
- ✅ **Exceções** - Tratamento de erros
- ✅ **Validação** - Verificação de dados
- ✅ **Try-catch** - Controle de fluxo

### **Padrões de Projeto**
- ✅ **MVC** - Model-View-Controller
- ✅ **CRUD** - Create, Read, Update, Delete
- ✅ **Singleton** - Instância única
- ✅ **Factory** - Criação de objetos

---

## 🎓 **Aprendizados Desenvolvidos**

### **Habilidades Técnicas**
- Desenvolvimento de aplicações Java
- Implementação de padrões de projeto
- Tratamento de exceções
- Organização de código
- Debugging e resolução de problemas

### **Habilidades Conceituais**
- Pensamento orientado a objetos
- Análise e design de sistemas
- Boas práticas de programação
- Documentação de código

### **Habilidades Práticas**
- Uso de IDEs
- Versionamento com Git
- Compilação e execução
- Testes e validação

---

## 🚀 **Como Executar os Projetos**

### **Sistema de Automação Completo**

Este repositório inclui um sistema completo de automação com scripts .bat que facilitam todas as operações:

#### **🎯 Scripts Principais (pasta `scripts/`)**
- **`menu_principal.bat`** - Menu unificado com todas as opções disponíveis
- **`compilar_todos.bat`** - Compila automaticamente todos os projetos do repositório
- **`executar_projeto.bat`** - Executa projetos específicos via menu interativo
- **`limpar_bin.bat`** - Remove todos os arquivos compilados e diretórios bin
- **`verificar_java.bat`** - Verifica se o ambiente Java está configurado corretamente
- **`estatisticas_projeto.bat`** - Gera estatísticas detalhadas em tempo real

#### **✨ Benefícios da Automação**
- ⚡ **Compilação Universal** - Um comando compila todos os projetos
- 🎮 **Execução Inteligente** - Menu interativo para escolha de projetos
- 🧹 **Limpeza Automática** - Remove arquivos temporários automaticamente
- 🔍 **Verificação de Ambiente** - Checagem automática do Java
- 📊 **Estatísticas em Tempo Real** - Contagem de arquivos e projetos
- 🚫 **Tratamento de Erros** - Scripts robustos com verificações

### **Pré-requisitos**
- Java JDK 22 ou superior
- IDE Java (Eclipse, IntelliJ IDEA, VS Code)
- Git (para versionamento)

### **Compilação e Execução**
```bash
# Navegar para o diretório do projeto
cd "nome-do-projeto/src"

# Compilar
javac -d ../../bin *.java

# Executar
java -cp ../../bin br.com.nomeDoProjeto.main.MainUtil
```

### **Como Usar os Scripts:**
```bash
# Menu principal (recomendado)
scripts/menu_principal.bat

# Ou usar scripts individuais:
# Verificar ambiente Java
scripts/verificar_java.bat

# Compilar todos os projetos
scripts/compilar_todos.bat

# Executar projeto específico
scripts/executar_projeto.bat

# Limpar arquivos compilados
scripts/limpar_bin.bat

# Gerar estatísticas
scripts/estatisticas_projeto.bat
```

### **Estrutura de Compilação**
```
projeto/
├── src/           # Código fonte
├── bin/           # Classes compiladas
└── scripts/       # Scripts de automação
```

---

## 📊 **Estatísticas do Repositório**

- **Total de Projetos:** 15+
- **Total de Exercícios:** 20+
- **Linhas de Código:** 2500+
- **Conceitos Abordados:** 12+
- **Padrões Implementados:** 4+
- **Exceções Criadas:** 4 tipos customizados
- **Scripts de Automação:** 6 (sistema completo)
- **Projetos de Avaliação:** 1 (Sistema de Hotel)
- **Sistema de Automação:** Completo e integrado

---

## 📝 **Observações Finais**

Este repositório representa o trabalho desenvolvido durante a UC de Técnicas de Programação do curso de Desenvolvimento de Sistemas do CentroWeg, demonstrando a evolução no aprendizado de conceitos fundamentais de programação orientada a objetos e desenvolvimento de software.

Todos os projetos foram desenvolvidos seguindo boas práticas de programação, com código limpo, bem documentado e organizado, preparando os alunos para o mercado de trabalho.

---

## 📄 **Licença**

Este projeto está licenciado sob a **CentroWeg Educational License** - veja o arquivo [LICENSE](LICENSE) para detalhes.

### **Permissões Concedidas:**
- ✅ Visualizar, copiar ou fazer fork deste código para fins pessoais ou educacionais
- ✅ Estudar, aprender e utilizar como referência para desenvolvimento próprio
- ✅ Executar o código conforme disponibilizado neste repositório

### **Restrições:**
- ❌ Não é permitido modificar diretamente este código e redistribuí-lo como original
- ❌ Alterações só podem ser feitas em cópias pessoais ou forks, preservando referência ao código original
- ❌ Uso comercial é proibido sem autorização expressa do autor

### **Isenção de Responsabilidade:**
O software é fornecido "como está", sem garantias de qualquer tipo. Em nenhuma circunstância o autor, os professores ou a instituição serão responsáveis por quaisquer danos decorrentes do uso deste software.

---

## 📝 **Changelog**

Veja o arquivo [CHANGELOG.md](CHANGELOG.md) para um histórico detalhado de todas as mudanças no projeto.

---

## 🤝 **Contribuição**

Este é um projeto educacional desenvolvido durante o curso de Técnicas de Programação. Para contribuições ou dúvidas, entre em contato com o autor.

---

## 📞 **Contato**

- **Autor:** Carlos Eduardo Braga
- **Email:** [carlos_e_braga@estudante.sesisenai.org.br]
- **GitHub:** [CaduBraga]

---

*Última atualização: Agosto 2025* 
