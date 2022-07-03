package com.scriptwritr.model;

/**
 * The director specifying to the builder how to construct a scene
 */
public class Screenwriter {

    private SceneBuilderInterface sceneBuilder;

    public void write(SceneBuilderInterface sceneBuilder) {
        this.sceneBuilder = sceneBuilder;
    }
}
