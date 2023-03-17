package sk.stuba.fiit.martin.szabo.gymbro;

import javafx.application.Application;
import javafx.stage.Stage;
import sk.stuba.fiit.martin.szabo.gymbro.window.Window;

/**
 * Patterns that can be implemented:
 * 1. Builder to implement it add methods that add values to object attributes. Can be used on Gym and Map classes.
 * 2. Observer Can be implemented when clicking. We can have multiple Gym objects listening on click events and when
 *    user clicks on the object then we fire off multiple events. (Hide map, Show clicked gym menu, etc.)
 * 3. MVC can be implemented by separating the object attributes from methods.
 * 4. State. I currently have no clue how to implement it. But it is supposed to replace for example a switch where
 *    if a class has atrribute where we need to do a lot of decisions on how to set it. Rather than that we can
 *    implement multiple classes for each state, and then we can auto decide the state of that attribute with the
 *    object that we assign it to.
 * 5.
 *
 */


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