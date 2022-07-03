module Scriptwritr {

    requires javafx.controls;
    requires javafx.fxml;

    opens com.scriptwritr;
    opens com.scriptwritr.view;
    opens com.scriptwritr.controller;
    opens com.scriptwritr.model;
    opens com.scriptwritr.model.builder.interfaces;
    opens com.scriptwritr.model.builder.abstractions;
    opens com.scriptwritr.model.builder.products;
    opens com.scriptwritr.model.builder.builders;
    opens com.scriptwritr.model.builder.directors;
}