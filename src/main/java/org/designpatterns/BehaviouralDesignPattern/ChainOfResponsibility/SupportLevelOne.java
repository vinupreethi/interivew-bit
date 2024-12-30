package org.designpatterns.BehaviouralDesignPattern.ChainOfResponsibility;

public class SupportLevelOne extends Handlers{
    @Override
    public void handleRequestNow(Request request) {
        if(request.getSeverity()==1)
            System.out.println("Support level 1 is handling request");
        else {
            handlers.handleRequestNow(request);
        }
    }
}
