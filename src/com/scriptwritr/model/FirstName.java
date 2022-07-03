package com.scriptwritr.model;

public class FirstName {

    private int firstNameID;
    private String firstName;

    public FirstName(int firstNameID, String firstName) {
        this.firstNameID = firstNameID;
        this.firstName = firstName;
    }

    public int getFirstNameID() {
        return firstNameID;
    }

    public void setFirstNameID(int firstNameID) {
        this.firstNameID = firstNameID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return firstName;
    }
}
