package com.example.kurs2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button authSingUpButton;

    @FXML
    private AnchorPane loginField;

    @FXML
    private Button loginSingUpButton;

    @FXML
    private PasswordField passwordField;

    @FXML
    void initialize() {
        assert authSingUpButton != null : "fx:id=\"authSingUpButton\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert loginField != null : "fx:id=\"loginField\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert loginSingUpButton != null : "fx:id=\"loginSingUpButton\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert passwordField != null : "fx:id=\"passwordField\" was not injected: check your FXML file 'hello-view.fxml'.";
        authSingUpButton.setOnAction(event -> {
            System.out.println("Привет, пользователь");
        });

    }

}
