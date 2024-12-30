package org.designpatterns.BehaviouralDesignPattern.CommandPattern;
public class TurnOnLightCommand implements Command {

    public void TurnOn()
    {
        System.out.println("Turn on");
    }

    @Override
    public void executeCommand() {
        TurnOn();
    }
}
