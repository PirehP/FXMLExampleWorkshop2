package com.example.fxmlexampleworkshop2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeScreen {
    @FXML
    Label welcomeMessage;

    public void receiveInformation(String information)
    {
        welcomeMessage.setText(information);
    }
}
