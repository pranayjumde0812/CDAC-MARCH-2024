package com.app.custom_exception;

public class EmailTypeMisMatchException extends Exception {
    public EmailTypeMisMatchException(String message) {
        super(message);
    }
}
