package com.scriptwritr;

import com.scriptwritr.controller.HomeController;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Objects;

/**
 * @author Carl Karama
 */
public class Scriptwritr extends Application {

    private double xOffset = 0;
    private double yOffset = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/scriptwritr/view/Home.fxml"));
        Parent root = loader.load();
        HomeController homeController = loader.getController();
        Scene homeScene = new Scene(root);
        stage.setTitle("Scriptwritr");
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(homeScene);
        stage.show();

        homeController.sceneTextArea.setOnKeyPressed(keyEvent -> {
            System.out.println(keyEvent.getCode().toString());
        });

        root.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });

        root.setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() - xOffset);
            stage.setY(event.getScreenY() - yOffset);
        });
    }
}
