package com.scriptwritr.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class HomeController {

    /**
     * A control that holds the writers scene
     */
    @FXML private TextArea page;

    /**
     * Main layout that holds the page
     */
    @FXML private AnchorPane homeAnchorPane;



    public HomeController() {

    }

    public void observeMouseMoved(MouseEvent mouseEvent) {
        System.out.println(mouseEvent);
    }
}
