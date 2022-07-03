package com.scriptwritr.model;

import java.util.LinkedList;
import java.util.List;

public class SceneHeadingProduct extends AbstractProduct {

    private final List<String> sceneHeadingProducts;

    public SceneHeadingProduct() {
        this.sceneHeadingProducts = new LinkedList<>();
    }

    public void addToSceneHeading(String sceneHeading) {
        sceneHeadingProducts.add(sceneHeading);
    }

    @Override
    public void display() {
        for (String sceneHeading : this.sceneHeadingProducts) {
            System.out.println(sceneHeading.toString());
        }
    }

    @Override
    public String toString() {
        return "\n" + sceneHeadingProducts.toString();
    }
}
