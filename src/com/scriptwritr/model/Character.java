package com.scriptwritr.model;

public class Character {

    private int characterID;
    private String characterFirstName;

    public Character(int characterID, String characterFirstName) {
        this.characterID = characterID;
        this.characterFirstName = characterFirstName;
    }

    public int getCharacterID() {
        return characterID;
    }

    public void setCharacterID(int characterID) {
        this.characterID = characterID;
    }

    public String getCharacterFirstName() {
        return characterFirstName.toUpperCase();
    }

    public void setCharacterFirstName(String characterFirstName) {
        this.characterFirstName = characterFirstName;
    }

    @Override
    public String toString() {
        return characterFirstName.toUpperCase();
    }
}
