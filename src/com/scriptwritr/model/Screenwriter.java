package com.scriptwritr.model;

/**
 * The director specifying to the builder how to construct a scene
 */
public class Screenwriter {

    private BuilderInterface sceneBuilder;

    public void write(BuilderInterface sceneBuilder) {
        this.sceneBuilder = sceneBuilder;
    }
}
