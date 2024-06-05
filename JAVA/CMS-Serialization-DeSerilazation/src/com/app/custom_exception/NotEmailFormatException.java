package com.app.custom_exception;

public class NotEmailFormatException extends Exception {

    public NotEmailFormatException(String message) {
        super(message);
    }
}
