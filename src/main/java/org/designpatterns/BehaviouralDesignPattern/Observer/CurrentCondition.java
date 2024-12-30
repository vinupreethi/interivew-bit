package org.designpatterns.BehaviouralDesignPattern.Observer;

public class CurrentCondition implements Observer{
    Subject subject;
    CurrentCondition(Subject subject)
    {
        this.subject=subject;
        subject.addObserver(this);
    }
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Current conditions: " + temperature + "F degrees and "
                + humidity + "% humidity");
    }
}
