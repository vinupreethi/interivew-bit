package org.designpatterns.BehaviouralDesignPattern.ChainOfResponsibility;

public class SupportLevelThree extends Handlers{
    @Override
    public void handleRequestNow(Request request) {
        if(request.getSeverity()==3)
            System.out.println("Support level 3 is handling request");
        else {
            handlers.handleRequestNow(request);
        }
    }
}
