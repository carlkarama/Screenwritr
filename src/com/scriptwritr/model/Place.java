package com.scriptwritr.model;

public class Place {

    private int placeID;
    private String place;

    public Place(int placeID, String place) {
        this.placeID = placeID;
        this.place = place;
    }

    public int getPlaceID() {
        return placeID;
    }

    public void setPlaceID(int placeID) {
        this.placeID = placeID;
    }

    public String getPlace() {
        return place.toUpperCase();
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return place.toUpperCase();
    }
}
