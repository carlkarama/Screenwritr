package com.scriptwritr.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

/**@implSpec The PageController mediates communication between the Scene Views and the Scene Models
 * @since beta */

public class PageController implements Initializable {

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

    /**
     * The scroll pane to scroll through multiple scenes
     */
    @FXML public ScrollPane scrollPaneScene;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void observeMouseMoved(MouseEvent mouseEvent) {
        System.out.println(mouseEvent);
    }
}
