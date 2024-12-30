package org.designpatterns.BehaviouralDesignPattern.ChainOfResponsibility;

public abstract class Handlers {
    protected Handlers handlers;

    public void setNextHandler(Handlers handler) {
        this.handlers = handler;
    }

    public abstract void handleRequestNow(Request request);

}
