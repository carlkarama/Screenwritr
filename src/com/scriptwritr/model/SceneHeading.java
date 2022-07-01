package com.scriptwritr.model;

public class SceneHeading {

    private int sceneID;
    private String sceneHeading;

    public SceneHeading(int sceneID, String scene) {
        this.sceneID = sceneID;
        this.sceneHeading = scene;
    }

    public int getSceneID() {
        return sceneID;
    }

    public void setSceneID(int sceneID) {
        this.sceneID = sceneID;
    }

    public String getSceneHeading() {
        return sceneHeading;
    }

    public void setSceneHeading(String sceneHeading) {
        this.sceneHeading = sceneHeading;
    }

    @Override
    public String toString() {
        return sceneHeading;
    }
}
