package sk.stuba.fiit.martin.szabo.gymbro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application{

    private static Stage stage;

    @Override
    public void start(Stage stage) throws IOException{
        this.stage = stage;

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("fxml/mainMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("GymBro");
        stage.setScene(scene);
        stage.show();


    }

    public static Stage getStage(){
        return stage;
    }

    public static void setStage(Stage stage){
        Main.stage = stage;
    }

    public static void main(String[] args){
        launch();
    }
}