package com.gymbro;

import com.gymbro.window.Window;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Patterns:<br>
 * <p>
 * 1. Builder to implement add methods that add values to object attributes. Can be used on Gym and Map classes.<br><br>
 * <p>
 * 2. MVC can be implemented by separating the object: attributes, methods and drawming (viewing) methods into separate
 * subclasses that will be connected together to create one object.<br><br>
 * <p>
 * 3. Factory, creates instance for you without need of specifying any attributes utilize factory to create multiple
 * gyms with their diffrent attributes. Can be also used for Map but that seems to be reduntant, although it could be
 * useful for parsing.<br><br>
 * <p>
 * 4. Singleton since we want only one instance of a {@link Window}. We can limit the number of instances by creating static
 * attribute {@link Window}.window inside {@link Window} class and implementing {@link Window#getInstance()} method which will check if the attribute
 * object is created. If not create it and then return it. Else return it. Also, helpful for getting {@link Stage} and {@link javafx.scene.Scene Scene}
 * references from places where they would otherwise be unavailable.<br><br>
 */

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        Window window = Window.getInstance();
        window.start(primaryStage);
    }

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        Application.launch();
    }
}