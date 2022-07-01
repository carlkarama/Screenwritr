package com.scriptwritr.model;

public class ActionLine {

    private int actionLineID;
    private String actionLine;

    public ActionLine(int actionLineID, String actionLine) {
        this.actionLineID = actionLineID;
        this.actionLine = actionLine;
    }

    public int getActionLineID() {
        return actionLineID;
    }

    public void setActionLineID(int actionLineID) {
        this.actionLineID = actionLineID;
    }

    public String getActionLine() {
        return actionLine;
    }

    public void setActionLine(String actionLine) {
        this.actionLine = actionLine;
    }

    @Override
    public String toString() {
        return actionLine;
    }
}
