package br.com.appSuplementos.service.exceptions;

public class EntradaInvalidaException extends Exception {
    
    public EntradaInvalidaException(String message) {
        super(message);
    }
    
    public EntradaInvalidaException(String message, Throwable cause) {
        super(message, cause);
    }
}
