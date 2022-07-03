package com.scriptwritr.model;

public class Locality {

    private int localID;
    private String locality;

    public Locality(int localID, String locality) {
        this.localID = localID;
        this.locality = locality;
    }

    public int getLocalID() {
        return localID;
    }

    public void setLocalID(int localID) {
        this.localID = localID;
    }

    public String getLocality() {
        return locality.toUpperCase();
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    @Override
    public String toString() {
        return locality.toUpperCase();
    }
}
