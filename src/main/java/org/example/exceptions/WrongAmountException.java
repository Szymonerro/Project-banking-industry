package org.example.exceptions;

public class WrongAmountException extends Exception {

    public WrongAmountException(String message) {
        super(message);
    }
}