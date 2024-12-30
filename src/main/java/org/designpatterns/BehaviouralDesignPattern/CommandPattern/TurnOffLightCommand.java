package org.designpatterns.BehaviouralDesignPattern.CommandPattern;

public class TurnOffLightCommand implements Command{
    @Override
    public void executeCommand() {
        TurnOff();
    }

    public void TurnOff()
    {
        System.out.println("Turn off");
    }
}
