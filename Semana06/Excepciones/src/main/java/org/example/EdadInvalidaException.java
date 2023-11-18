package org.example;

public class EdadInvalidaException extends Exception{

    public EdadInvalidaException() {
        super("La edad ingresada es invalida, debe ser un valor positivo");
    }

    public EdadInvalidaException(String message) {
        super(message);
    }
}
