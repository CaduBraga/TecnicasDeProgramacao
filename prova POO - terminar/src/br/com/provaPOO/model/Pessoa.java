package br.com.provaPOO.model;

/**
 * Classe abstrata base para pessoas do sistema.
 * Desafio: classe não instanciável com atributos e comportamentos comuns.
 */
public abstract class Pessoa {
    private String nome;
    private String documento; // RG/CPF/Passaporte
    private String telefone;

    // Construtor vazio (sem parâmetros)
    public Pessoa() {}

    // Construtor completo
    public Pessoa(String nome, String documento, String telefone) {
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
    }

    // Getters/Setters (encapsulamento)
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n"
             + "Documento: " + documento + "\n"
             + "Telefone: " + telefone;
    }
}
