package com.userservice.dto;


import org.springframework.http.HttpStatus;

public class APIResponseDto {

    private String message;
    private HttpStatus httpStatus;

    public APIResponseDto() {
    }

    public APIResponseDto(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}
