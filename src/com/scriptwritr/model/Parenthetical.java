package com.scriptwritr.model;

public class Parenthetical {

    private int parentheticalID;
    private String parenthetical;

    public Parenthetical(int parentheticalID, String parenthetical) {
        this.parentheticalID = parentheticalID;
        this.parenthetical = parenthetical;
    }

    public String getParenthetical() {
        return parenthetical;
    }

    public void setParenthetical(String parenthetical) {
        this.parenthetical = parenthetical;
    }

    public int getParentheticalID() {
        return parentheticalID;
    }

    public void setParentheticalID(int parentheticalID) {
        this.parentheticalID = parentheticalID;
    }

    @Override
    public String toString() {
        return "\n" + "(" + parenthetical + ")";
    }
}
