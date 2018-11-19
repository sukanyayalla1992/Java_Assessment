package com.example.demo.exceptions;

public class StudentIdMissingException extends RuntimeException{
    public StudentIdMissingException(String message, Throwable cause) {
        super(message, cause);
    }
}
