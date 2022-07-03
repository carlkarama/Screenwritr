package com.scriptwritr.model.builder.builders;

import com.scriptwritr.model.Action;
import com.scriptwritr.model.Dialog;
import com.scriptwritr.model.Parenthetical;
import com.scriptwritr.model.Transition;
import com.scriptwritr.model.builder.interfaces.SceneBuilder;
import com.scriptwritr.model.builder.interfaces.SceneCharacterBuilder;
import com.scriptwritr.model.builder.interfaces.SceneHeadingBuilder;
import com.scriptwritr.model.builder.products.SceneProduct;

public class Scene implements SceneBuilder {

    private int sceneID;
    private SceneProduct sceneProduct = new SceneProduct();

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
    public Scene buildSceneActionLine(Action action) {
        this.sceneProduct.add(action.getAction());
        return this;
    }

    @Override
    public Scene buildSceneParenthetical(Parenthetical parenthetical) {
        this.sceneProduct.add(parenthetical.getWrylie());
        return this;
    }

    @Override
    public Scene buildSceneDialogue(Dialog dialog) {
        this.sceneProduct.add(dialog.getDialog());
        return this;
    }

    @Override
    public Scene buildSceneTransition(Transition transition) {
        this.sceneProduct.add(Transition.valueOf(transition.name()).toString());
        return this;
    }

    @Override
    public Scene buildSceneCharacter(SceneCharacterBuilder sceneCharacterBuilder) {
        this.sceneProduct.add(sceneCharacterBuilder.getCharacter().toString());
        return this;
    }

    @Override
    public Scene buildSceneHeading(SceneHeadingBuilder sceneHeadingBuilder) {
        this.sceneProduct.add(sceneHeadingBuilder.getSceneHeading().toString());
        return this;
    }

    public void setSceneProduct(SceneProduct sceneProduct) {
        this.sceneProduct = sceneProduct;
    }

    @Override
    public SceneProduct getSceneProduct() {
        return this.sceneProduct;
    }
}
