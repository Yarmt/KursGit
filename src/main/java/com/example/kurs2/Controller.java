package com.example.kurs2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
        loginSingUpButton.setOnAction(event -> {
            loginSingUpButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("signUp.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

    }

}
