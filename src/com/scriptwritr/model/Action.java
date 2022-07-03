package com.scriptwritr.model;

/**
 * A description about the characters interactions, places & key details
 */
public class Action {

    private int actionID;
    private String action;

    public Action(int actionID, String action) {
        this.actionID = actionID;
        this.action = action;
    }

    public int getActionID() {
        return actionID;
    }

    public void setActionID(int actionID) {
        this.actionID = actionID;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return action;
    }
}
