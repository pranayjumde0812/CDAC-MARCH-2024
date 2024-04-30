package com.app.custom_exception;

public class ServicePlanNotFoundException extends Exception {
    public ServicePlanNotFoundException(String message) {
        super(message);
    }
}
