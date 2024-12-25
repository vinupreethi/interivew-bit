package org.uber.models;

public class Courier {
    private int parcelId;
    private Location desination;

    public Courier(int parcelId, Location desination) {
        this.parcelId= parcelId;
        this.desination = desination;
    }

    public int getParcelId() {
        return parcelId;
    }

    public void setParcelId(int parcelId) {
        this.parcelId = parcelId;
    }

    public Location getDesination() {
        return desination;
    }

    public void setDesination(Location desination) {
        this.desination = desination;
    }
}
