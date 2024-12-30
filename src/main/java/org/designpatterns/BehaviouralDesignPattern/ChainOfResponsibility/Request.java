package org.designpatterns.BehaviouralDesignPattern.ChainOfResponsibility;

public class Request {
    private String message;
    private int severity;

    public Request(String message, int severity) {
        this.message = message;
        this.severity = severity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }
}
