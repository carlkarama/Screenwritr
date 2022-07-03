package com.scriptwritr.model;

public class Location {

    private int locationID;
    private String location;

    public Location(int locationID, String location) {
        this.locationID = locationID;
        this.location = location;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public String getLocation() {
        return location.toUpperCase();
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return location;
    }
}
