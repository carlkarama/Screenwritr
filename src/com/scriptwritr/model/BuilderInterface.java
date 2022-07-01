package com.scriptwritr.model;

/**
 * The builder interface utilises the Builder Pattern to create complex structures building a page.
 * The page can have many elements which are optional.
 * @author Carl Karama
 * @version Beta
 */
public interface BuilderInterface {

    /**
     * Builds an Action Line. Outlines all the action in the story, as well as describe the locations, the characters,
     * and any key items, objects, creatures, machinery and so on that require emphasis.
     * @param actionLine
     *        A description to consolidate the readers understanding of the character at a specific point in time.
     * @return Scene
     */
    public Scene buildActionLine(ActionLine actionLine);

    /**
     * Builds Scene Heading. Scene Headings are the general location headings that detail where we are in the script
     * — outside or inside (EXT. or INT.) and at which LOCATION — and whether the reader is to envision daylight
     * or darkness (DAY or NIGHT).
     * @param sceneHeading
     *        A single line containing the setting of character (INT/EXT), location, and time of day (DAY/NIGHT)
     * @return Scene
     */
    public Scene buildSceneHeading(SceneHeading sceneHeading);

    /**
     * Create character name
     * @param character
     *        First name of character
     * @return Scene
     */
    public Scene buildCharacter(Character character);

    /**
     *
     * @param parenthetical
     *        A description under character name to spell out tone, intent or action.
     * @return Scene
     */
    public Scene buildParenthetical(Parenthetical parenthetical);

    /**
     * Builds dialogue which is the expression of character's point of view and the relationships between characters.
     * @param dialogue
     *        A textual representation of the characters voice
     * @return Scene
     */
    public Scene buildDialogue(Dialogue dialogue);

    /**
     * A transition marks the change from one scene to another
     * @param transition
     *        Name of transition
     * @return Scene
     */
    public Scene buildTransition(TRANSITION transition);

    /**
     *
     * @return Product
     */
    public Product getScene();
}
