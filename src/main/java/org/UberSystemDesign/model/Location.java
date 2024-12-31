package org.UberSystemDesign.model;

public class Location {
    private double latitude;
    private double  longitude;
    private String city;
    public Location(double  latitude,double  longitude,String city) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.city=city;
    }

    public Location() {

    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public double  getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
