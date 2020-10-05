package com.test.services.coursedemo.exception;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class ExceptionResponse {
    private String message;
    private String details;
    private Date timestamp;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public ExceptionResponse(String message, String details, Date timestamp) {
        this.message = message;
        this.details = details;
        this.timestamp = timestamp;
    }
}
