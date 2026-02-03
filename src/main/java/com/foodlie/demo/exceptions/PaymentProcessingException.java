package com.foodlie.demo.exceptions;

public class PaymentProcessingException extends RuntimeException{


    public PaymentProcessingException(String message){
        super(message);
    }

}
