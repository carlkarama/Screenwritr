package com.scriptwritr.model;

/**
 * The SceneProduct is the Scene.
 */
public class Scene implements SceneBuilderInterface {

    private int sceneID;
    private final SceneProduct sceneProduct = new SceneProduct();

    public Scene(int sceneID) {
        this.sceneID = sceneID;
    }

    public int getSceneID() {
        return sceneID;
    }

    public void setSceneID(int sceneID) {
        this.sceneID = sceneID;
    }

    @Override
    public Scene buildActionLine(ActionLine actionLine) {
        sceneProduct.add(actionLine.getActionLine());
        return this;
    }

    @Override
    public Scene buildSceneHeading(SceneHeadingBuilder sceneHeadingBuilder) {
        sceneProduct.add(sceneHeadingBuilder.getSceneHeading().toString());
        return this;
    }

    @Override
    public Scene buildCharacter(Character character) {
        sceneProduct.add(character.getCharacterFirstName());
        return this;
    }

    @Override
    public Scene buildParenthetical(Parenthetical parenthetical) {
        sceneProduct.add(parenthetical.getParenthetical());
        return this;
    }

    @Override
    public Scene buildDialogue(Dialogue dialogue) {
        sceneProduct.add(dialogue.getDialogue());
        return this;
    }

    @Override
    public Scene buildTransition(Transition transition) {
        sceneProduct.add(Transition.valueOf(transition.name()).toString().toUpperCase());
        return this;
    }

    @Override
    public SceneProduct getScene() {
        return sceneProduct;
    }
}
