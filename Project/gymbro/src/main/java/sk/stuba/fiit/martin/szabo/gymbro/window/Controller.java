package sk.stuba.fiit.martin.szabo.gymbro.window;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

// TODO Remove this class

public class Controller{
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick(){
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}