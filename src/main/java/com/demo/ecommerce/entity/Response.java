package com.demo.ecommerce.entity;

public class Response {

    private String message;
    private String httpCode;

    public Response() {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(String httpCode) {
        this.httpCode = httpCode;
    }

    @Override
    public String toString() {
        return "Response{" +
                "message='" + message + '\'' +
                ", httpCode='" + httpCode + '\'' +
                '}';
    }

    public Response(String message, String httpCode) {
        this.message = message;
        this.httpCode = httpCode;
    }
}
