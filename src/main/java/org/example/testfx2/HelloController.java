package org.example.testfx2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label login;

    @FXML
    protected void onHelloButtonClicks() {
        welcomeText.setText("Welcome to JavaFX Application!");
        welcomeText.setTextFill(Color.RED);
        welcomeText.setFont(Font.font("Roboto", FontWeight.BOLD,20));
    }
    @FXML
    protected  void onLoginButtonClicks() {
        login.setText("PLEASE REGISTER FIRST");
    }
}