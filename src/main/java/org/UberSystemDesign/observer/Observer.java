package org.UberSystemDesign.observer;

import org.UberSystemDesign.model.Ride;

public interface Observer {
    void update(Ride ride);
}
