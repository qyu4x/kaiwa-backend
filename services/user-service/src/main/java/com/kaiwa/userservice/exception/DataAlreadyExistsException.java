package com.kaiwa.userservice.exception;

public class DataAlreadyExistsException extends RuntimeException{
    public DataAlreadyExistsException(String message) {
        super(message);
    }
}
