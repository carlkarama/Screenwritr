package com.scriptwritr.model.builder.interfaces;

import com.scriptwritr.model.builder.builders.Character;
import com.scriptwritr.model.builder.products.CharacterProduct;
import com.scriptwritr.model.FirstName;
import com.scriptwritr.model.LastName;

public interface SceneCharacterBuilder {

    public Character buildFirstName(FirstName firstName);

    public Character buildLastName(LastName lastName);

    public CharacterProduct getCharacter();
}
