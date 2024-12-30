package org.designpatterns.BehaviouralDesignPattern.CommandPattern;

public class Remote {
    Command command;

    Remote(Command command) {
        this.command= command;
    }

    public void execute()
    {
        command.executeCommand();
    }
}
