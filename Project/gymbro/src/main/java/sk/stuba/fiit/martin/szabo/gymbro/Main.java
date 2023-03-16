package sk.stuba.fiit.martin.szabo.gymbro;

import javafx.application.Application;
import javafx.stage.Stage;
import sk.stuba.fiit.martin.szabo.gymbro.window.Window;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        Window window = Window.getInstance();
        window.start(primaryStage);
    }

    public static void main(String[] args){
        Application.launch();
    }
}