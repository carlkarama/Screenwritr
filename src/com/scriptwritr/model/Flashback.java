package com.scriptwritr.model;

public class Flashback {

    private int flashbackID;
    private String flashback;

    public Flashback(int flashbackID, String flashback) {
        this.flashbackID = flashbackID;
        this.flashback = flashback;
    }

    public int getFlashbackID() {
        return flashbackID;
    }

    public void setFlashbackID(int flashbackID) {
        this.flashbackID = flashbackID;
    }

    public String getFlashback() {
        return flashback.toUpperCase();
    }

    public void setFlashback(String flashback) {
        this.flashback = flashback;
    }

    @Override
    public String toString() {
        return flashback;
    }
}
