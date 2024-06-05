package com.app.custom_exception;

public class ServicePlanDetailsMisMatchedException extends Exception {

    public ServicePlanDetailsMisMatchedException(String message){
        super(message);
    }
}
