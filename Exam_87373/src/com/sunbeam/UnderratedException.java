package com.sunbeam;

public class UnderratedException extends Exception {

    private String message;

    public UnderratedException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
