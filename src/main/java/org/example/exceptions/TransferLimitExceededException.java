package org.example.exceptions;

public class TransferLimitExceededException extends Exception {

    public TransferLimitExceededException(String message) {
        super(message);
    }
}