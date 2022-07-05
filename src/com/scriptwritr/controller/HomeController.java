package com.scriptwritr.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class HomeController {

    /**
     * The control that holds the writers text
     */
    @FXML public TextArea sceneTextArea;

    /**
     * The layout that holds the text area
     */
    @FXML public VBox sceneVBox;

    /**
     * The scene that holds the layout
     */
    @FXML public AnchorPane sceneAnchorPane;


    public HomeController() {

    }

    public void observeMouseMoved(MouseEvent mouseEvent) {
        System.out.println(mouseEvent);
    }
}
