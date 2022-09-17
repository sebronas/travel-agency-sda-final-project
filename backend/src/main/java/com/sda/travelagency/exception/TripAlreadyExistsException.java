package com.sda.travelagency.exception;

public class TripAlreadyExistsException extends RuntimeException {

    public TripAlreadyExistsException() {
    }

    public TripAlreadyExistsException(String message) {
        super(message);
    }

    public TripAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public TripAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    public TripAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
