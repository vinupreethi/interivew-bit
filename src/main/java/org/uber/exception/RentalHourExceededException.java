package org.uber.exception;

public class RentalHourExceededException extends Throwable {
    public RentalHourExceededException(String msg) {
        super(msg);
    }
}
