package com.example.kurs2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class RestController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView imageButtonRest;

    @FXML
    private AnchorPane loginField;

    @FXML
    void initialize() {
        assert imageButtonRest != null : "fx:id=\"imageButtonRest\" was not injected: check your FXML file 'app.fxml'.";
        assert loginField != null : "fx:id=\"loginField\" was not injected: check your FXML file 'app.fxml'.";

    }

}