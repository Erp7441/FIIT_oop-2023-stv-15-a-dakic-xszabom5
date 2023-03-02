package sk.stuba.fiit.martin.szabo.gymbro;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController{
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick(){
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}