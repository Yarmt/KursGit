package com.example.kurs2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class signUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button authSingUpButton;

    @FXML
    private AnchorPane loginField;

    @FXML
    private TextField signUpLogin;

    @FXML
    private TextField signUpName;

    @FXML
    private PasswordField signUpPassword;

    @FXML
    private TextField signUpPhone;

    @FXML
    private TextField signUpPost;

    @FXML
    void initialize() {
        assert authSingUpButton != null : "fx:id=\"authSingUpButton\" was not injected: check your FXML file 'signUp.fxml'.";
        assert loginField != null : "fx:id=\"loginField\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpLogin != null : "fx:id=\"signUpLogin\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpName != null : "fx:id=\"signUpName\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpPassword != null : "fx:id=\"signUpPassword\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpPhone != null : "fx:id=\"signUpPhone\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpPost != null : "fx:id=\"signUpPost\" was not injected: check your FXML file 'signUp.fxml'.";

    }

}