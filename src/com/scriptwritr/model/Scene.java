package com.scriptwritr.model;

/**
 * The Product is the Scene.
 */
public class Scene implements BuilderInterface {

    private final Product product = new Product();

    @Override
    public Scene buildActionLine(ActionLine actionLine) {
        product.add(actionLine.getActionLine());
        return this;
    }

    @Override
    public Scene buildSceneHeading(SceneHeading sceneHeading) {
        product.add(sceneHeading.getSceneHeading());
        return this;
    }

    @Override
    public Scene buildCharacter(Character character) {
        product.add(character.getCharacterFirstName());
        return this;
    }

    @Override
    public Scene buildParenthetical(Parenthetical parenthetical) {
        product.add(parenthetical.getParenthetical());
        return this;
    }

    @Override
    public Scene buildDialogue(Dialogue dialogue) {
        product.add(dialogue.getDialogue());
        return this;
    }

    @Override
    public Scene buildTransition(TRANSITION transition) {
        product.add(TRANSITION.valueOf(transition.name()).toString().toUpperCase());
        return this;
    }

    @Override
    public Product getScene() {
        return product;
    }
}
