package com.scriptwritr.model.builder.products;

import com.scriptwritr.model.builder.abstractions.AbstractProduct;

import java.util.LinkedList;

public class SceneProduct extends AbstractProduct {

    private final LinkedList<String> sceneElements;

    public SceneProduct() {
        sceneElements = new LinkedList<>();
    }

    public void add(String element) {
        sceneElements.addLast(element);
    }

    @Override
    public void display() {
        for (String element : this.sceneElements) {
            System.out.println(element);
        }
    }
}
