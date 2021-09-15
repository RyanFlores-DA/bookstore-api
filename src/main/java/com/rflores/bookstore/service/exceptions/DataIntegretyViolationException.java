package com.rflores.bookstore.service.exceptions;

public class DataIntegretyViolationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DataIntegretyViolationException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataIntegretyViolationException(String message) {
        super(message);
    }

}
