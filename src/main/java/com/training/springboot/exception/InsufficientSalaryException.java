package com.training.springboot.exception;

public class InsufficientSalaryException extends RuntimeException{
    public InsufficientSalaryException(String message) {
        super(message);
    }
}
