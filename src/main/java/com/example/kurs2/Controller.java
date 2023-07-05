package com.example.kurs2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private Button authSingUpButton;

    @FXML
    private AnchorPane loginField;

    @FXML
    private Button loginSingUpButton;

    @FXML
    private PasswordField passwordField;
    void intialize(){
        authSingUpButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Вы нажали на кнопку войти");
            }
        });
    }
}
