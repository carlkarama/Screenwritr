package com.scriptwritr.model;

import java.util.LinkedList;

public class Product {

    private final LinkedList<String> sceneElements;

    public Product() {
        sceneElements = new LinkedList<>();
    }

    public void add(String element) {
        sceneElements.addLast(element);
    }

    public void displayScene() {
        for (String element : this.sceneElements) {
            System.out.println(element);
        }
    }
}
