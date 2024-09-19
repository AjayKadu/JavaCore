package com.sunbeam;

public class OverratedException extends Exception {

    private String message;

    public OverratedException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
