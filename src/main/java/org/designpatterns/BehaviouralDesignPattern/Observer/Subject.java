package org.designpatterns.BehaviouralDesignPattern.Observer;

public interface Subject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
