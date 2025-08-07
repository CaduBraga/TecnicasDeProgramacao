package br.com.appBiblioteca.service.exceptions;

public class ProdutoNaoEncontradoException extends Exception {
    
    public ProdutoNaoEncontradoException(String message) {
        super(message);
    }
    
    public ProdutoNaoEncontradoException(String message, Throwable cause) {
        super(message, cause);
    }
}
