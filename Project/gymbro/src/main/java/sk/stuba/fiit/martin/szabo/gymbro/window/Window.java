package sk.stuba.fiit.martin.szabo.gymbro.window;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sk.stuba.fiit.martin.szabo.gymbro.Main;

import java.io.IOException;

public class Window{

    private Stage stage = null;
    private Scene scene = null;

    private static Window instance = null;

    private Window(){}

    public void start(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("fxml/mainMenu.fxml"));

        this.setStage(stage);
        this.setScene(new Scene(fxmlLoader.load(), 1366, 768));
        stage.setScene(this.getScene());

        stage.setTitle("GymBro");
        stage.show();
    }

    public static Window getInstance(){
        if(Window.instance == null) Window.instance = new Window();
        return Window.instance;
    }

    public Stage getStage(){
        return stage;
    }

    public void setStage(Stage stage){
        this.stage = stage;
    }

    public Scene getScene(){
        return scene;
    }

    public void setScene(Scene scene){
        this.scene = scene;
    }
}
