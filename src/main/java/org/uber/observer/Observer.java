package org.uber.observer;

import org.uber.models.Ride;
import org.uber.services.Driver;

public interface Observer {
    void update(Driver driver, Ride ride);

}
