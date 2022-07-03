package com.scriptwritr.model.builder.builders;

import com.scriptwritr.model.FirstName;
import com.scriptwritr.model.LastName;
import com.scriptwritr.model.builder.interfaces.SceneCharacterBuilder;
import com.scriptwritr.model.builder.products.CharacterProduct;

public class Character implements SceneCharacterBuilder {

    private int characterID;
    private CharacterProduct characterProduct = new CharacterProduct();

    public Character(int characterID) {
        this.characterID = characterID;
    }

    public int getCharacterID() {
        return characterID;
    }

    public void setCharacterID(int characterID) {
        this.characterID = characterID;
    }

    @Override
    public String toString() {
        return Integer.toString(characterID);
    }

    @Override
    public Character buildFirstName(FirstName firstName) {
        this.characterProduct.add(firstName.getFirstName());
        return this;
    }

    @Override
    public Character buildLastName(LastName lastName) {
        return null;
    }

    @Override
    public CharacterProduct getCharacter() {
        return null;
    }
}
