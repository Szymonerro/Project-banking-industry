package org.example.exceptions;

public class TransfersAmountLimitException extends Exception {
    public TransfersAmountLimitException(String message) {
        super(message);
    }
}
