package com.example.kurs2;

import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import static sun.jvm.hotspot.ci.ciKlass.nameField;

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
    private TextField signUpAdress;

    @FXML
    void initialize() {
        assert authSingUpButton != null : "fx:id=\"authSingUpButton\" was not injected: check your FXML file 'signUp.fxml'.";
        assert loginField != null : "fx:id=\"loginField\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpLogin != null : "fx:id=\"signUpLogin\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpName != null : "fx:id=\"signUpName\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpPassword != null : "fx:id=\"signUpPassword\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpPhone != null : "fx:id=\"signUpPhone\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpAdress != null : "fx:id=\"signUpPost\" was not injected: check your FXML file 'signUp.fxml'.";
        private void signUpNewUser() {
            try {
                DatabaseHandler dbHandler = new DatabaseHandler();
                User user = new User(signUpLogin.getText(), signUpPassword.getText(), 1, signUpName.getText(), signUpAdress.getText(), signUpPhone.getText());
                dbHandler.signup(user);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            } catch (InvalidKeySpecException e) {
                throw new RuntimeException(e);
            }
        }


//        DatabaseHandler dbHandler = new DatabaseHandler();
//        authSingUpButton.setOnAction(event ->{
//            dbHandler.singUpUser(signUpName.getText());
//                });
        //
    }

}