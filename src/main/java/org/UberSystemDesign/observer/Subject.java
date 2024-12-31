package org.UberSystemDesign.observer;

import org.UberSystemDesign.model.Ride;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(Observer observer, Ride ride);
}
