package com.scriptwritr;

import com.scriptwritr.model.ContentType;
import com.scriptwritr.model.skins.CustomPane;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * @author Carl Karama
 */
public class Scriptwritr extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private final double PAGE_HEIGHT = 700; // Page height in points
    private final int MAX_LINES_PER_PAGE = 40; // Maximum number of lines per page
    @Override
    public void start(Stage primaryStage) {

        VBox pagesContainer = new VBox();
        pagesContainer.setSpacing(10);
        pagesContainer.setPadding(new Insets(72 / 25.4, 72 / 25.4, 72 / 25.4, 72 / 25.4)); // 1 inch margins

        // Add initial page
        pagesContainer.getChildren().add(createPage());

        // ScrollPane to scroll through pages
        ScrollPane scrollPane = new ScrollPane(pagesContainer);
        scrollPane.setFitToWidth(true);

        // Add button to add new page
        Button addPageButton = new Button("Add Page");
        addPageButton.setOnAction(event -> pagesContainer.getChildren().add(createPage()));

        VBox root = new VBox(scrollPane, addPageButton);

        Scene scene = new Scene(root, 612, 792);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Screenplay Word Processor");
        primaryStage.show();
    }

    private VBox createPage() {
        VBox page = new VBox();
        page.setSpacing(1.5 * 12); // Double-spaced
        page.setPadding(new Insets(0, 0, 0, 0)); // Bottom padding for new line
        //page.setStyle("-fx-background-color: white; -fx-padding: 10; -fx-border-color: black; -fx-border-width: 1px;");

        CustomPane customPane = new CustomPane();

        // Add textarea for dynamic input
        TextArea content = new TextArea();
        content.setPrefHeight(PAGE_HEIGHT); // Set initial rows
        content.setWrapText(true); // Enable text wrapping
        content.setFont(Font.font("Courier New", FontWeight.BOLD, 12.0)); // Courier New, 12-point size

        setContentType(ContentType.ACTION_LINE, content);

        // Listen for Enter key press within the content TextArea
        content.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER && !event.isShiftDown()) {
                if (content.getParagraphs().size() >= MAX_LINES_PER_PAGE) {

                    System.out.println(content.getParagraphs().size());
                    // Create a new page
                    VBox newPage = createPage();
                    page.getChildren().add(newPage);
                    newPage.requestFocus(); // Keep focus on the TextArea
                }
            }
            System.out.println("Running...");
            updateContentType(content);
        });

        // Show context menu on right-click
        content.setOnMouseClicked(event -> {
            if (event.getButton() == MouseButton.SECONDARY) {
                showContextMenu(content, event);
            }
        });

        customPane.getChildren().add(content);
        page.getChildren().add(customPane);

        return page;
    }

    private void setContentType(ContentType contentType, TextArea textArea) {
        switch (contentType) {
            case ACTION_LINE:
                textArea.setStyle("-fx-alignment: center;");
                break;
            case DIALOGUE:
                textArea.setStyle("-fx-indent: 20;");
                break;
            case CHARACTER:
                textArea.setStyle("-fx-alignment: center;");
                break;
            case SCENE_HEADER:
                textArea.setStyle("-fx-alignment: center; -fx-font-weight: bold;");
                break;
        }
    }

    private void updateContentType(TextArea textArea) {
        setContentType(ContentType.ACTION_LINE, textArea);
    }

    private void showContextMenu(TextArea content, MouseEvent e) {
        ContextMenu contextMenu = new ContextMenu();
        MenuItem sceneTitleItem = new MenuItem("Scene Title");
        MenuItem actionLinesItem = new MenuItem("Action Lines");
        MenuItem characterHeaderItem = new MenuItem("Character Header");
        MenuItem dialogueItem = new MenuItem("Dialogue");

        contextMenu.getItems().addAll(sceneTitleItem, actionLinesItem, characterHeaderItem, dialogueItem);

        // Handle menu item selection
        sceneTitleItem.setOnAction(event -> {
            // Handle adding scene title
            content.appendText("\n\nScene Title:");
        });

        actionLinesItem.setOnAction(event -> {
            // Handle adding action lines
            content.appendText("\n\nAction Lines:");
        });

        characterHeaderItem.setOnAction(event -> {
            // Handle adding character header
            content.appendText("\n\nCharacter Header:");
        });

        dialogueItem.setOnAction(event -> {
            // Handle adding dialogue
            content.appendText("\n\nDialogue:");
        });

        contextMenu.show(content, e.getSceneX(), e.getSceneY());
    }
}
