package com.app.custom_exception;

public class NotAlphanumericPasswordException extends Exception {
    public NotAlphanumericPasswordException(String message) {
        super(message);
    }
}
