package org.designpatterns.BehaviouralDesignPattern.Template;

public class FootBall extends Game{
    @Override
    public void initialize() {
        System.out.println("Football is initialized");
    }

    @Override
    public void startPlay() {
        System.out.println("Football is started");
    }

    @Override
    public void endPlay() {
        System.out.println("Football is ended");
    }
}
