package com.scriptwritr.model.skins;

import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;

public class CustomPane extends StackPane {
    protected void layoutChildren() {
        for (Node child : getManagedChildren()) {
            layoutInArea(child, 0, 0, getWidth(), getHeight(), 0, HPos.CENTER, VPos.CENTER);
        }
    }
}
