package com.prueba.response;

public class ResponseToken {
    private String token;
    private String message; 
    public ResponseToken() {
    }


    public ResponseToken(String token, String message) {
        this.token = token;
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
