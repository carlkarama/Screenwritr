package com.scriptwritr.model.builder.interfaces;

import com.scriptwritr.model.*;
import com.scriptwritr.model.builder.builders.Scene;
import com.scriptwritr.model.builder.products.SceneProduct;

public interface SceneBuilder {

    /**
     *
     * @param action
     *        A description to consolidate the readers understanding of the character at a specific point in time.
     * @return Scene
     */
    public Scene buildSceneActionLine(Action action);

    /**
     *
     * @param parenthetical
     *        A description under character name to spell out tone, intent or action.
     * @return Scene
     */
    public Scene buildSceneParenthetical(Parenthetical parenthetical);

    /**
     * Builds dialogue which is the expression of character's point of view and the relationships between characters
     * @param dialog
     *        A textual representation of the characters voice
     * @return Scene
     */
    public Scene buildSceneDialogue(Dialog dialog);

    /**
     *
     * @param transition
     *        Name of transition
     * @return
     */
    public Scene buildSceneTransition(Transition transition);

    /**
     * Builds Scene character name. A character's name can vary depending on where it's being used. The character builder
     * allows you to configure the name depending on its use i.e. scene header, action line etc
     * @param sceneCharacterBuilder
     *        A single line containing the setting of character (INT/EXT), location, and time of day (DAY/NIGHT)
     * @return Scene
     */
    public Scene buildSceneCharacter(SceneCharacterBuilder sceneCharacterBuilder);

    /**
     *
     * @param sceneHeadingBuilder
     *        A single line containing the setting of character (INT/EXT) & or location and or time of day (DAY/NIGHT)
     * @return Scene
     */
    public Scene buildSceneHeading(SceneHeadingBuilder sceneHeadingBuilder);

    /**
     * After constructing the scene in the client class, the product returns the final scene
     * @return SceneProduct
     */
    public SceneProduct getSceneProduct();
}
