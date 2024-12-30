package org.designpatterns.BehaviouralDesignPattern.ChainOfResponsibility;

public class SupportLevelTwo extends Handlers{
    @Override
    public void handleRequestNow(Request request) {
        if(request.getSeverity()==2)
            System.out.println("Support level 2 is handling request");
        else {
            handlers.handleRequestNow(request);
        }
    }
}
