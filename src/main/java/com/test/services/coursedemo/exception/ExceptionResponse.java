package com.test.services.coursedemo.exception;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class ExceptionResponse {
    private String message;
    private Date date;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ExceptionResponse(String message, Date date) {
        this.message = message;
        this.date = date;
    }
}
