package com.example.fxmlexampleworkshop2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Text actiontarget;

    @FXML
    private Label welcomeText;
    @FXML
    private TextField userNameEntry;
    @FXML
    private Button loginButton;

    @FXML
    protected void handleSubmitButtonAction() throws IOException {
        actiontarget.setText("Sign in button pressed!");

        //go to next scene..
        Stage stage = (Stage) loginButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomeScreen.fxml"));
        Parent root =loader.load();
        //show message to user below
        String welcomeMessage = "Hello, " +userNameEntry.getText();
        HomeScreen homeScreenController = loader.getController();
        homeScreenController.receiveInformation(welcomeMessage);

        Scene changeScene = new Scene(root, 600, 300);
        stage.setScene(changeScene);
        stage.show();

    }
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}