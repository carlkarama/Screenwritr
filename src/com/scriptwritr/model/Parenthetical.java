package com.scriptwritr.model;

public class Parenthetical {

    private int wrylieID;
    private String wrylie;

    public Parenthetical(int wrylieID, String wrylie) {
        this.wrylieID = wrylieID;
        this.wrylie = wrylie;
    }

    public int getWrylieID() {
        return wrylieID;
    }

    public void setWrylieID(int wrylieID) {
        this.wrylieID = wrylieID;
    }

    public String getWrylie() {
        return wrylie;
    }

    public void setWrylie(String wrylie) {
        this.wrylie = wrylie;
    }

    @Override
    public String toString() {
        return wrylie;
    }
}
