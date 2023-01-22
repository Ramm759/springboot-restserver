package com.bnguimgo.springbootrestserver.exceptions;

import org.springframework.http.HttpStatus;

public class BusinessResourceException extends Exception {
    public BusinessResourceException(String typeErreur, String message, HttpStatus httpStatus) {
        // TODO
        super();
    }
}
