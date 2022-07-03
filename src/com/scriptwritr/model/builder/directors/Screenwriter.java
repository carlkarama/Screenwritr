package com.scriptwritr.model.builder.directors;

import com.scriptwritr.model.builder.interfaces.SceneBuilder;

/**
 * The director specifying to the builder how to construct a scene
 */
public class Screenwriter {

    private SceneBuilder sceneBuilder;

    public void write(SceneBuilder sceneBuilder) {
        this.sceneBuilder = sceneBuilder;
    }
}
