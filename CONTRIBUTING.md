# Guia de Contribuição

Obrigado por considerar contribuir para este projeto educacional de Técnicas de Programação!

## Como Contribuir

### 1. Fork e Clone

1. Faça um fork deste repositório
2. Clone o fork para sua máquina local:
   ```bash
   git clone https://github.com/CaduBraga/TecnicasDeProgramacao.git
   ```

### 2. Crie uma Branch

Crie uma branch para sua contribuição:
```bash
git checkout -b feature/nova-funcionalidade
```

### 3. Desenvolva

- Mantenha o código limpo e bem documentado
- Siga os padrões de nomenclatura Java
- Adicione comentários explicativos quando necessário
- Testes seu código antes de submeter

### 4. Commit

Faça commits com mensagens descritivas:
```bash
git commit -m "Adiciona nova funcionalidade X"
```

### 5. Push e Pull Request

1. Faça push para sua branch:
   ```bash
   git push origin feature/nova-funcionalidade
   ```

2. Crie um Pull Request no GitHub

## Padrões de Código

### Java
- Use camelCase para variáveis e métodos
- Use PascalCase para classes
- Use UPPER_CASE para constantes
- Mantenha linhas com no máximo 80 caracteres
- Use 4 espaços para indentação

### Estrutura de Projetos
```
projeto/
├── src/
│   └── br/com/nomeProjeto/
│       ├── main/
│       ├── model/
│       ├── service/
│       └── view/
├── bin/
└── README.md
```

### Comentários
```java
/**
 * Classe que representa um exemplo
 * @author Seu Nome
 * @version 1.0
 */
public class Exemplo {
    // Comentário de linha única
    
    /*
     * Comentário de múltiplas linhas
     * para explicar lógica complexa
     */
}
```

## Tipos de Contribuição

### 🐛 Correção de Bugs
- Descreva o bug claramente
- Inclua passos para reproduzir
- Adicione testes se possível

### ✨ Novas Funcionalidades
- Explique a funcionalidade proposta
- Mantenha consistência com o projeto existente
- Adicione documentação

### 📚 Melhorias na Documentação
- Corrija erros de gramática
- Adicione exemplos
- Melhore a clareza

### 🎨 Melhorias de Código
- Refatore código existente
- Melhore performance
- Adicione validações

## Processo de Review

1. **Análise de Código**: Seu código será revisado
2. **Testes**: Verifique se tudo funciona
3. **Documentação**: Atualize documentação se necessário
4. **Merge**: Após aprovação, será mergeado

## Código de Conduta

- Seja respeitoso e construtivo
- Ajude outros desenvolvedores
- Mantenha o foco educacional do projeto
- Reporte problemas de forma profissional

## Contato

Para dúvidas ou sugestões:
- Abra uma issue no GitHub
- Entre em contato com o autor

---

**Obrigado por contribuir para o aprendizado mútuo!** 🎓