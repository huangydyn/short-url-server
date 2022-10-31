package com.template.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

/**
 * project standard exception
 */
@Getter
public class ErrorResponseException extends RuntimeException {

    private static final long serialVersionUID = 1296923009039947638L;

    private HttpStatus httpStatus;

    private String message;

    private List<String> detailErrors;

    public ErrorResponseException(HttpStatus httpStatus, String message) {
        super();
        this.httpStatus = httpStatus;
        this.message = message;
        this.detailErrors = new ArrayList<>();
    }

    public ErrorResponseException(HttpStatus httpStatus, String message, List<String> detailErrors) {
        super();
        this.httpStatus = httpStatus;
        this.message = message;
        this.detailErrors = detailErrors;
    }
}
